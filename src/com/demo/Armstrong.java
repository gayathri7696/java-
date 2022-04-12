package com.demo;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int n1,arm=0,rem;
		n1=n;
		while(n>0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(arm);
		if(n1==arm)
		{
			System.out.println("it is an armstrong");
			
		}
		else
		{
			System.out.println("it is not an armstrong");
		}
	}

}
