package com.bridgelabz.basiccore;

import java.util.Scanner;

public class EvenOddNumberr {

	public static void main(String[] args) {
		//Java Program to Check Whether a Number is Even or Odd
		Scanner sc = new Scanner(System.in); // scanner iinput
		System.out.println("Enter the number : ");
		int number = sc.nextInt(); 
		 if(number % 2 == 0) // if number is divisble by 2
		System.out.println("Even number");
		 else
			 System.out.println("odd number");
		

	}

}
