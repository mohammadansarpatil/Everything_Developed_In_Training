package com.stackroute.keepnote.service;

import com.stackroute.keepnote.exception.ReminderNotCreatedException;
import com.stackroute.keepnote.exception.ReminderNotFoundException;
import com.stackroute.keepnote.model.Reminder;

import java.util.List;
import java.util.Optional;

public interface ReminderService {
	
	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */

    void createReminder(Reminder reminder) throws ReminderNotCreatedException;

    boolean deleteReminder(int reminderId) throws ReminderNotFoundException;

    boolean updateReminder(Reminder reminder, int reminderId) throws ReminderNotFoundException;

    Optional getReminderById(int reminderId) throws ReminderNotFoundException;

    List<Reminder> getAllReminders();
}
