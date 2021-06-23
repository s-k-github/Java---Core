package day5_1_pack1;

import java.util.Scanner;

public class Student 
{
	public static int rollNo=0;
	public static String name="";
	private static String grade="";
	static int totalMarks=0;
	public static Scanner sc=new Scanner(System.in);
	
	public static int getTotalMarks()
	{
		return totalMarks;
	}
	public static String getGrade()
	{
		return grade;
	}
	public void accept()
	{
		
		System.out.print("RollNo: ");
		rollNo=sc.nextInt();

		sc.nextLine();
		System.out.print("Name: ");
		name=sc.nextLine();
		
		System.out.print("Total Marks: ");
		totalMarks=sc.nextInt();
		
		if(totalMarks>=95 || totalMarks<=100)
			grade="A+";
		if(totalMarks>=90 || totalMarks<=94)
			grade="A";
		if(totalMarks>=85 || totalMarks<=89)
			grade="B+";
		if(totalMarks>=80 || totalMarks<=84)
			grade="B";
		if(totalMarks>=75 || totalMarks<=79)
			grade="C";
		if(totalMarks>=70 || totalMarks<=74)
			grade="C+";
		if(totalMarks>=65 || totalMarks<=69)
			grade="D+";
		if(totalMarks>=60 || totalMarks<=64)
			grade="D";
		if(totalMarks>=0 || totalMarks<=59)
			grade="F";
		
			
	}
	public void display()
	{
		System.out.print("\nStudent Class Data: \nRollNo\tName\tTotalMarks\tGrade\n"+rollNo+"\t"+name+"\t"+totalMarks+"\t\t"+grade+"\n----------------------------------------------------------------------------------------------\n");
	}
}


