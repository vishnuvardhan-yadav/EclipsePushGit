package com.conditions;
import java.util.*;

public class ConditionSmts {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of person:");
		int persons = input.nextInt();
		int cars = persons/5;
		
		if(persons%5 == 0) {
			System.out.println(cars);
		}
		else {
			cars = persons/5+1;
			System.out.println(cars);
			
		}
		
		
		
		
	}

}
