package com.condition;

public class Example2 {
	public String checkNumber(int num) {
		if(num>0) {
			return "positive";
		} else if(num<0) {
			return "Negative";
		} 
		
		return "Zero";
	}
	public static void main(String[] args) {
		int nums = 0;
		Example2 obj = new Example2();
		
		String result = obj.checkNumber(nums);
		System.out.println(result);				

	}
}
