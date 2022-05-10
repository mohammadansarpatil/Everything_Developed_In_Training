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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.keepnote.exception.CategoryNotCreatedException;
import com.stackroute.keepnote.model.Category;
import com.stackroute.keepnote.service.CategoryServiceImpl;

/*
 * As in this assignment, we are working with creating RESTful web service, hence annotate
 * the class with @RestController annotation.A class annotated with @Controller annotation
 * has handler methods which returns a view. However, if we use @ResponseBody annotation along
 * with @Controller annotation, it will return the data directly in a serialized 
 * format. Starting from Spring 4 and above, we can use @RestController annotation which 
 * is equivalent to using @Controller and @ResposeBody annotation
 */

@RestController
@RequestMapping("/mainapp")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl service;
	
	@PostMapping("/create")
	public String register(@RequestBody Category cat) throws CategoryNotCreatedException {
		cat.getCategoryId();
		cat.getCategoryName();
		cat.getCategoryDescription();
		cat.getCategoryCreatedBy();
		cat.getCategoryCreationDate();
		
		service.createCategory(cat);
		return "Category Created";
	}
	
	@GetMapping("/loadall")
	public List<Category> loadAll(){
			List<Category> lst = service.getAllCategory();
			return lst;
	}
	
	@GetMapping("/load/{id}")
	public Optional<Category> load(@PathVariable("id")Integer id){
		Optional<Category> lst = service.getAllCategoryByUserId(id);
			return lst;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id")Integer id) {
		if(service.deleteCategory(id))
			return id + " Found and Deleted";
		else
			return id + " Not Found";
	}
	

	@PutMapping("/update/{id}")
	public String updateUser(@RequestBody Category cat , @PathVariable("id")Integer id) {
		if(service.updateCategory(cat, id)) {
			return id + " Updated";
		}
		else {
			return id + " Failed to update";
		}
		
	}
	
	
	

	/*
	 * Autowiring should be implemented for the CategoryService. (Use
	 * Constructor-based autowiring) Please note that we should not create any
	 * object using the new keyword
	 */

	/*
	 * Define a handler method which will create a category by reading the
	 * Serialized category object from request body and save the category in
	 * database. Please note that the careatorId has to be unique.This
	 * handler method should return any one of the status messages basis on
	 * different situations: 
	 * 1. 201(CREATED - In case of successful creation of the category
	 * 2. 409(CONFLICT) - In case of duplicate categoryId
	 *
	 * 
	 * This handler method should map to the URL "/api/v1/category" using HTTP POST
	 * method".
	 */
	
	/*
	 * Define a handler method which will delete a category from a database.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the category deleted successfully from
	 * database. 2. 404(NOT FOUND) - If the category with specified categoryId is
	 * not found. 
	 * 
	 * This handler method should map to the URL "/api/v1/category/{id}" using HTTP Delete
	 * method" where "id" should be replaced by a valid categoryId without {}
	 */

	
	/*
	 * Define a handler method which will update a specific category by reading the
	 * Serialized object from request body and save the updated category details in
	 * database. This handler method should return any one of the status
	 * messages basis on different situations: 1. 200(OK) - If the category updated
	 * successfully. 2. 404(NOT FOUND) - If the category with specified categoryId
	 * is not found. 
	 * This handler method should map to the URL "/api/v1/category/{id}" using HTTP PUT
	 * method.
	 */
	
	/*
	 * Define a handler method which will get us the category by a categoryId.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the category found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/category/{id}" using HTTP GET method
	 */


}
