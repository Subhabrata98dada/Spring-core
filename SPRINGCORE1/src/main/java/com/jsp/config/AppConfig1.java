package com.jsp.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class AppConfig1 {
	
	@Bean
	public LocalDateTime getLocalDateAndTime()
	{
		return LocalDateTime.now();
	}

}
