package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fk") 
public final class Flipkart {
	
	@Value("${per.name}")
	private String id;
	
	@Autowired
	//@Qualifier("dhl")
	//@Qualifier("${currier.id}") invalid because place holder only used in @Value
	//@Qualifier("@value('${currier.id}')") invaid because @Value can not placed in
	//@Qualifier(id) id as variable not allowed need string 
	@Qualifier("shipping")
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
		System.out.println(id);
		return Arrays.toString(items)+"\nare purchased having price "+Arrays.toString(prices)+"\nbill amount "+
				toatalamount+" "+msg;
		
	}

}
