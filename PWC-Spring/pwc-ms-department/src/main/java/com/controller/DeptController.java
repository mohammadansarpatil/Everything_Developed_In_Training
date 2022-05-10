package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.*;

import io.swagger.annotations.ApiOperation;

@RestController
public class DeptController {
	
	private static Map<String, List<Department>> deptDB = new HashMap<String , List<Department>>();
	static List<Department> lst = new ArrayList<Department>();

	static{
		deptDB = new HashMap<String, List<Department>>();
		Department dept = new Department("HR" , "Ansar");
		lst.add(dept);
		dept = new Department("Finance", "Rahul");
		lst.add(dept);
		deptDB.put("CRM", lst);
		
		lst = new ArrayList<Department>();
		dept= new Department("Development", "Mark");
		lst.add(dept);
		dept= new Department("Testing", "John");
		lst.add(dept);
		deptDB.put("LMS", lst);
		
	}
	
	@GetMapping("/loaddept/{project}")
	@ApiOperation(value="Load Depts with project from backend",
	notes="Basically loads stored data from mySQL database" , response=Department.class)
	public List<Department> loaddept(@PathVariable("project")String project){
		List<Department> deptlist = deptDB.get(project);
		
		if(deptlist==null) {
			deptlist = new ArrayList<Department>();
			Department dept = new Department("NA" , "NOT FOUND");
			deptlist.add(dept);
			
		}
		return deptlist;

	}
	
	@GetMapping("/loaddept")
	@ApiOperation(value="Load all Depts from backend",
	notes="Basically loads stored data from mySQL database" , response=Department.class)
		public List<Department> loaddept1(){
			return lst;
		}
		
	}
	
	

