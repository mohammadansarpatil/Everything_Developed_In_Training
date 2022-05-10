package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CalculatorService cs1 = (CalculatorService) ctx.getBean("service");
		System.out.println(cs1.service(3456));
		ctx.close();


	}

}
