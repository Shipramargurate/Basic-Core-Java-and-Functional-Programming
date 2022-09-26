package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientAndRemainder {
//Java Program to Compute Quotient and Remainder
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner input
		//taking divident and divisor as user input using scanner class
		System.out.println("enter divident : ");
		int divident = sc.nextInt(); // storing dividentt value

		System.out.println("enter divisor : ");
		int divisor = sc.nextInt(); // storing divisor value

		int quotient = divident / divisor; //  / this give value for quotient
		int remainder = divident % divisor; // % this  will give  value for reminder

		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);

	}

}
