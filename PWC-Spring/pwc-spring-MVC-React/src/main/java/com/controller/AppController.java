package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.model.Employees;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppController {
	
	@Autowired
	private EmployeeDao employeeDAO;
	
	@GetMapping(value="/loadall", produces="application/json")
	@ApiOperation(value="Load all users from backend",
	notes="Basically loads stored data from mySQL database" , response=Employee.class)
	public Employees loadAll() {
		return employeeDAO.getAllEmpList();
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUSer(@RequestBody Employee emp) {
		int id=employeeDAO.getAllEmpList().getEmpList().size()+1;
		emp.setEmpId(id);
		employeeDAO.addEmployee(emp);
		return  ResponseEntity.ok("EMP ADDED");
	}
	

}
