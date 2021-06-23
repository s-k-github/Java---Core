package day1;
import java.util.Scanner;
public class Day1_9_SumFrom1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();

		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.print("\nAddition from 1 to "+n+" : "+sum);
		sc.close();
	}

}
/*
Please enter a number : 9

Addition from 1 to 9 : 45*/