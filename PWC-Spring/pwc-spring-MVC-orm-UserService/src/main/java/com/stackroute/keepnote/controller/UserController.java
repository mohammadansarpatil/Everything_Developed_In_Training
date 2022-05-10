package com.stackroute.keepnote.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.keepnote.exceptions.UserAlreadyExistsException;
import com.stackroute.keepnote.exceptions.UserNotFoundException;
import com.stackroute.keepnote.model.User;
import com.stackroute.keepnote.service.UserService;
import com.stackroute.keepnote.service.UserServiceImpl;

import io.swagger.annotations.ApiOperation;

/*
 * As in this assignment, we are working on creating RESTful web service, hence annotate
 * the class with @RestController annotation. A class annotated with the @Controller annotation
 * has handler methods which return a view. However, if we use @ResponseBody annotation along
 * with @Controller annotation, it will return the data directly in a serialized 
 * format. Starting from Spring 4 and above, we can use @RestController annotation which 
 * is equivalent to using @Controller and @ResposeBody annotation
 */
@RestController
@RequestMapping("/mainapp")
public class UserController {

	/*
	 * Autowiring should be implemented for the UserService. (Use Constructor-based
	 * autowiring) Please note that we should not create an object using the new
	 * keyword
	 */
	@Autowired
	private UserServiceImpl service;

	/*
	 * public UserController(UserService userService) { }
	 * 
	 * 
	 * Define a handler method which will create a specific user by reading the
	 * Serialized object from request body and save the user details in the
	 * database. This handler method should return any one of the status messages
	 * basis on different situations: 1. 201(CREATED) - If the user created
	 * successfully. 2. 409(CONFLICT) - If the userId conflicts with any existing
	 * user
	 * 
	 * This handler method should map to the URL "/user" using HTTP POST method
	 * 
	 * 
	 * 
	 * Define a handler method which will update a specific user by reading the
	 * Serialized object from request body and save the updated user details in a
	 * database. This handler method should return any one of the status messages
	 * basis on different situations: 1. 200(OK) - If the user updated successfully.
	 * 2. 404(NOT FOUND) - If the user with specified userId is not found.
	 * 
	 * This handler method should map to the URL "/api/v1/user/{id}" using HTTP PUT
	 * method.
	 * 
	 */
	/*
	 * Define a handler method which will delete a user from a database. This
	 * handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the user deleted successfully from
	 * database. 2. 404(NOT FOUND) - If the user with specified userId is not found.
	 *
	 * This handler method should map to the URL "/api/v1/user/{id}" using HTTP
	 * Delete method" where "id" should be replaced by a valid userId without {}
	 */

	/*
	 * Define a handler method which will show details of a specific user. This
	 * handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the user found successfully. 2. 404(NOT
	 * FOUND) - If the user with specified userId is not found. This handler method
	 * should map to the URL "/api/v1/user/{id}" using HTTP GET method where "id"
	 * should be replaced by a valid userId without {}
	 */
	
	
	@PostMapping("/register")
	@ApiOperation(value="REGISTER USER",
			notes="Basically Register used to database" , response=User.class)
	public String register(@RequestBody User register) throws UserAlreadyExistsException {
		service.registerUser(register);
		return register.getUserName()+" succesfully registered!";
	}
	
	@GetMapping("/loadusers")
	@ApiOperation(value="GET ALL USERS",
			notes="Basically Loads users from database" , response=User.class)
	public List<User> loadAllUsers() throws UserNotFoundException {
		List<User> user = service.getAllUsers();
		return user;
	}
	
	@GetMapping("/loadusers/{id}")
	@ApiOperation(value="GET USER BY ID",
			notes="Basically Loads users from database" , response=User.class)
	public Optional loadUsers(@PathVariable("id")int id) throws UserNotFoundException {
		Optional user = service.getUserById(id);
		return user;
	}
	
	@DeleteMapping("/deleteuser/{id}")
	@ApiOperation(value="DELETE USER BY ID",
	notes="Basically delete users from database" , response=User.class)
	public String deleteUser(@PathVariable("id") int id) throws UserNotFoundException {
		
		if(service.deleteUser(id))
		return id +"USER DELETED";
		else
			return id + "NOT PRESENT";
		
	}
	
	@PutMapping("/deleteuser/{id}")
	@ApiOperation(value="UPDATE USER BY ID",
	notes="Basically update users from database" , response=User.class)
	public String updateUser(@PathVariable("id") int id ,@RequestBody User user) throws UserNotFoundException {
		
		if(service.updateUser(id , user))
		return id +"USER UPDATED";
		else
			return id + "NOT PRESENT";
	}
	
	
}
