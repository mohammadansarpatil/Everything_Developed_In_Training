package com.example.pwcspring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingsImpl gi = (GreetingsImpl) ctx.getBean("gi");
		gi.sayGreetings("Ansar");
		gi.sayHello("Ansar", "Belgaum");


	}

}
