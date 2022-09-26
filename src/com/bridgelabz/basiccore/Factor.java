package com.bridgelabz.basiccore;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// Computes the prime factorization of N using brute force.
		// calculating the prime factors and printing the result
		Scanner sc = new Scanner(System.in); // taking user input using scanner class
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		System.out.println("Prime Factors of " + num + " is :");
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				num = num / i;
			System.out.println(i);
		}
	}
}
