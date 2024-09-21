package com.stringdemo;

public class CountStringWords {
	
	public static void main(String[] args) {
		
		String s = "Mayur Damre";
		int digit=1;
		
		System.out.println("String Length:- "+s.length());
		
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)!=0)
				count++;
		}
		System.out.println("no of words is ="+count);
		
		for(int i=0; i<=s.length(); i++){
			if(s.charAt(i)==' ' && s.charAt(i+1)!=0)
				digit++;
		}
		System.out.println("Your word digit length:- "+digit);
	}
}
