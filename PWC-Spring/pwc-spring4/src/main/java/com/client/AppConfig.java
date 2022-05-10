package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	@Lazy
	public FixedAccount fda() {
		return new FixedAccount();
	}
	@Bean
	@Lazy
	public SavingAccount sa() {
		return new SavingAccount();
	}
	@Bean
	@Lazy
	public CalculatorService service() {
		return new CalculatorService(fda());
	}

}
