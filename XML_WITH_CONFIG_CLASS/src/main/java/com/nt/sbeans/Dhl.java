package com.nt.sbeans;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhl")
//@Primary
public final class Dhl implements Currier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order product ready to deliver by DHL currier service";
	}

}
