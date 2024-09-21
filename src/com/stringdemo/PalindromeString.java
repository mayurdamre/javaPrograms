package com.stringdemo;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String m = "racecar";
		String rev = "";
		
		for(int j=m.length()-1; j>=0; j--) {
			rev = rev + m.charAt(j);
		}
		System.out.println(rev);
		
		if(m.equals(rev)) {
			System.out.println("String is palindrome "+m);
		}else {
			System.out.println("String is not palindrome "+m);
		}
		
	}

}
