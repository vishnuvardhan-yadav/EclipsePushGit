package com.condition;

public class Example3 {
	
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int age = 16;
		
		Example3 obj = new Example3();
		boolean result = obj.canVote(age);
		System.out.println(result);

	}

}
