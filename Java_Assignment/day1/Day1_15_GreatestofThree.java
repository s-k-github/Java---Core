package day1;
import java.util.Scanner;
public class Day1_15_GreatestofThree 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		System.out.print("\nPlease enter second number : ");
		int b=sc.nextInt();
		System.out.print("\nPlease enter third number : ");
		int c=sc.nextInt();
		
		if(a>=b)
			if(a>=c)
				System.out.print("\nGreatest number: "+a);
			else
				System.out.print("\nGreatest number: "+c);				
		else if(b>=a)
			if(b>=c)
				System.out.print("\nGreatest number: "+b);
			else
				System.out.print("\nGreatest number: "+c);
			
		sc.close();
	}
}
/*
Please enter first number : 20

Please enter second number : 10

Please enter third number : 5

Greatest number: 20*/
 