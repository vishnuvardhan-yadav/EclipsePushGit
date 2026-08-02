package com.inheritance;

public class Child {
	
	Child() {
		this(101);
		System.out.println("This is Child");
	}
	Child(int id) {
		System.out.println(id);
		
	}

	public static void main(String[] args) {
		new Child();
	}

}
