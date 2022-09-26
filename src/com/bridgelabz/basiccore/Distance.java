package com.bridgelabz.basiccore;

import java.util.Scanner;

public class Distance {
	
	//program Distance.java that takes two integer command-line arguments x
	//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
	// formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); //scanner input
		System.out.println("Enter the value of x");
		 int x = sc.nextInt();
		System.out.println("Enter the value of y");
		 int y = sc.nextInt();
		 
		 double distance = Math.sqrt( x * x + y * y ); //formula for distance
		 System.out.println("Euclidean distance : " + distance);
	}

}
