package day2;

import java.util.Scanner;

public class Day2_4_AdditionWithOverloading 
{
	protected static int add(int a,int b)
	{
		return a+b;
	}
	protected static float add(float a,float b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first integer : ");
		int aInt=sc.nextInt();
		System.out.print("\nPlease enter second integer : ");
		int bInt=sc.nextInt();
		
		System.out.println("Addition of given number is: "+add(aInt,bInt));
				
		System.out.print("\nPlease enter first float : ");
		float aFloat=sc.nextFloat();
		System.out.print("\nPlease enter second float : ");
		float bFloat=sc.nextFloat();
		
		System.out.println("Addition of given number is: "+add(aFloat,bFloat));		

		sc.close();
	}
}
/*
Please enter first integer : 23

Please enter second integer : 123
Addition of given number is: 146

Please enter first float : 12.222222

Please enter second float : 1.111111
Addition of given number is: 13.333333
*/
