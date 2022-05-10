package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;


public class CalculatorService {
	

	private InterestCalculator ic;
	

	public CalculatorService(InterestCalculator ic) {
		this.ic = ic;
	}

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
		
	}

	public CalculatorService() {
		System.out.println("Service Initialized");
		} 
	
		@PostConstruct
		public void callInit() {
			System.out.println("Init Called");
		}
		@PreDestroy
		public void callDestroy() {
			System.out.println("Destroy Called");
		}
	
}
