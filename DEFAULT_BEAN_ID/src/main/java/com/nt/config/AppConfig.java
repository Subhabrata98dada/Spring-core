package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	@Bean
	@Lazy(true)
	@Scope("prototype")
	public LocalDateTime getLocalDateTime()
	{
		System.out.println("LocalDateTime");
		return LocalDateTime.now();
	}

}
