/* 1: Calculate factorial or fibonacci series of a given numbers
   2: Privided number must be greater than 0
   3: BigInteger is used to work with big numbers
*/
import java.util.*;
import java.math.BigInteger; 

class Factorial_Fibonacci
{
	private Scanner sc;
	
	private static  BigInteger fact = new BigInteger("1");
	private static  BigInteger first = new BigInteger("0");
	private static  BigInteger second = new BigInteger("1");
	private static  BigInteger sum = new BigInteger("0");
	void fact()
	{
		System.out.print("\n--------------------------------------\nNUMBER TO FIND FACTORIAL: ");
		sc=new Scanner(System.in); 	

		//try block to catch non-numeric input- exception
		try
		{
			float fact_limit=sc.nextInt();
			if(fact_limit<1)
			{
				System.out.println("PLEASE ENTER INPUT ABOVE 0");
				System.exit(0);
			}
			for(int i=2;i<=fact_limit;i++)
			{
				//Main operation
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println("FACTORIAL: "+fact);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("INPUT MUST ONLY CONTAIN NUMBERS. \nPLEASE TRY AGAIN\n--------------------------------------\n");
			System.exit(0);
		}
	}
	void Fibo()
	{	
		System.out.print("\nNUMBER TO FIND FIBONACCI: ");
		sc=new Scanner(System.in); 	
		
		//try block to catch non-numeric input- exception
		try
		{
			int fibo=sc.nextInt();
			
			if(fibo<1)
			{
				System.out.println("PLEASE ENTER INPUT ABOVE 0");
				System.exit(0);
			}
			System.out.print(first);
			for(int i=1;i<=fibo;++i)
			{
				System.out.print(" + "+second);
				
				//Main operation
				sum = first.add(second);
				first=second;
				second=sum;
				

			}
			System.out.println("\n--------------------------------------");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("INPUT MUST ONLY CONTAIN NUMBERS. \nPLEASE TRY AGAIN\n--------------------------------------\n");
			System.exit(0);
		}
	}
}
class Factorial_Fibonacci_Main
{
	public static void main(String[] args)
	{
		Factorial_Fibonacci s=new Factorial_Fibonacci();
		s.fact();
		s.Fibo();
	}
}


//0 1 1 2 3 5 8 13