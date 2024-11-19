package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	@Bean
	@Lazy(true)
	public Test getTest()
	{
		return new Test();
	}

}
