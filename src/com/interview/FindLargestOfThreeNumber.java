package com.interview;

import java.util.Scanner;

public class FindLargestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();
		System.err.println("Enter Third Number");
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("a= " + a + " is larger than b and c");
		} else if (b > a && b > c) {
			System.out.println("b= " + b + " is larger than a and c");
		} else {
			System.out.print(" c= " + c + " is larger than a and b");
		}
	}
}
