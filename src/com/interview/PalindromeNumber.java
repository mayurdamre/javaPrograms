package com.interview;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		int org_num=num;
		int rev=0;
		while(num!=0) {
		rev = rev*10 + num%10;
		num = num/10;
		}
		System.out.print("Reverse Number is "+rev);
		if(org_num==rev) {
			System.out.println(" --> Number is palindrome");
		}else {
			System.out.println(" ---> Number is not a palindrome");
		}
	}
}