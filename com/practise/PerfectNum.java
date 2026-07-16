package com.practise;

public class PerfectNum {
	public static boolean isPerfectNum(int num) {
		
		if(num<=0) {
			return false;
		}
		
		for(int i=1; i*i<=num; i++) {
			if(i*i == num) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int num = 10;
		System.out.println(isPerfectNum(num)?"is a Perfect Square Number":"Not a Perfect Square Number");
		
	}

}
