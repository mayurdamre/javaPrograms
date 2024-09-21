package com.stringdemo;
import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();	
		String rev ="";
		for(int i=input.length()-1; i>=0; i--) {
			rev = rev+input.charAt(i);
//			System.out.println(i);
		}
		if(input.equals(rev)) {
			System.out.print(input+" is palindrome");
		}else {
			System.out.println(input+" is not palindrome");
		}
	}
}