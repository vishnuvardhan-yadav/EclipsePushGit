package com.datatTypes;

public class StaticMethods {
	
	public static int add(int x, int y ) {
		return x+y;
		
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
	     return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		int sum = add(a,b);
		int sub = sub(a,b);
		int mul = mul(a,b);
		int div = div(a,b);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		
		

	}

}
