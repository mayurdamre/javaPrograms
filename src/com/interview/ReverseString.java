package com.interview;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String "); //mayur
		String name = sc.nextLine();
		sc.close();
		String rev = "";
		
		// Logic 1 : algorithm
//		for(int i=name.length()-1; i>=0; i--) {
//			rev= rev + name.charAt(i);
//		}
//		System.out.println("Reverse String is "+ rev);
		
		// Logic 2 : using character array
		char a[]=name.toCharArray();
		for(int j=name.length()-1; j>=0; j--) {
			rev = rev + a[j];
		}
		System.out.println("Reverse String is "+rev);
		
		// Logic 3 : By using StringBuffer class
//		StringBuffer sb = new StringBuffer(name);
//		StringBuffer rev1 = sb.reverse();
//		System.out.println("Reverse String is "+rev1);
		
		// Logic 4 : By using String Builder Class
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(name);
//		StringBuilder rev2 = sbl.reverse();
//		System.out.println("Reverse String By StringBuilder class :-  "+rev2);		
	}
}