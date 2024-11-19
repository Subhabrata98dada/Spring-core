package com.nt.clients;

import com.nt.componants.Bike;
import com.nt.componants.HarleyDavidson;
import com.nt.factry.BikeFactroy;

public class ClientTest {

	public static void main(String[] args) {
		Bike b=BikeFactroy.getBike(HarleyDavidson.class);
		b.drive();

	}

}
