package com.bridgelabz.basiccore;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// Flip Coin and print percentage of Heads and Tails

		// Random random = new Random(); // creating random object

		int count = 0;
		int tail = 0;
		int head = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of time you want to flips coin is : ");
		int flip = sc.nextInt();
		while (count < flip) {
			double flips = Math.random();// random value will be 0 or 1 in decimal form
			count++; // increase the count value till while loop iterates

			if (flips <= 0.5) {

				System.out.println("Tail");
				tail++; // Increase the count value for tail

			} else {

				System.out.println("Head");
				head++; // increase the count value for head
			}
			System.out.println("Number of heads = " + head);
			System.out.println("Number of tails = " + tail);

			double headpercentage = (double) head / flips * 100; // head percentage
			double tailpercentage = (double) tail / flips * 100; // tail percentage

			System.out.println("Percentage of head  = " + headpercentage);
			System.out.println("Percentage of tail = " + tailpercentage);

		}
	}

}
