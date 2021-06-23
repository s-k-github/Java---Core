package day1;
import java.util.Scanner;
public class Day1_11_EvenOddSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		
		int evensum=0,oddsum=0;
		for(int i=1;i<=n;i++)
			if(i%2==0)
				evensum+=i;
			else
				oddsum+=i;
		System.out.print("\nAddition of even numbers from 1 to "+n+" : "+evensum);
		System.out.print("\nAddition of odd numbers from 1 to "+n+" : "+oddsum);
		sc.close();
	}
}
/*
 * 
 *Please enter a number : 20
 *
 *Addition of even numbers from 1 to 20 : 110
 *Addition of odd numbers from 1 to 20 : 100*/
 