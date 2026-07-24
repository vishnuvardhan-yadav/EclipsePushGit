package com.constructor;

	public class BankProcessorClass {

		public static void main(String[] args) {
			BankAccountClass b=new BankAccountClass(501,"Vishnu",100000);
			System.out.println("Account Number:"+b.getAccountnumber());
			System.out.println("Account Holder:"+b.getAccountHolder());
			System.out.println("Current balance:"+b.getBalance());
			b.Deposit(5000);
			b.withdraw(3000);
			
			System.out.println("Updated balance:"+b.getBalance());
			
		}


}
