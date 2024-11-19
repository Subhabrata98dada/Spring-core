package com.jsp.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
public class WishMessageGenerater {
	LocalDateTime time;
	

//  constructor injection
//	@Autowired
//	public WishMessageGenerater(LocalDateTime time) {
//		super();
//		this.time = time;
//	}

	public WishMessageGenerater()
	{
		System.out.println("private constructor");
	}

	public void wish()
	{
		int h=time.getHour();
		int minutes=time.getMinute();
		
		System.out.println("hello ,the time is ="+h+": "+minutes);
	}
	
	
// setter injection
//	@Autowired
//	public void setTime(LocalDateTime time) {
//		this.time = time;
//		System.out.println("setter memthod");
//	}
	
	
//  arbitary method injections
	@Autowired
	public void put(LocalDateTime time)
	{
		System.out.println("Arbitary method injection");
		this.time=time;
	}
	

}
