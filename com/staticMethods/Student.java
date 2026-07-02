package com.staticMethods;

public class Student {
	public static  String collegeName;
	public String studentName;
	public  int studentId;
	
	public static void collegeInfo() {
		collegeName = "ABC College";
		System.out.println("College Name is :"+collegeName);
		
	}
	public void studentInfo() {
		studentId = 101;
		studentName = "Ravi";
		System.out.println("student ID is :"+studentId);
		System.out.println("StudentName is :"+studentName);
		
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentInfo();
		Student.collegeInfo();				

	}
}
