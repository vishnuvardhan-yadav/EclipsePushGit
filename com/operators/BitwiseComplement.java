package com.operators;

public class BitwiseOperations {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 10;

        System.out.println("Enter First Number  : " + num1);
        System.out.println("Enter Second Number : " + num2);

        System.out.println("Bitwise AND : " + (num1 & num2));
        System.out.println("Bitwise OR  : " + (num1 | num2));
        System.out.println("Bitwise XOR : " + (num1 ^ num2));
    }
}
