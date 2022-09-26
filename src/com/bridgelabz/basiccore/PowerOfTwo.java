package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// This program takes a command-line argument N and prints a table of the
	    //powers of 2 that are less than or equal to 2^N.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for N : ");
		int number = sc.nextInt();
		
		System.out.println("power of 2^" + number + " is  :"+ (Math.pow(2, number)));

		
	}

}
