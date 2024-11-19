package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Currier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order producs are ready to deliver DTDC currier service";
	}

}
