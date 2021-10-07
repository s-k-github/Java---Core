package practise;

import java.util.Scanner;

import java.util.*;

public class FactorialOfNumber {
	private static int n;
	public static void main(String args[]) {
		FactorialOfNumber f=new FactorialOfNumber();
		try(Scanner sc=new Scanner(System.in)){		
		    System.out.println("Enter integer: ");
		    n=sc.nextInt();
		    System.out.println("Factorial: "+f.factorial(n));
		    
		}
		catch(InputMismatchException e) {
			System.err.print("Exception InputMismatchException occured\n");
			e.printStackTrace();
		}
		catch(StackOverflowError e) {
			System.err.print("Exception StackOverflowError occured\n");
			
		}
		catch(NumberFormatException e) {
			System.err.print("Exception NumberFormatException occured\n");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.print("Exception Exception occured\n");
			e.printStackTrace();
		}
	}
	int factorial(int n) {
		if(n==0)
			return 0;
		return n*factorial(n-1);
	}
	FactorialOfNumber(){
		n=0;
	}
}