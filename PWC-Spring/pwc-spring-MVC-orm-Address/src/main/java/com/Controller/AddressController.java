package com.Controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Address;
import com.Service.AddressService;

@RestController
@RequestMapping("/mainapp")
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	@PostMapping("/addaddress")
	public ResponseEntity<String> addAddress(@RequestBody Address add) {
		add.getCityName();
		add.getState();
		add.getPincode();
		service.addAddress(add);
		return new ResponseEntity<>("Address Added" , HttpStatus.OK);
	}
	
	@GetMapping("/loadaddress")
	public ResponseEntity<List<Address>>  showAllAddress(){
		List<Address> add= service.showAllAddress();
		return new ResponseEntity<>(add , HttpStatus.OK);
	}
	
	@GetMapping("/loadaddress/{id}")
	public ResponseEntity<Optional> showAddresswithId(@PathVariable("id") int id) {
		return new ResponseEntity<> (service.showAddresswithId(id), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping("/deleteaddress/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable("id") int id) {
		
		if(service.deleteAddress(id))
		return new ResponseEntity<>( id + "Deleted",HttpStatus.OK);
		else
		return new ResponseEntity<>( id + "Not Deleted",HttpStatus.BAD_REQUEST);
		
	}
	
	@PutMapping("/updateaddress/{id}")
	public ResponseEntity<String> updateAddress(@PathVariable("id") Integer id , @RequestBody Address add) {
		if(service.updateAddress(add, id))
		return new ResponseEntity<>( id + "Updated",HttpStatus.OK);
		else
			return new ResponseEntity<>( id + "Not Updated",HttpStatus.BAD_REQUEST);
		
	}
	
	

}
