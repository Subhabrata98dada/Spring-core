package com.jsp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.bean.WishMessageGenerater;
import com.jsp.config.AppConfig1;

public class Driver1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext axt=new AnnotationConfigApplicationContext(AppConfig1.class);
		WishMessageGenerater w=axt.getBean("wmg",WishMessageGenerater.class);
		w.wish();
		axt.close();

	}

}
