package com.jsp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.bean.WishMessageGenerater;
import com.jsp.config.AppConfig1;

public class Driver1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext axt=new AnnotationConfigApplicationContext(AppConfig1.class);
		WishMessageGenerater w1=axt.getBean("wmg",WishMessageGenerater.class);
		WishMessageGenerater w2=axt.getBean("wmg",WishMessageGenerater.class);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode());
		axt.close();

	}

}
