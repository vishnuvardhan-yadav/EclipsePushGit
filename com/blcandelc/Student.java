package com.blcandelc;

class Student {
    String studentName;
    int javaMarks;
    int sqlMarks;
    int webMarks;

    Student(String studentName, int javaMarks, int sqlMarks, int webMarks) {
        this.studentName = studentName;
        this.javaMarks = javaMarks;
        this.sqlMarks = sqlMarks;
        this.webMarks = webMarks;
    }

    int calculateTotal() {
        return javaMarks + sqlMarks + webMarks;
    }


    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayStudentDetails() {
        System.out.println("Student Details");
        System.out.println("Student Name : " + studentName);
        System.out.println("Java Marks : " + javaMarks);
        System.out.println("SQL Marks : " + sqlMarks);
        System.out.println("Web Marks : " + webMarks);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.printf("Percentage :"+ calculatePercentage());
    }
}