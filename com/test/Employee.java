package com.test;

public class Employee {
	public int empId;
	public String name;
	public String designation;
	public double salary;
	public int performanceRating;

	Employee(int empId, String name, String designation, double salary, int performanceRating) {

		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;

	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public void setPerformanceRating(int performanceRating) {
//		this.performanceRating = performanceRating;
//	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	
	public void promoteEmployee() {
		if(performanceRating >= 4) {
			salary += salary*0.20;
		
		} else {
			System.out.println("No promotion");
		}
	}

}