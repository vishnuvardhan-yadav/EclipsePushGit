package com.staticMethods;

public class Employee {

    static String companyName;

    int employeeId;
    String employeeName;

    static void companyInfo() {
        companyName = "Infosys";
        System.out.println("Company Name : " + companyName);
    }

    void employeeInfo() {
        employeeId = 1001;
        employeeName = "Ram";

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();

        companyInfo();     
        obj.employeeInfo();
    }
}
