package com.nt.main;

import java.lang.reflect.Method;
import java.util.Arrays;

import com.nt.classes.Employee;

public class Driver {
	public static void main(String[] args) throws Exception{
		//aproach 1
		//Class<Employee> emp_class=(Class<Employee>) Class.forName("com.nt.classes.Employee");
		
		//aproach 2
		//Employee emp=new Employee();
		//Class<Employee> emp_class=(Class<Employee>)emp.getClass();
		//System.out.println(emp_class);
		
		//approach 3
		Class<Employee> class_emp=Employee.class;
		System.out.println(class_emp);
		System.out.println(class_emp.getName());
		System.out.println(class_emp.getSuperclass());
		Class[] interfaces=class_emp.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		Method clas[]=class_emp.getMethods();
		System.out.println(Arrays.toString(clas));
		
		
	}

}
