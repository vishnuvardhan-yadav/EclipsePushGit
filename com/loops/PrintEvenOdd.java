package com.loops;
import java.util.Scanner;

public class PrintEvenOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Limit : ");
        int n = sc.nextInt();
        
        System.out.println("Even Numbers");
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); // next line
        
        System.out.println("Odd Numbers");
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}