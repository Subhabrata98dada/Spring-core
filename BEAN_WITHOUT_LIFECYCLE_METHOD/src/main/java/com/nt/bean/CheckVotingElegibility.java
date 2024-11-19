package com.nt.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
	
	
	
	public String checkElegibility()
	{
		String details="name:"+name+" id:"+id+" age:"+age+" ";
		if(age<18) return details+" Not elegible for voting"+" verified on "+dateOfVerification;
		else return details+" Eligible for voting"+" verified on "+dateOfVerification;
	}
}
