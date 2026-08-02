package com.operators;

public class RightShiftOperator {
    public static void main(String[] args) {

        int num = 40;
        int shift = 2;

        System.out.println("Enter Number          : " + num);
        System.out.println("Enter Shift Positions : " + shift);

        System.out.println("Result After Right Shift : " + (num >> shift));
    }
}
