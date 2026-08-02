package com.constructor;

public class BankAccountClass {
	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;

	BankAccountClass(String customerName, String customerAddress, long phoneNumber, double balance) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}
	
	public  void deposit(double amount) {
		if(balance > 0) {
			balance = amount + balance;
			System.out.println("Displays a success message with the updated balance.");
			System.out.println("updated balance is "+balance);
		} else {
			System.out.println("In sufficient Amount");
		}
	}
	
	public void withDraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("If the withdrawal is successful");
			System.out.println("The current amout after withdraw:"+balance);
		} else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void showBalance() {
		System.out.println("Your current Balance:"+balance);
	}

}