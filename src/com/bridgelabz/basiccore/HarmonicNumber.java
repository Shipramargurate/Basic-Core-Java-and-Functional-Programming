package com.bridgelabz.basiccore;

import java.util.Scanner;

public class HarmonicNumber {
	//the Nth harmonic number: 1/1 + 1/2 + ... + 1/N

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner input
		System.out.println("enter the value of n : ");
		double num = sc.nextDouble();
		double sum = 0.0; 
		for(int i = 1; i <= num; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Nth Harmonic Num : " + sum);

	}

}
