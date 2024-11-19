package com.nt.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("cve")
public class CheckVotingElegibility {
	@Value("${voter.id}")
	private int id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	
	private Date dateOfVerification;
	
	public CheckVotingElegibility()
	{
		System.out.println("CheckVotingEligibility object creation");
	}
	@PostConstruct
	public void myinit()
	{
		System.out.println("init method execution");
		if(dateOfVerification==null)dateOfVerification=new Date();
		if(age<0 || age>120 || name==null || name.length()==0 )
			throw new IllegalArgumentException("name:"+name+" id:"+id+" age:"+age+" "+"check all the data given");
	}
	
	@PreDestroy
	public void mydestroy()
	{
		dateOfVerification=null;
		name=null;
		age=0;
		id=0;
		System.out.println("name:"+name+" id:"+id+" age:"+age);
		System.out.println("object destruction");
	}
	public String checkElegibility()
	{
		String details="name:"+name+" id:"+id+" age:"+age+" ";
		if(age<18) return details+" Not elegible for voting"+" verified on "+dateOfVerification;
		else return details+" Eligible for voting"+" verified on "+dateOfVerification;
	}
}
