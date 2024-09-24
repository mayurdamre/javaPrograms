package com.interview;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10; 
		int b=20;

		//Logic 1 :
//		int t = a;
//		a=b;
//		b=t;
//		System.out.println(a+" "+ b);		
		
		//Logic 2 :
//		int x = a+b;
//		a= x-a;
//		b=x-b;
//		System.out.println("Second way value of a is "+a+" and b is "+b);
		
		// Logic 3 : use * and / without using third variable
		// here a and b values should not be zero
//		a= a*b; // 10*20=200
//		b= a/b; // 200/20=10
//		a= a/b; // 200/10=20		
//		System.out.println("value of a is "+a+" "+" value of b is "+b);
		
		// Logic 4 : Single Statement
		b= a+b-(a=b); //10+20-(a=20) --> 30-20 --> 10 --> value of a =20 and b=10;
		System.out.println("value of a is "+a+" "+" and b is "+b);
	}
}