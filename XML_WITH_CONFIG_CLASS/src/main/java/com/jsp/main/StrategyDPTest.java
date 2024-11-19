package com.jsp.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext axt=new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart flipkart=axt.getBean("fk",Flipkart.class);
		String[] products= {"shirt","pants","hats"};
		float[] prices= {3011.4f,2300.3f,2394.6f};
		String resultmsg=flipkart.shopping(products, prices);
		System.out.println(resultmsg);
		axt.close();
	}

}
