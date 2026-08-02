package com.employee;

public class Manager {
	private String mangerName;

	public Manager(String mangerName) {
		this.mangerName = mangerName;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	public void printEmpDetals(Employee employee) {
		System.out.println("Employee Name:" + employee.getEmpName());
		System.out.println("Employee Address: " + employee.getEmpAddress());
		System.out.println("Employee  current sal:" + employee.getEmpSal());
		
		
		if(employee.getEmpSal() >30000 && employee.getEmpSal() <=40000) {
			
			employee.setEmpSal(employee.getEmpSal()*0.10+employee.getEmpSal());
			
		} else if (employee.getEmpSal() >40000 && employee.getEmpSal() <=50000)  {
			
			employee.setEmpSal(employee.getEmpSal()*0.15+employee.getEmpSal());
			
		} else if (employee.getEmpSal() >50000 && employee.getEmpSal() <=60000) {
			System.out.println("No Increment");
		}

	}
}
