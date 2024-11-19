package com.nt.singleteon;

public class Printer {
	
	//private static reference variable
	private static Printer printerInstance=null;
	
	//private constructor
	private Printer()
	{
		
	}
	
	//static final factory method
	public static Printer getPrinter()
	{
		if(printerInstance==null)
			return printerInstance=new Printer();
		else return printerInstance;
	}
	
	//business method
	public void print(String msg)
	{
		System.out.println(msg);
	}

}
