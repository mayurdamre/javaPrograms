package com.numberProblems;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year= sc.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.println("Year is Leap Year");
		}else {
			System.out.println("Year is not a Leap Year");
		}
	}
}
