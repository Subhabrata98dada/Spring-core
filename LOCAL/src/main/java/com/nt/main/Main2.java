package com.nt.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main2 {
	public static void main(String[] args) {
		String regx="[A-Za-z ]*";
		String input="1h1a28p89py@ t3eac1h4e3ars*2 67d3ay@";
		Pattern p=Pattern.compile(regx);
		Matcher m=p.matcher(input);
		while(m.find())
			System.out.print(m.group());
	}

}
