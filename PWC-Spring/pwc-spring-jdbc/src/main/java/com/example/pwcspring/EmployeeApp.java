package com.example.pwcspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApp {
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping("/")
	public String addEmployee() {
		Employee emp = new Employee("admin" , "admin@gmail.com" , "Belgaum");
		dao.insertEmployee(emp);
		return "EMPLOYEE ADDED";
	}
	

}
