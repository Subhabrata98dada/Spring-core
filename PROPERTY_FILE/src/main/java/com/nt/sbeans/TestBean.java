package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("test")
public class TestBean {
	@Autowired
	private Environment env;
	
	public void m1()
	{
		System.out.println(env.getProperty("per.name"));
		System.out.println(env.getProperty("per.id"));
	}

}
