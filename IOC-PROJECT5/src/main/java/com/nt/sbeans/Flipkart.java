package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fk")
public final class Flipkart {
	
	@Autowired
//	@Qualifier("bluedirt")
	private Currier currier;

	public void setCurrier(Currier currier) {
		
		//has a relation
		this.currier = currier;
	}
	
	public Flipkart()
	{
		System.out.println("0 param constructor");
	}
	
	public String shopping(String[] items,float []prices)
	{
		float toatalamount=0.0f;
		for(float f:prices)
			toatalamount+=f;
		
		int orderid=new Random().nextInt(10000);
		String msg=currier.deliver(orderid);
		return Arrays.toString(items)+" are purchased having price "+Arrays.toString(prices)+" bill amount "+
				toatalamount+" "+msg;
	}

}
