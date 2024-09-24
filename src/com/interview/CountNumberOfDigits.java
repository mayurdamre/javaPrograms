package com.interview;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number..."); //12345
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.print("Number of digits are "+count);	
	}
}
