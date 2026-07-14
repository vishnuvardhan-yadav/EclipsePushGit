package com.condition;


public class Example1 {
	
	public boolean isEven(int nums ) {
		if(nums%2==0) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int nums = 1;
		Example1 obj = new Example1();
		boolean result =obj.isEven(nums);
		System.out.println(result);

	}

}