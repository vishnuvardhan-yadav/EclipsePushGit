package com.blcandelc;

import java.util.Scanner;

class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Java Marks : ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter SQL Marks : ");
        int sqlMarks = sc.nextInt();

        System.out.print("Enter Web Marks : ");
        int webMarks = sc.nextInt();

        Student s = new Student(name, javaMarks, sqlMarks, webMarks);

        System.out.println();
        s.displayStudentDetails();

        sc.close();
    }
}
