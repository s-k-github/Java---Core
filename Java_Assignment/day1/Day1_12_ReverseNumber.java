package day1;
import java.util.Scanner;
public class Day1_12_ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		int copy=n,reverse=0;
		while(n>0)
		{
			int lastdigit=n%10;
			reverse=reverse*10+lastdigit;
			n/=10;
		}
		System.out.print("\nReverse of "+copy+" is : "+reverse);
		
		sc.close();
	}
}
/*
Please enter a number : 1234

Reverse of 1234 is : 4321*/