package com.datatTypes;

public class Employee {
		
		  int id = 1;
		  String empName = "vishnu";
		  
		  static int id2 = 2;
		  static String empName2 = "Akash";
		 

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		Employee obj1 = new Employee();
		obj1.id = 10;
		
		
		System.out.println("Emp id is:"+obj.id);
		System.out.println("empName is :"+obj.empName);
		System.out.println("Emp id is:"+obj1.id);
		System.out.println("empName is :"+obj1.empName);
		System.out.println("Emp id is:"+id2);
		System.out.println("empName is :"+empName2);
		

	}

}



