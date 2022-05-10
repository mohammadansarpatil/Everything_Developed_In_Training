package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int addId;
	private String cityName;
	private String state;
	private int pincode;
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", cityName=" + cityName + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Address(int addId, String cityName, String state, int pincode) {
		super();
		this.addId = addId;
		this.cityName = cityName;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
