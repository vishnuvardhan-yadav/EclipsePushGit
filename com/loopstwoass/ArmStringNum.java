package com.loopstwoass;

public class ArmStringNum {
	public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
	public static boolean isArmstrong(int num) {

	        int original = num;
	        int count = countDigits(num);
	        int sum = 0;

	        while (num > 0) {

	            int digit = num % 10;
	            int power = 1;

	            for (int i = 1; i <= count; i++) {
	                power = power * digit;
	            }

	            sum += power;
	            num /= 10;
	        }

	        return sum == original;
	    }
	

	public static void main(String[] args) {
		System.out.println(isArmstrong(153) ? "is a Armstrong num":"Not a Armstrong num");
	}

}
