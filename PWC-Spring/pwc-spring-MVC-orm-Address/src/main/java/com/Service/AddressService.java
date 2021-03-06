package com.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.AppDao;
import com.Model.Address;

@Service
public class AddressService {

	@Autowired
	private AppDao appDao;
	
	List<Address> address = new ArrayList<Address>();
	
	public void addAddress(Address add) {
		appDao.save(add);
	}
	
	public List<Address> showAllAddress(){
		List<Address> address = (List<Address>)appDao.findAll();
		return address;
	}
	
	public boolean deleteAddress(Integer id) {
		Optional add = appDao.findById(id);
		if(add.isPresent()) {
			appDao.deleteById(id);
			return true;
		}
		return false;
		
	}
	
	public boolean updateAddress(Address add, int id) {
		Optional opt = appDao.findById(id);
		if(opt.isPresent()) {
			appDao.deleteById(id);
			appDao.save(add);
			return true;
		}
		return false;
	}
	
	public Optional showAddresswithId(int id) {
		Optional opt = appDao.findById(id);
		return opt;
		
	}
	
	
	
}
