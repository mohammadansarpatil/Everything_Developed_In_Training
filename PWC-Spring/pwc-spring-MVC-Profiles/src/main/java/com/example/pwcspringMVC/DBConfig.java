package com.example.pwcspringMVC;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfig {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DBConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DBConfig(String driverClassName, String url, String username, String password) {
		super();
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBConfig [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	@Bean
	@Profile("dev")
	public String devDBLoad() {
		System.out.println("DB with DEV profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Dev Environment loaded";
	}
	
	@Bean
	@Profile("test")
	public String testDBLoad() {
		System.out.println("DB with TEST profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Test Environment loaded";
	}
	
	@Bean
	@Profile("prod")
	public String prodDBLoad() {
		System.out.println("DB with PROD profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Prod Environment loaded";
	}
		
	

}
