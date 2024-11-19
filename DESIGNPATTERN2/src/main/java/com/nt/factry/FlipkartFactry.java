package com.nt.factry;

import com.nt.components.BlueDirt;
import com.nt.components.Currier;
import com.nt.components.DTDC;
import com.nt.components.Dhl;
import com.nt.components.Flipkart;

public class FlipkartFactry {
	public static Flipkart getInstance(String currierType) 
	{
		//create dependent class object based on currier type
		//using factry pattern
		Currier currier=null;
		Flipkart f=new Flipkart();
		switch (currierType) {
		case "dtdc":
			currier=new DTDC();
			f.setCurrier(currier);
			return f;
			
		case "dhl":
			currier=new Dhl();
			f.setCurrier(currier);
			return f;
			
		case "bluedirt":
			currier=new BlueDirt();
			f.setCurrier(currier);
			return f;
			

		default:
			throw new IllegalArgumentException("invalid currier name");
			
		}
	}

}
