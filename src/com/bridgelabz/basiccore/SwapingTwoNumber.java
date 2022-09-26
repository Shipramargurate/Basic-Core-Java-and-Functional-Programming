package com.bridgelabz.basiccore;

import java.util.Scanner;

public class SwapingTwoNumber {

	public static void main(String[] args) {
		//Java Program to Swap Two Numbers
		Scanner sc = new Scanner(System.in); //scanner input
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt();
		
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("after swapping number will be : ");
		System.out.println("first number is : " + firstNumber);
		System.out.println("second number is : " + secondNumber);

	}

}
