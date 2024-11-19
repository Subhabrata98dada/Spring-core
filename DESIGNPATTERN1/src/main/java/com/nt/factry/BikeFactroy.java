package com.nt.factry;

import com.nt.componants.AtherElectricBike;
import com.nt.componants.Bike;
import com.nt.componants.CBZ;
import com.nt.componants.HarleyDavidson;

public class BikeFactroy {
	public static final <T> T getBike(Class<T> c)
	{
		
//		if(bikeType.equalsIgnoreCase("luxury"))
//			return new HarleyDavidson();
//		else if(bikeType.equalsIgnoreCase("economy"))
//			return new AtherElectricBike();
//		else if(bikeType.equalsIgnoreCase("engineer"))
//			return new CBZ();
//		else
//			throw new IllegalArgumentException("first do incode");
		
		try {
			return c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

}
