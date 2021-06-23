package day5_4;

public class Day5_4_TestCustomer 
{
	public static void main(String[] args) 
	{
		System.out.println("Default Constructor ->");
		Day5_4_Customer cust1=  new Day5_4_Customer();
		System.out.println(cust1.getDetails());
		
		System.out.println("\nParemeterised Constructor->");
		Day5_4_Customer cust2 = new Day5_4_Customer("supriya","supriya@gmail.com",23,30000.0);
		System.out.println(cust2.getDetails());
		
		cust2.setCreditLimit(20000);
		System.out.println("\nUpdated credit limit:->");
		System.out.println(cust2.getDetails());

	}
}
