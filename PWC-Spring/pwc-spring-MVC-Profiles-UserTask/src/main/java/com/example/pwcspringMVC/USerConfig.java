package com.example.pwcspringMVC;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.user")
public class USerConfig {
	
	private String name;
	private String email;
	private String city;
	private String pincode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public USerConfig(String name, String email, String city, String pincode) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.pincode = pincode;
	}
	public USerConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "USerConfig [name=" + name + ", email=" + email + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	@Bean
	@Profile("manager")
	public String managerDBLoad() {
		System.out.println("DB with manager profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB manager Environment loaded";
	}
	
	@Bean
	@Profile("qa")
	public String QADBLoad() {
		System.out.println("DB with QA profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB QA Environment loaded";
	}
	
	@Bean
	@Profile("fin")
	public String finDBLoad() {
		System.out.println("DB with Fin profile loaded");
		System.out.println(name);
		System.out.println(email);
		return "DB Prod Environment loaded";
	}
		
	
}