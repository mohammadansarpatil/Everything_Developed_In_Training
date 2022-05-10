package com.stackroute.keepnote.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/* Annotate this class with @Aspect and @Component */

@Aspect
@Component
public class LoggingAspect {
	/*
	 * Write loggers for each of the methods of Category controller, any particular method
	 * will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
	
	@Before(value = "execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
	public void callBefore() {
		System.out.println("calling Before");
	}
	
	@After(value = "execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
	public void callAfter() {
		System.out.println("calling After");
	}
	
//	@Around(value = "execution(* com.example.pwcspring.GreetingsImpl.CategoryController.(..))")
//	public void callAround(ProceedingJoinPoint pj) throws Throwable {
//		System.out.println("calling Before");
//		pj.proceed();
//		System.out.println("calling After");
//	}
}
