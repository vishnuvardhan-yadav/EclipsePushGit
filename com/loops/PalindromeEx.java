package com.loops;

public class PalindromeEx {
	
	public static void main(String[] args) {
		int num = 123;
		int rev2 = num;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
		    rev = rev*10+rem;
		    num = num/10;
		}
		if(rev2 == rev) {
			System.out.println("Palimdrome num");
		} else {
			System.out.println("Not a palindrome");
		}
		
	}

}
