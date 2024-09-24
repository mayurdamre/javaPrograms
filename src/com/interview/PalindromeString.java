package com.interview;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String name = sc.nextLine();

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse String is :- " + rev);

		if (name.equals(rev)) {
			System.out.print(name + " is palindrome");
		} else {
			System.out.println(name + " is not a palindrome");
		}
	}

}
