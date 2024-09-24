package com.interview;

import java.util.Scanner;

public class CountingEvenOrOddDigitInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number"); // 123456
		int num = sc.nextInt();
		sc.close();
		int eveCount = 0;
		int oddCount = 0;
		int k = 0;
		while (num > 0) {
			k = num % 10; // 123456
			if (k % 2 == 0) {
				eveCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}
		System.out.println(eveCount + " Even Numbers ");
		System.out.println(oddCount + " Odd Numbers ");
	}
}
