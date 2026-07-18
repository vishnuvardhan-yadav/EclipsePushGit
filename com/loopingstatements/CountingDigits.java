package com.loopingstatements;

public class CountingDigits {
	public static int countDigit(int num) {
		int count = 0;
		while(num>0) {
			int digit = num%10;
			count++;
			num = num/10;
		}
		return count;
	}
	

	public static void main(String[] args) {
		
		System.out.print(countDigit(100));
	}

}
