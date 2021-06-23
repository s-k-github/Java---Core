
package day1;
import java.util.Scanner;
public class Day1_10_Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		int copy=n,sum=0;
		while(n>0)
		{
			int lastdigit=n%10;
			sum=sum*10+lastdigit;
			n/=10;
		}
		if(copy==sum)
			System.out.print("\nGiven number is Palindrome");
		else
			System.out.print("\nGiven number is not Palindrome");
		sc.close();
		
	}
}
/*
 * 
Please enter a number : 2345

Given number is not Palindrome*/
