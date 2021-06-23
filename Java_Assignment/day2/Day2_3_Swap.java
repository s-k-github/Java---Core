package day2;

import java.util.Scanner;

public class Day2_3_Swap 
{
	protected static void swap(int a,int b)
	{
		System.out.print("\nBefore-> a: "+a+", b: "+b);		
		a+=b;
		b=a-b;
		a=a-b;
		System.out.print("\nAfter-> a: "+a+", b: "+b);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		System.out.print("\nPlease enter second number : ");
		int b=sc.nextInt();
		
		swap(a,b);
		
		sc.close();
	}
}
/*
Please enter first number : 23

Please enter second number : 34

Before-> a: 23, b: 34
After-> a: 34, b: 23*/