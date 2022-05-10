package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.Registration;
import com.model.Student;
import com.service.AppService;
import com.service.StudentAppService;

@RestController
@RequestMapping("/studentapp")
public class StudentAppController {


	@Autowired
	private StudentAppService service;
	
	@GetMapping("/loadstudents")
	public List<Student> sayHello(){
			List<Student> lst = service.loadAll();
			return lst;
	}
	
	@PostMapping("/registerstudent")
	public String registerStudent(@RequestBody Student stud) {
		stud.getStuName();
		stud.getSubject();
		stud.getMarks();
		service.addStudent(stud);
		return "Student Registered";
	}
	
	@GetMapping("/findstudent/{rollno}")
	public String findStudent(@PathVariable("rollno")Integer rollno) {
		if(service.findStudent(rollno))
			return rollno + " Found";
		else
			return rollno + " Not Found";
	}
	
	@DeleteMapping("/deletestudent/{rollno}")
	public String deleteUser(@PathVariable("rollno")Integer rollno) {
		if(service.deleteStudent(rollno))
			return rollno + " Found and Deleted";
		else
			return rollno + " Not Found";
	}
	
	@PutMapping("/updatestudent/{rollno}")
	public String updateStudent(@RequestBody Student stud, @PathVariable("rollno")Integer rollno) {
		if(service.updateStudent(stud, rollno)) {
			return rollno + " Updated";
		}
		else {
			return rollno + " Failed to update";
		}
		
	}
	
}

