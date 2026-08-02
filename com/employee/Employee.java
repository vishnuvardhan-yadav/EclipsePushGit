package com.employee;

public class Employee {
	
	private String empName;
	private String empAddress;
	private double empSal;
	
	public Employee(String empName, String empAddress, double empSal) {
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
	

}
