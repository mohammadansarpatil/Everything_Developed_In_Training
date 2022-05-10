package com.example.pwcspring;

import org.springframework.stereotype.Component;

@Component("gi")
public class GreetingsImpl implements  Welcome {

	@Override
	public void sayGreetings(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " \nWelcome to Spring AOP");
		
	}

	@Override
	public void sayHello(String name, String city) {
		// TODO Auto-generated method stub
		System.out.println(name + " \nWelcome to Spring AOP " + city);

		
	}



}
