package com.nt.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.nt")
@PropertySource("com/nt/common/myfile.properties")
public class AppConfig {
   @Bean("date")
   public Date getDateOject()
   {
	   return new Date();
   }
}
