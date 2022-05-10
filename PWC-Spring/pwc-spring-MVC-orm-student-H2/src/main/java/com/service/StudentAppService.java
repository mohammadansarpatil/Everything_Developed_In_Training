package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDao;
import com.dao.StudentAppDao;
import com.model.Login;
import com.model.Registration;
import com.model.Student;

@Service 
public class StudentAppService {


	@Autowired
	private StudentAppDao appDao;
	
	List<Student> lst = new ArrayList<Student>();

	public void addStudent(Student student) {
		appDao.save(student);
		
	}
	
	public List<Student> loadAll(){
		List<Student> lst = (List<Student> )appDao.findAll();
		return lst;
	}
	
	public boolean findStudent(Integer rollno) {
		Optional opt = appDao.findById(rollno);
		if(opt.isPresent()) {
			return true;
		}
		return false;
	}
		
	
	
	public boolean deleteStudent(Integer rollno) {
		Optional opt = appDao.findById(rollno);
		if(opt.isPresent()) {
			appDao.deleteById(rollno);
			return true;
		}
		return false;
	}
	
	public boolean updateStudent(Student stud , Integer rollno) {
		Optional opt = appDao.findById(rollno);
		if(opt.isPresent()) {
			appDao.deleteById(rollno);
			appDao.save(stud);
			return true;
		}
		return false;

}
}


