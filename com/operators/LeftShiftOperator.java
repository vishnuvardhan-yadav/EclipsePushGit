package com.operators;

public class LeftShiftOperator {
    public static void main(String[] args) {

        int num = 10;
        int shift = 2;

        System.out.println("Enter Number          : " + num);
        System.out.println("Enter Shift Positions : " + shift);

        System.out.println("Result After Left Shift : " + (num << shift));
    }
}
