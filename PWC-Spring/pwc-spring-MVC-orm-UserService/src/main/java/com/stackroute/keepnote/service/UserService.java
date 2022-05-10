package com.stackroute.keepnote.service;

import java.util.List;
import java.util.Optional;

import com.stackroute.keepnote.exceptions.UserAlreadyExistsException;
import com.stackroute.keepnote.exceptions.UserNotFoundException;
import com.stackroute.keepnote.model.User;

public interface UserService {

//	/*
//	 * Should not modify this interface. You have to implement these methods in
//	 * corresponding Impl classes
//	 */

	 void registerUser(User user) throws UserAlreadyExistsException;

	    boolean updateUser(int userId,User user) throws UserNotFoundException;

	    boolean deleteUser(int userId) throws UserNotFoundException;


	    Optional getUserById(int userId) throws UserNotFoundException;
	    
	    List<User> getAllUsers() throws UserNotFoundException;
}
