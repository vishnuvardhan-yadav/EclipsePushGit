package com.condition;

public class Example4 {
	
	public int greatestNum(int num1, int num2) {
			if(num1>num2) {
				return num1;
			}
			
			return num2;
			
		}

	public static void main(String[] args) {
		int num1 = 19;
		int num2 = 17;
		
		Example4 obj = new Example4();
		System.out.println(obj.greatestNum(num1, num2));

	}

}
