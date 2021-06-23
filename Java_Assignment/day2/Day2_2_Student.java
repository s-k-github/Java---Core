package day2;
import java.util.Scanner;
public class Day2_2_Student 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Following information of student: ");
		System.out.print("RollNo : ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.print("Address :");
		String name=sc.nextLine();
		
		System.out.println("Marks of top 5 subjects : ");
		System.out.print("Subject 1 : ");
		int sub1=sc.nextInt();
		System.out.print("Subject 2 : ");
		int sub2=sc.nextInt();
		System.out.print("Subject 3 : ");
		int sub3=sc.nextInt();
		System.out.print("Subject 4 : ");
		int sub4=sc.nextInt();
		System.out.print("Subject 5 : ");
		int sub5=sc.nextInt();
		
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.print("\nTotal : "+total);
		double percentage=(total/5.0);
		System.out.print("\nPercentage : "+percentage);
		char grade='\0';
		if(percentage>75.0)
			grade='A';
		else if(percentage<74.0 && percentage>60.0)
			grade='B';
		else if(percentage<59)
			grade='C';
		
		System.out.print("\nRoll Number : "+roll);
		System.out.print("\nName : "+name);
		System.out.print("\nGrade: "+grade);
		sc.close();

	}

}
/*
Please Enter Following information of student: 
RollNo : 1212
Address :Thane Mumbai
Marks of top 5 subjects : 
Subject 1 : 99
Subject 2 : 98
Subject 3 : 97
Subject 4 : 96
Subject 5 : 94

Total : 484
Percentage : 96.8
Roll Number : 1212
Name : Thane Mumbai
Grade: A*/
