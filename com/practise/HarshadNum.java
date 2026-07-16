package com.practise;


public class HarshadNum {
	public static void isHarshaNum(int num) {
		int sum = 0;
		int temp = num;
		
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		if(temp%sum == 0) {
			System.out.println("Harshad Number");
		} else {
			System.out.println("Not a Harshad Number");
		}
	}

	public static void main(String[] args) {
		int num = 18;
		isHarshaNum(num);

	}

}

