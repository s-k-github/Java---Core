package day1;
import java.util.Scanner;
public class Day1_2_Addition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		System.out.print("\nPlease enter second number: ");
		int b=sc.nextInt();
		
		System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
		
		System.out.print("\nPlease enter first character : ");
		char x=sc.next().charAt(0);
		System.out.print("\nPlease enter second character : ");
		char y=sc.next().charAt(0);
		
		System.out.println("Addition of "+x+" and "+y+" is : "+(x+y));
		sc.close();
	}
}
/*
Please enter first number : 10

Please enter second number: 20
Addition of 10 and 20 is : 30

Please enter first character : e

Please enter second character : f
Addition of e and f is : 203
*/