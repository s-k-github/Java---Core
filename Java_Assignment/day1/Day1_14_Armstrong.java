package day1;
import java.util.Scanner;
public class Day1_14_Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=s.nextInt();
		s.close();

		int copy=n,lastdigit,sum=0,length=0;

		for (;copy != 0; copy /= 10, ++length);
		copy=n;
		while(n>0)
		{
			lastdigit=n%10;
			sum+=Math.pow(lastdigit, length);
			n/=10;
		}
		
		if(copy==sum)
			System.out.print("Number is a armstrong number");
		else
			System.out.print("Number is not a armstrong number");
		
	}
}
/*
Please enter a number : 20
Number is not a armstrong number*/