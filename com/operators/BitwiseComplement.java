package com.operators;

import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int result = ~num;

        System.out.println("Original Number   : " + num);
        System.out.println("Complement Result : " + result);

        sc.close();
    }
}
