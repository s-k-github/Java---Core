package day2;
import java.util.Scanner;
public class Day2_10_Salary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter basic salary of an employee: ");
		Double basic=sc.nextDouble();
		sc.close();
		
		Double gross,da,hra;
		if(basic<=0)
		{
			System.out.print("Salary can't be less than 0");
			System.exit(0);
		}
		if(basic<=10000)
		{
			da=basic*0.8;
			hra=basic*0.2;
		}
		else if(basic<=20000)
		{
			da=basic*0.9;
			hra=basic*0.25;
		}
		else
		{
			da=basic*0.95;
			hra=basic*0.3;
		}
		gross=basic+da+hra;
		System.out.print("Gross Salary : "+gross);
	}
}
/*
Please enter basic salary of an employee: 30000
Gross Salary : 67500.0*/
