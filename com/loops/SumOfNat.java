package com.loops;

public class SumOfNat {
	public static int sumOfNat(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		
		return sum;
	}
	 public static void main(String[] args) {
		int num = 10;
		System.out.println(sumOfNat(num));
	}

}
