package com.demo;

public class CountofOddEven {
public static void main(String[] args) {
	int odd=0,even=0;
	for(int i=1;i<=100;i++)
	{
		if(i%2==0)
		{
			even++;
			}
		else
		{
			odd++;
			}
	}
		System.out.println("even count is: "+even);
			System.out.println("odd count is :"+odd);
		}
		
		}


