package day5_2;

import java.util.Scanner;
public class Day5_2_Employee 
{
	private int empId;
	private String name;
	private String address;
	private double salary;
	private Scanner sc = new Scanner(System.in);
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptInfo()
	{
		
		System.out.print("Enter Id: ");
		setEmpId(sc.nextInt());
		System.out.print("Enter Name: ");
		setName(sc.next());
		sc.nextLine();
		System.out.print("Enter Address: ");
		setAddress(sc.nextLine());
		System.out.print("Enter Salary: ");
		setSalary(sc.nextDouble());
	}
	
	public void displayInfo()
	{
		System.out.println("Id: "+getEmpId());
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAddress());
		System.out.println("SAlary: "+getSalary());
		
	}
}
/*Enter number of Employees: 2

Enter Employee details: 
Enter Id: 1212
Enter Name: Supriya Kolhe
Enter Address: Mumbai
Enter Salary: 30000

Enter Employee details: 
Enter Id: 1000
Enter Name: Sejal Kolhe
Enter Address: Pune
Enter Salary: 29000
-----------------------------------------
Employee 1...

Id: 1212
Name: Supriya
Address: Mumbai
SAlary: 30000.0
-----------------------------------------
Employee 2...

Id: 1000
Name: Sejal
Address: Pune
SAlary: 29000.0
-----------------------------------------
Employees with 20000+ Salary... 
1212	Supriya

1000	Sejal

*/
