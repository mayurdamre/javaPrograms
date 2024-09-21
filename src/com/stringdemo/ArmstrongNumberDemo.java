package com.stringdemo;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		int no=111;
		int t1=no,t2=no;
		int length=0;
		int rem;
		int arm=0;
		int mul=1;

		while(t1!=0)
		{
		length=length+1;
		t1=t1/10;
		}

		while(t2!=0)
		{
		rem=t2%10;
		for(int i=0;i<=length;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
		}

		if(no==arm)
		{
			System.out.println("this is ArmStrong No");
		}
		else
		{
			System.out.println("this is not armstrong no");
		}

	}

}
