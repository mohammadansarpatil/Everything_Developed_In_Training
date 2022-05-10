package com.stackroute.keepnote;

import java.util.Collections;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*
 * The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration 
 * and @ComponentScan with their default attributes
 */

@SpringBootApplication
@EntityScan("com")
@ComponentScan("com")
@EnableJpaRepositories("com.stackroute.keepnote.repository")
@EnableSwagger2
public class ReminderServiceApplication {

	/*
	 * 
	 * You need to run SpringApplication.run, because this method start whole spring
	 * framework. Code below integrates your main() with SpringBoot
	 */

	public static void main(String[] args) {
		SpringApplication.run(ReminderServiceApplication.class, args);
	}
	
	
	@Bean
    public Docket swaggerConfiguration() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.select()
    			.apis(RequestHandlerSelectors.basePackage("com"))
    			.build()
    			.apiInfo(apiDetails());
    }
    
    private ApiInfo apiDetails() {
    	return new ApiInfo("REMINDER Application",
    			"Sample CRUD app for PWC India",
    			"1.0",
    			"Free to Use",
    			new springfox.documentation.service.Contact("Ansar", "http://www.abc.com", "ansar@email.com"),
    			"Api Licence",
    			"http://www.abc.com",
    			Collections.emptyList()
    			);
    }
}
