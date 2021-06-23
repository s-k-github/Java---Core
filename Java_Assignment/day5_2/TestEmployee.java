/*Problem Statement 2:
2.1: Create Employee class with empid,name,address,salary.Use Getter Setters
2.2 :create array of 5 employees...show all employees using for loop as well as for each loop...in same assignment
2.3:create array of 5 employees ...show those employee who are getting salary >20000.*/

package day5_2;

import java.util.Scanner;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Employees: ");
		int n = sc.nextInt();
		Day5_2_Employee[] emp= new Day5_2_Employee[n];
		for(int i=0; i<emp.length; i++)
		{	
			emp[i]= new Day5_2_Employee();
			System.out.println("");
			System.out.println("Enter Employee details: ");
			emp[i].acceptInfo();
		}
		
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("-----------------------------------------");
			System.out.println("Employee "+(i+1)+"...");
			System.out.println("");
			emp[i].displayInfo();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Employees with 20000+ Salary... ");
		for(int i=0; i<emp.length; i++)
		{	
			if(emp[i].getSalary()>20000)
			{
				System.out.println(emp[i].getEmpId()+"\t"+emp[i].getName());
				System.out.println("");
			}
		}
		sc.close();
		
	}
}
