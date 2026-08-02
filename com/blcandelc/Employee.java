package com.blcandelc;

class Employee {
    String employeeName;
    double basicSalary;

    Employee(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.10;
    }
    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    void displaySalaryDetails() {
        System.out.println("Employee Salary Report");
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + calculateHRA());
        System.out.println("DA : " + calculateDA());
        System.out.println("Gross Salary : " + calculateGrossSalary());
    }
}