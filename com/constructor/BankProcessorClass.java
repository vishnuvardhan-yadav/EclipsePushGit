package com.constructor;
import java.util.Scanner;

	public class BankProcessorClass {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your Name: ");
			String name = input.nextLine();
			System.out.println("Enter your Address: ");
			String address  = input.nextLine();
			System.out.println("Enter your Phone Number: ");
			long phonenumber = input.nextInt();
			System.out.println("ENter your balance:");
			double balance = input.nextInt();
			BankAccountClass b= new BankAccountClass(name,address,phonenumber,balance);
			
			
			while(true) {
				
				System.out.println("Select an Option from Below ");
				System.out.println("1.Withdraw");
				System.out.println("2.Deposit");
				System.out.println("3.showBalance");
				System.out.println("4.Exit");
				System.out.println("Enter your Choice:");
				int choice = input.nextInt();
				switch(choice) {
				
				case 1: {
					System.out.println("Enter your with draw Amount:");
					double deposit = input.nextInt();
					b.withDraw(deposit);
					break;
				}
				case 2: {
					System.out.println("Enter your withDrw Amount:");
					double withDraw = input.nextInt();
					b.withDraw(withDraw);
					break;
					
				}
				case 3: {
					b.showBalance();
					break;
				}
				case 4: {
					System.out.println("thank you..");
					return;
				}
				default: {
					System.out.println("Enter crt choice:");
				}
				}
			}
			
			
			
			
		}


}
