package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int rollNo;
	private String stuName;
	private String subject;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", subject=" + subject + ", marks=" + marks + "]";
	}
	public Student(int rollNo, String stuName, String subject, int marks) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.subject = subject;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
