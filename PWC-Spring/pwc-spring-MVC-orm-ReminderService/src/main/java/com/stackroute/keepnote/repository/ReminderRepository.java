package com.stackroute.keepnote.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.Reminder;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */
@Repository
public interface ReminderRepository extends CrudRepository<Reminder, Integer> {

}
