package com.stackroute.keepnote.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.User;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	

}
