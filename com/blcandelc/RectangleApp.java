package com.blcandelc;
import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length : ");
        int length = sc.nextInt();

        System.out.print("Enter Breadth : ");
        int breadth = sc.nextInt();

        Rectangle r = new Rectangle(length, breadth);

        r.displayRectangleDetails();

        sc.close();
	}

}
