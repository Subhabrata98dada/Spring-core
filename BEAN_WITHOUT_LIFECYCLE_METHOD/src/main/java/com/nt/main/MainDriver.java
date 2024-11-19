package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.bean.CheckVotingElegibility;
import com.nt.config.AppConfig;

public class MainDriver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		CheckVotingElegibility cve= cxt.getBean("cve",CheckVotingElegibility.class);
		String msg=cve.checkElegibility();
		System.out.println(msg);
		cxt.close();
		
	}

}
