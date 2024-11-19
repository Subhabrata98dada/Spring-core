package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ekart")
@Lazy(true)
public class Ekart implements Currier {
	
	public Ekart()
	{
		System.out.println("Ekart object creation");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order product ready to deliver by EKART currier service";
	}

}
