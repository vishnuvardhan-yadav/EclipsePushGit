package com.practise;

public class UglyNum {
	
	public static boolean isUglyNum(int num) {
		if(num <= 0) {
			return false;
		}
		while(num%2 == 0) {
			num = num/2;
		}
		while(num%3 == 0) {
			num = num/3;
		}
		while(num%5 == 0) {
			num = num/5;
		}
		if(num == 1) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isUglyNum(0)?"Is A ugly Num" : "Not a ugly Num");

	}

}
