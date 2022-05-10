package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.entity.Account;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	public Account acc() {
		return new Account();
	}

}
