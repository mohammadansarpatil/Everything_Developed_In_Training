package com.stackroute.keepnote.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.keepnote.exceptions.UserAlreadyExistsException;
import com.stackroute.keepnote.exceptions.UserNotFoundException;
import com.stackroute.keepnote.model.User;
import com.stackroute.keepnote.repository.UserRepository;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn't currently 
* provide any additional behavior over the @Component annotation, but it's a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
@Service
public class UserServiceImpl implements UserService {

	/*
	 * Autowiring should be implemented for the UserRepository. (Use
	 * Constructor-based autowiring) Please note that we should not create any
	 * object using the new keyword.
	 */

	/*
	 * This method should be used to save a new user.Call the corresponding method
	 * of Respository interface.
	 */

//	public User registerUser(User user) throws UserAlreadyExistsException {
//
//		return null;
//	}
//
//	/*
//	 * This method should be used to update a existing user.Call the corresponding
//	 * method of Respository interface.
//	 */
//
//	public User updateUser(String userId,User user) throws UserNotFoundException {
//
//		return null;
//	}
//
//	/*
//	 * This method should be used to delete an existing user. Call the corresponding
//	 * method of Respository interface.
//	 */
//
//	public boolean deleteUser(String userId) throws UserNotFoundException {
//
//		return false;
//	}
//
//	/*
//	 * This method should be used to get a user by userId.Call the corresponding
//	 * method of Respository interface.
//	 */
//
//	public User getUserById(String userId) throws UserNotFoundException {
//
//		return null;
//	}
	
	
	@Autowired
	private UserRepository userRepo;
	List<User> lst = new ArrayList<User>();
	

	@Override
	public void registerUser(User user) throws UserAlreadyExistsException {
		userRepo.save(user);
	}
	
	@Override
	public Optional getUserById(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional lst = userRepo.findById(userId);
		return lst;	
		}

	@Override
	public boolean updateUser(int userId, User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional opt = userRepo.findById(userId);
		if(opt.isPresent()) {
			userRepo.deleteById(userId);
			userRepo.save(user);
		return true;
		}
		else
			return false;	}

	@Override
	public boolean deleteUser(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional opt = userRepo.findById(userId);
		if(opt.isPresent()) {
			userRepo.deleteById(userId);
			return true;
		}
		else
			return false;
	}

	@Override
	public List<User> getAllUsers() throws UserNotFoundException {
		// TODO Auto-generated method stub
		List<User>  lst = (List<User>) userRepo.findAll();
		return lst;
	}

	
	
	

}
