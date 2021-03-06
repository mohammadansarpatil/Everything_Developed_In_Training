package com.stackroute.keepnote.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * Please note that this class is annotated with @Document annotation
 * @Document identifies a domain object to be persisted to MongoDB.
 *  */
@Entity
@ApiModel(description="REMINDER MODEL")
public class Reminder {

	/*
	 * This class should have six fields
	 * (reminderId,reminderName,reminderDescription,reminderType,
	 * reminderCreatedBy,reminderCreationDate). Out of these six fields, the field
	 * reminderId should be annotated with @Id. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. The value of reminderCreationDate should not
	 * be accepted from the user but should be always initialized with the system
	 * date.
	 */
	@Id
	@GeneratedValue
	@ApiModelProperty(notes="THIS IS REMINDER ID")
	private int reminderId;
	@ApiModelProperty(notes="THIS IS REMINDER NAME")
	private String reminderName;
	@ApiModelProperty(notes="THIS IS REMAINDER DESCRIPTION")
	private String reminderDescription;
	@ApiModelProperty(notes="THIS IS REMAINDER TYPE")
	private String reminderType;
	@ApiModelProperty(notes="THIS IS REMAINDER CREATED BY")
	private String reminderCreatedBy;
	@ApiModelProperty(notes="THIS IS REMAINDER CREATION DATE")
	private String reminderCreationDate;
	@Override
	public String toString() {
		return "Reminder [reminderId=" + reminderId + ", reminderName=" + reminderName + ", reminderDescription="
				+ reminderDescription + ", reminderType=" + reminderType + ", reminderCreatedBy=" + reminderCreatedBy
				+ ", reminderCreationDate=" + reminderCreationDate + "]";
	}
	public Reminder(int reminderId, String reminderName, String reminderDescription, String reminderType,
			String reminderCreatedBy, String reminderCreationDate) {
		super();
		this.reminderId = reminderId;
		this.reminderName = reminderName;
		this.reminderDescription = reminderDescription;
		this.reminderType = reminderType;
		this.reminderCreatedBy = reminderCreatedBy;
		this.reminderCreationDate = reminderCreationDate;
	}
	public Reminder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReminderId() {
		return reminderId;
	}
	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}
	public String getReminderName() {
		return reminderName;
	}
	public void setReminderName(String reminderName) {
		this.reminderName = reminderName;
	}
	public String getReminderDescription() {
		return reminderDescription;
	}
	public void setReminderDescription(String reminderDescription) {
		this.reminderDescription = reminderDescription;
	}
	public String getReminderType() {
		return reminderType;
	}
	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}
	public String getReminderCreatedBy() {
		return reminderCreatedBy;
	}
	public void setReminderCreatedBy(String reminderCreatedBy) {
		this.reminderCreatedBy = reminderCreatedBy;
	}
	public String getReminderCreationDate() {
		return reminderCreationDate;
	}
	public void setReminderCreationDate(String reminderCreationDate) {
		this.reminderCreationDate = reminderCreationDate;
	}
	
	
	
	
	
	
	
	
	
	
	
}
