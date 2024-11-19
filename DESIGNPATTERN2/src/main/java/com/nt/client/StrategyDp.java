package com.nt.client;

import com.nt.components.Flipkart;
import com.nt.factry.FlipkartFactry;

public class StrategyDp {
	public static void main(String[] args) {
		Flipkart flipkart=FlipkartFactry.getInstance("dhl");
		String[] products= {"cosmetics","grocory","medicine"};
		float[] prices= {1000.4f,2345.7f,6754.9f};
		System.out.println(flipkart.shopping(products, prices));
		
	}

}
