package com.bridgelabz.basiccore;

import java.util.Scanner;

public class Quadratic {

	/*
	 * find the roots of the equation a*x*x + b*x + c. Since the equation is x*x,
	 * hence there are 2 roots. The 2 roots of the equation can be found using a
	 * formula (Note: Take a, b and c as input values) delta = b*b - 4*a*c Root 1 of
	 * x = (-b + sqrt(delta))/(2*a) Root 2 of x = (-b - sqrt(delta))/(2*a)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // scanner input
        //taking value for a , b & c
		System.out.println("Enter value for a : ");
		int a = sc.nextInt();

		System.out.println("Enter value for b : ");
		int b = sc.nextInt();

		System.out.println("Enter value for c : ");
		int c = sc.nextInt();

		sc.close(); // closing scanner

		int delta = (b * b) - 4 * (a * c); // formula for delta
		int root1 = (-b + Math.abs(delta)) / (2 * a); // formula to find the root1 value
		int root2 = (-b - Math.abs(delta)) / (2 * a); // formula to find the root12 value

		System.out.println("Root 1 of X1 :" + root1); // printing the value of root1
		System.out.println("Root 2 of X2 : " + root2); // printing the value of root1=2
	}
}
