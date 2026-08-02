package com.employee;

import java.util.Scanner;

public class managerMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Emp Name:");
		String empName = input.nextLine();

		System.out.println("Enter the Emp Adress:");
		String empAddress = input.nextLine();

		System.out.println("Enter the Emp Sal:");
		Double sal = input.nextDouble();

		Employee emp = new Employee(empName, empAddress, sal);

		System.out.println("Enter the manager Name:");
		String name = input.nextLine();

		Manager man = new Manager(name);

		man.printEmpDetals(emp);

	}

}