package com.loops;

public class Multi {
	public static void tablePrint(int n) {
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+"*"+i+"="+n*i);
			
		}
	}

	public static void main(String[] args) {
		int num = 7;
		tablePrint(num);

	}

}
