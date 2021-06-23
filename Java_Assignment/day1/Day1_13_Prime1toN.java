package day1;
import java.util.Scanner;
public class Day1_13_Prime1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int a=sc.nextInt();
		
		int counter;
		System.out.print("Prime numbers from 1 to "+a+" : ");
		for(int j=2;j<=a;j++)
		{
			counter=0;
			for(int i=2;i<=j;i++)
				if(j%i==0)
						counter++;
			if(counter==1)
				System.out.print(j+"  ");
		}
		sc.close();
		
	}
}
/*
Please enter a number : 20
Prime numbers from 1 to 20 : 2  3  5  7  11  13  17  19  */