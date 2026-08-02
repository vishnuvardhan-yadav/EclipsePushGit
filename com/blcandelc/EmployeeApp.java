package com.blcandelc;

import java.util.Scanner;

	class EmployeeApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee Name : ");
	        String name = sc.nextLine();

	        System.out.print("Enter Basic Salary : ");
	        double salary = sc.nextDouble();

	        Employee emp = new Employee(name, salary);

	        System.out.println();
	        emp.displaySalaryDetails();

	        sc.close();
	    }
	}

