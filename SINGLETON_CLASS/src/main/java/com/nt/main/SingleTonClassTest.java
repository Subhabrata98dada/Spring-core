package com.nt.main;

import com.nt.singleteon.Printer;

public class SingleTonClassTest {
	public static void main(String[] args) {
		Printer p1=Printer.getPrinter();
		Printer p2=Printer.getPrinter();
		Printer p3=Printer.getPrinter();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
	}

}
