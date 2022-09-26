package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/* leap year program
	    *A year is a leap year if divisible by 4 except for century year (years ending with 00)
		*century year is leap year only if it perfectly divisible by 400
		*/

		System.out.println("Enter any year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 400 == 0 && year % 100 == 0 || year % 100 != 0 && year % 4 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");	
	}

}
