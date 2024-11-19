package com.nt.classes;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable,Comparable<Employee>{

	int a;
	int b;
	void m1()
	{
		
	}
	void m2()
	{
		
	}
	
	

	public Employee(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
