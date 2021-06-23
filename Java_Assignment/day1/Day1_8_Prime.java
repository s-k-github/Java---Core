package day1;
import java.util.Scanner;
public class Day1_8_Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int a=sc.nextInt();
		
		boolean check=true;
		for(int i=2;i<=a/2;i++)
			if(a%i==0)
			{
				check=false;
				break;
			}
		if(check)
			System.out.print("\n"+a+" is a prime number");
		else
			System.out.print("\n"+a+" is not a prime number");
		sc.close();
	}
}
/*
Please enter a number : 23

23 is a prime number*/