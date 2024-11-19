package com.nt.main;

import java.util.Locale;
import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class I18nTestApp {
	public static void main(String[] args) {
		
		//read language code an dcountry code
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the language code::");
		String language=sc.next();
		System.out.println("Enter country code::");
		String country=sc.next();
		sc.close();
		
		//prepere Local object having country code and language code collected from end user
		Locale locale=new Locale(language,country );
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		//get message from the specific properties file by pussing locale and key
		
		String msg1=cxt.getMessage("welcome.msg", new Object[] {"hello","hi"},locale);
		String msg2=cxt.getMessage("goodbye.msg", new Object[] {},locale);
		String msg3=cxt.getMessage("warm.msg", new Object[] {},locale);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		cxt.close();
	}

}
