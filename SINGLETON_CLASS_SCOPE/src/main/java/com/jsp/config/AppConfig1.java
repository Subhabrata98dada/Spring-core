package com.jsp.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jsp.bean.WishMessageGenerater;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class AppConfig1 {
	
	@Bean("dt1")
	@Scope("singleton")
	public LocalDateTime getLocalDateAndTime1()
	{
		return LocalDateTime.now();
	}
	@Bean("dt2")
	@Scope("singleton")
	public LocalDateTime getLocalDateAndTime2()
	{
		return LocalDateTime.now();
	}
	
//	@Bean
//	public WishMessageGenerater getWishMessageGenerator()
//	{
//		
//	}

}
