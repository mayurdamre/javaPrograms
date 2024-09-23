package com.interview;

import java.util.Scanner;

public class ReverseNumber{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int num = sc.nextInt();
		sc.close();
		// Logic 1: Algorithm
//		int rev=0;
//		while(num!=0) {
//		rev = rev*10 + num%10;
//		num = num/10;
//		}
//		
//		System.out.println("Reverse Number is "+rev);
//		
		// Logic 2 : Reverse Number with help of String Buffer
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev1 = sb.reverse();
//		
//		System.out.println("Reverse Number By StringBuffer :- "+rev1);
		
		//Logic 3: Reverse Number with help of String Builder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev2 = sbl.reverse();
		
		System.out.println("Revese Number by String Builder "+rev2);
		
	}
	
}