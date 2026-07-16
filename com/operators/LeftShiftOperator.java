package com.operators;

import java.util.Scanner;

public class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Shift Positions : ");
        int shift = sc.nextInt();

        int result = num << shift;

        System.out.println("Result After Left Shift : " + result);

        sc.close();
    }
}