package com.condition;

public class Example5 {
	static boolean isDivisibility(int num) {
		if(num%5 == 0) {
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isDivisibility(10));			
		
	}

}
