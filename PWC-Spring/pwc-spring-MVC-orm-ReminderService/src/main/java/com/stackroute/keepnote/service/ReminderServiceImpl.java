package com.stackroute.keepnote.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.keepnote.exception.ReminderNotCreatedException;
import com.stackroute.keepnote.exception.ReminderNotFoundException;
import com.stackroute.keepnote.model.Reminder;
import com.stackroute.keepnote.repository.ReminderRepository;

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
public class ReminderServiceImpl implements ReminderService {

	/*
	 * Autowiring should be implemented for the ReminderRepository. (Use
	 * Constructor-based autowiring) Please note that we should not create any
	 * object using the new keyword.
	 */

	/*
	 * This method should be used to save a new reminder.Call the corresponding
	 * method of Respository interface.
	 */
	@Autowired
	private ReminderRepository remRepo;
	
	public void createReminder(Reminder reminder) throws ReminderNotCreatedException {

		 remRepo.save(reminder);
	}

	/*
	 * This method should be used to delete an existing reminder.Call the
	 * corresponding method of Respository interface.
	 */
	@Override
	public boolean deleteReminder(int reminderId) throws ReminderNotFoundException {
		// TODO Auto-generated method stub
		Optional opt = remRepo.findById(reminderId);
		if(opt.isPresent()) {
			remRepo.deleteById(reminderId);
			return true;
		}
		return false;
	}
	

	/*
	 * This method should be used to update a existing reminder.Call the
	 * corresponding method of Respository interface.
	 */
	@Override
	public boolean updateReminder(Reminder reminder, int reminderId) throws ReminderNotFoundException {
		// TODO Auto-generated method stub
		Optional opt = remRepo.findById(reminderId);
		if(opt.isPresent()) {
			remRepo.deleteById(reminderId);
			remRepo.save(reminder);
			return true;
		}
		return false;
	}


	/*
	 * This method should be used to get a reminder by reminderId.Call the
	 * corresponding method of Respository interface.
	 */
	public Optional getReminderById(int reminderId) throws ReminderNotFoundException {
		Optional opt = remRepo.findById(reminderId);
		return opt;
	}

	/*
	 * This method should be used to get all reminders. Call the corresponding
	 * method of Respository interface.
	 */

	public List<Reminder> getAllReminders() {
		List<Reminder> lst = (List<Reminder>) remRepo.findAll();
		return lst;
	}

	

	
}
