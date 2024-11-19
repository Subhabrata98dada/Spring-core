package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Driver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext axt=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(Arrays.toString(axt.getBeanDefinitionNames()));
		axt.getBean("wishMessageGenerator");
		axt.getBean("getLocalDateTime");
		axt.close();
	}

}
