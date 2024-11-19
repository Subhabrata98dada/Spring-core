package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WishMessageGenerator {
	public WishMessageGenerator()
	{
		System.out.println(this.getClass());
	}

}
