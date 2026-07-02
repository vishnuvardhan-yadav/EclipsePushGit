package com.staticMethods;

public class Mobile {
	public static String brand;
	public String model;
	int price;
	
	public static void brandInfo() {
		brand = "Samsung";
		System.out.println("Mobile brand is "+brand);
		
	}
	public void mobileInfo() {
		model = "S24";
		price = 8000;
		
		System.out.println("Mobile Model is:"+model);
		System.out.println("Mobile price is:"+price);
	}
		
	

	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.mobileInfo();
		brandInfo();
		
		
	}						

}
