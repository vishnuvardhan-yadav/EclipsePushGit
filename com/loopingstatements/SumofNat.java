package com.loopingstatements;
import java.util.Scanner;

public class SumofNat {
	public static int sumOfNat(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++){
			sum = sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = input.nextInt();
		int totalSum = sumOfNat(num);
		System.out.println(totalSum);
		
	}
	

}
