package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonalInfo;
import com.nt.sbeans.TestBean;

public class MainDriver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		PersonalInfo pi=ctx.getBean("pinfo",PersonalInfo.class);
		Environment env=ctx.getEnvironment();
		System.out.println(env);
		TestBean test=ctx.getBean("test",TestBean.class);
		test.m1();
		System.out.println(pi);
		ctx.close();
	}

}
