package day4;

import java.util.Scanner;

public class Day4_3_TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.GetSetEmployeeInfo(sc);
		
		sc.nextLine();

		
		e2.GetSetEmployeeInfo(sc);
		sc.close();
		e1.calculate();
		e2.calculate();
		
	}
}

class Employee
{	
	public static int EmployeeId=0;
	private String EmployeeName="";
	private double BasicSalary=0,HRA=0,Medical=0,PF=0,PT=200,NetSalary=0,GrossSalary=0;
	
	
	protected void GetSetEmployeeInfo(Scanner sc)
	{
		
		System.out.println("\nPlease Enter Following details of employee:\n------------------------------------------");
		System.out.print("ID : ");
		EmployeeId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Name : ");
		EmployeeName=sc.nextLine();
		
		System.out.print("Basic Salary : ");
		BasicSalary=sc.nextDouble();
			
		
	}
	protected void calculate()
	{
		HRA=BasicSalary*0.5;
		PF=BasicSalary*0.12;
		GrossSalary=BasicSalary+ HRA + Medical;
		NetSalary=GrossSalary-(PT+PF);
		
		System.out.print("\n------------------------------------------\nID : "+EmployeeId+"\nName : "+EmployeeName+"\nSalary : "+BasicSalary+"\nHRA : "+HRA+"\nMedical : "+Medical+"\nPF : "+PF+"\nPT : "+PT+"\nNet Salary : "+NetSalary+"\nGrossSalary : "+GrossSalary+"\n----------------------------------------\n");
	}	
}
/*
Please Enter Following details of employee:
------------------------------------------
ID : 1212
Name : supriya kolhe
Basic Salary : 30000

Please Enter Following details of employee:
------------------------------------------
ID : 1213
Name : sejal kolhe
Basic Salary : 29000

------------------------------------------
ID : 1213
Name : supriya kolhe
Salary : 30000.0
HRA : 15000.0
Medical : 0.0
PF : 3600.0
PT : 200.0
Net Salary : 41200.0
GrossSalary : 45000.0
----------------------------------------

------------------------------------------
ID : 1213
Name : sejal kolhe
Salary : 29000.0
HRA : 14500.0
Medical : 0.0
PF : 3480.0
PT : 200.0
Net Salary : 39820.0
GrossSalary : 43500.0
----------------------------------------
*/
