package day1;
import java.util.Scanner;
public class Day1_7_Powerr 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		
		System.out.print("\nPlease enter power : ");
		int power=sc.nextInt();
		
		System.out.print("\n "+n+"^"+power+" : "+Math.pow(n, power));
		sc.close();
	}

}
/*
Please enter a number : 20

Please enter power : 2

 20^2 : 400.0*/