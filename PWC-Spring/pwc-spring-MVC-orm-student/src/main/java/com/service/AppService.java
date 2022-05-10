package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDao;
import com.model.Login;
import com.model.Registration;

@Service
public class AppService {
	
	@Autowired
	private AppDao appDao;
	
	List<Registration> lst = new ArrayList<Registration>();
	
	public boolean loginValid(Login login) {
		
		for(Registration reg : lst)
		if(login.getUserName().equals(reg.getUserName()) && login.getPassword().equals(reg.getPassword())) {
			return true;
		}
		return false;		
	}
	
	public void addUser(Registration registration) {
		appDao.save(registration);
		//lst.add(registration);
		System.out.println(lst);
		
	}
	
	public List<Registration> loadAll(){
		List<Registration> lst = (List<Registration> )appDao.findAll();
		return lst;
	}
	
	public boolean findUser(Integer id) {
		Optional opt = appDao.findById(id);
		if(opt.isPresent()) {
			return true;
		}
		return false;
	}
		
	
	
	public boolean deleteUser(Integer id) {
		Optional opt = appDao.findById(id);
		if(opt.isPresent()) {
			appDao.deleteById(id);
			return true;
		}
		return false;
	}
	
	public boolean updateUser(Registration reg , Integer id) {
		Optional opt = appDao.findById(id);
		if(opt.isPresent()) {
			appDao.deleteById(id);
			appDao.save(reg);
			return true;
		}
		return false;

}
}
