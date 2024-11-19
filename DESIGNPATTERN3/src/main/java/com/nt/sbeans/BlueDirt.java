package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bluedirt")
public final class BlueDirt implements Currier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order product ready to deliver by BlueDirt currier service";
	}

}
