package com.practise;

public class Ex2 {
	

	public static void armStrong(int num) {
		int original = num;
		int temp = num;
		int digit = 0;
		while(temp>0) {
			digit++;
			temp = temp/10;
		}
		temp = num;
		int sum = 0;
		while(temp > 0) {
			int rem = temp%10;
			sum +=Math.pow(rem,digit);
			temp = temp/10; 
			
		}
		if(sum == original) {
			System.out.println("is a Armstrong num");
		} else {
			System.out.println("not a Armstrong num");
		}
	}

	public static void main(String[] args) {
		int num = 153;
		armStrong(num);


	}	

}
	
//	int age;
//	String name;
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age,Ex2 obj) {
//		obj.age = age;
//	}
//	Ex2 obj = new Ex2();
//	obj.setAge(55,obj);
//	int ag = obj.getAge();
//	System.out.println(ag);
