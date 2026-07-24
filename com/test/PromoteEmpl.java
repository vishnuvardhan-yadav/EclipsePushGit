package com.test;

public class PromoteEmpl {
	
	public static void main(String[] args) {
		
		Employee obj = new Employee(1,"vishnu","SD",100000,5);
		System.out.println("Employee Details");
		System.out.println("Employee ID : " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Designation: " + obj.getDesignation());
		System.out.println("Salary " + obj.getSalary());
		System.out.println("Performance Rating:" + obj.getPerformanceRating());
		System.out.println("After Promotino:");
		obj.promoteEmployee();
		System.out.println("Employee Details");
		System.out.println("Employee ID : " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Designation: " + obj.getDesignation());
		System.out.println("Salary " + obj.getSalary());
		System.out.println("Performance Rating:" + obj.getPerformanceRating());
	
		

		
		
		

	}

}
