package day5_4;

public class Day5_4_Customer 
{
	private static int objectCount = 0;
	private int id;
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public Day5_4_Customer() 
	{
		if(objectCount == 0)
			this.id = 100;
		else 
			this.id = 100 + objectCount;
		
		this.name = "Sejal";
		this.email = "Sejal@gmail.com";
		this.age = 23;
		this.creditLimit = 10000.0;
		objectCount++;
	}
	public Day5_4_Customer(String name, String email,int age, double creditLimit) 
	{
		this();
		this.name = name;
		this.email = email;
		this.age  = age;
		this.creditLimit = creditLimit;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public void setCreditLimit(double creditLimit) 
	{
		this.creditLimit = creditLimit;
	}
	public String getName() 
	{
		return name;
	}
	public String getEmail() 
	{
		return this.email;
	}
	public int getAge() 
	{
		return this.age;
	}
	public double getCreditLimit() 
	{
		return creditLimit;
	}
	public int getID(){
		return this.id;
	}
	public String getDetails() 
	{
		return "ID : " + id +"\nCustomer Name : "+ this.name + "\nCredit limit : " + this.creditLimit;
	}
}
/*
 Default Constructor ->
ID : 100
Customer Name : Sejal
Credit limit : 10000.0

Paremeterised Constructor->
ID : 101
Customer Name : supriya
Credit limit : 30000.0

Updated credit limit:->
ID : 101
Customer Name : supriya
Credit limit : 20000.0
*/
