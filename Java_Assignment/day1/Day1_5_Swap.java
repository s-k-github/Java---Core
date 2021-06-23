package day1;
import java.util.Scanner;
public class Day1_5_Swap 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		
		System.out.print("\nPlease enter second number : ");
		int b=sc.nextInt();
		System.out.print("\nBefore-> a: "+a+", b: "+b);		
		a+=b;
		b=a-b;
		a=a-b;
		System.out.print("\nAfter-> a: "+a+", b: "+b);		
		sc.close();
	}

}
/*
Please enter first number : 20

Please enter second number : 30

Before-> a: 20, b: 30
After-> a: 30, b: 20*/