package day4;
import java.util.Scanner;

public class Day4_2_TestCustomer
{
	public static void main(String[] args)
	{
		Customer customer = new Customer();
		System.out.println("Customer 1 Details:");
		customer.acceptInfo();
		customer.showDetails();
		
		System.out.println("Customer 2 Details:");
		Customer customer2 = new Customer("supriya","supriya@gmail.com",22,22000.00);
		customer2.showDetails();
		
		customer2.setAge(25);
		customer2.setEmail("supriya@gmail.com");
		customer2.setName("Supriya Kolhe");
		customer2.setCreditLimit(23000.50);
		
		System.out.println("\nCustomer 2 changed credit limit\nDetails of customer 2:\n");
		System.out.println("Email : "+customer2.getEmail());
		System.out.println("Name : "+customer2.getName());
		System.out.println("Age : "+customer2.getAge());
		System.out.println("New credit limit : "+customer2.getCreditLimit());
		
	}
}


class Customer
{
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	private static final Scanner scan = new Scanner(System.in);
	public Customer()
	{
		name = "Supriya";
		email = "supriya@gmail.com";
		age = 22;
	}
	public Customer(String name, String email,int age,double creditLimit)
	{
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;

	}
	public int getAge(){
		return this.age;
	}
	public double getCreditLimit() {
		return this.creditLimit;
	}
	public void showDetails() 
	{
		System.out.println("\n------------------------------------------------\nName : "+ this.name);
		System.out.println("Credit limit : "+ this.creditLimit+"\n------------------------------------------------\n");
	}
	public void acceptInfo() 
	{
		System.out.print("Enter customer's name : ");
		String name = scan.nextLine();
		setName(name);
		
		System.out.print("Enter customer's email : ");
		String email = scan.nextLine();
		setEmail(email);
		
		System.out.print("Enter customer's age : ");
		int age = scan.nextInt();
		setAge(age);
		
		System.out.print("Enter customer's credit limit : ");
		double creditLimit = scan.nextDouble();
		setCreditLimit(creditLimit);
	}
	
}
/*Customer 1 Details:
Enter customer's name : Supriya Kolhe
Enter customer's email : supriya@gmail.com
Enter customer's age : 23
Enter customer's credit limit : 30000

------------------------------------------------
Name : Supriya Kolhe
Credit limit : 30000.0
------------------------------------------------

Customer 2 Details:

------------------------------------------------
Name : supriya
Credit limit : 22000.0
------------------------------------------------


Customer 2 changed credit limit
Details of customer 2:

Email : supriya@gmail.com
Name : Supriya Kolhe
Age : 25
New credit limit : 23000.5
*/