package com.datatTypes;

public class Example1 {
	static void revNum(int num) {																		
		
		while(num>0) {
			int rem = num%10;
			System.out.print(rem+"");
			num = num/10;
//			num = num/10;
			
			
		}		
		
	}
	public static void main(String[] args) {
		
		int num = 100;
		revNum(num);
	}
}
		
		
//		for(int i=1; i<=200; i++) {
//			if(i%3 == 0 && i%5 == 0) {
//				System.out.println(i);
//			}
//		}

//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//		
//	}
//	int num=100;
//	while(num>0) {
//		int rem = num%10;
//		System.out.print(rem+"");
//		num = num/10;
//	
//
//}
