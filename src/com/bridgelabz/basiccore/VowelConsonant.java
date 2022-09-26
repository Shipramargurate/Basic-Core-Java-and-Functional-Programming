package com.bridgelabz.basiccore;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// Java Program to Check Whether an Alphabet is Vowel or Consonant
		Scanner sc = new Scanner(System.in); // scanner input 
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0); // storing char value

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'	|| ch == 'O' || ch == 'U')
			System.out.println("vowel : " + ch);
		else
			System.out.println("consonant : " + ch);
	}

}
