package com.practise;

public class Ex3 {
	public static boolean isNeon(int num) {
		int temp = num;
		int square = num*num;
		int sum = 0;
		while(square>0) {
			int rem = square%10;
			sum = sum+rem;
			square = square/10;
		}
		if(sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int num = 9;
		System.out.println(isNeon(8));

	}

}
