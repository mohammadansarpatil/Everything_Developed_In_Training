package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;


@Configuration
@ComponentScan("com")
public class AppConfig {
	
	
	@Bean
	public InMemoryAccountRepository accrepo() {
		return new InMemoryAccountRepository();
	}
	
	@Bean
	public TransferServiceImpl trans() {
		return new TransferServiceImpl(accrepo());
	}
	

}
