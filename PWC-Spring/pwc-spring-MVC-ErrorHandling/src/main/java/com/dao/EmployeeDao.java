package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Employees;

@Repository
public class EmployeeDao {
	
	private static Employees list = new Employees();
	
	
	static {
		list.getEmpList().add(new Employee(1 , "admin" , "manager", "admin@email.com"));
		list.getEmpList().add(new Employee(2 , "QA" , "Testing", "QA@email.com"));

	}
	
	public Employees getAllEmpList() {
		return list;
		
	}
	
	public void addEmployee (Employee employee) {
		list.getEmpList().add(employee);
	}

}
