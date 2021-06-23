package day1;
import java.util.Scanner;
public class Day1_6_Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		
		double fact=1;
		for(int i=1;i<=a;i++)
			fact*=i;
		
		System.out.print("\nFactorial of "+a+" : "+fact);
		sc.close();
	}
}
/*
Please enter first number : 8

Factorial of 8 : 40320.0*/