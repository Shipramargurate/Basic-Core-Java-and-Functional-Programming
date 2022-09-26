package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LargestNumber {
	
	//Java Program to Find the Largest Among Three Numbers

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scannerr input 
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt(); // storing 1st input
		System.out.println("Enter second number : ");
		int number2 = sc.nextInt(); //storing 2nd input
		System.out.println("Enter third number : ");
		int number3 = sc.nextInt(); //storingg 3rd  input

		if (number1 > number2 && number1 > number3) // comparing all 3 numbers
			System.out.println("Largest number is number one i.e :" + number1);
		else if (number2 > number1 && number2 > number3)
			System.out.println("Largest number is number two i.e :" + number2);
		else
			System.out.println("Largest number is number three i.e :" + number3);

	}

}
