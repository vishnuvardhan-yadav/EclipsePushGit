package com.loopingstatements;

import java.util.Scanner;

public class AtmMenu {
	public static void atmMenu() {
		int balance = 1000;
		int count;
		while (true) {
			System.out.println("-----ATM Menu----");
			System.out.println("1.Check your balance:");
			System.out.println("2: Deposit Money");
			System.out.println("3: Deposit Money");
			System.out.println("4:Exit");

			Scanner sc = new Scanner(System.in);
			count = sc.nextInt();

			switch (count) {
			case 1: {
				System.out.println("Your Current Balane:" + balance);
				break;
			}
			case 2: {
				System.out.println("Enter the deposit Money:");
				int deposit = sc.nextInt();
				balance = deposit + balance;
				System.out.println("Your Current Balane:" + balance);
				break;
			}

			case 3: {
				System.out.println("With draw money:");
				int withDraw = sc.nextInt();

				if (withDraw <= balance) {
						balance -= withDraw;
						System.out.println("Amount Withdrawn Successfully.");
						System.out.println("Current Balance :" + balance);
						break;

						} else {
					System.out.println("Insufficient Balance");
						}
				break;
				}
			
			case 4: {
				System.out.println("Thank You for Using Our ATM!");
                sc.close();
                return;
			}
			
			default:
				System.out.println("Invalid Choice please try again..");
        
			} 

		}
	}

	public static void main(String[] args) {
		
		atmMenu();

	}

}
