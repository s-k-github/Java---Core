package practise;

import java.util.Scanner;
import java.lang.Math;


import java.util.*;

public class Armstrong {
	
	private static int result=0;
	private static int inputLength=0;
	public static void main(String args[]) {
		
		try(Scanner sc=new Scanner(System.in)){		
		    System.out.println("Enter integer: ");
		    int n=sc.nextInt();
		    Armstrong f=new Armstrong();
		    inputLength=String.valueOf(n).length();
		    if(f.armstrongRecursion(n)==n)
		    	System.out.print(n+" is an Armstrong Number.");
		    else
		        System.out.print(n+" is not an Armstrong Number.");		    
		}
		catch(InputMismatchException e) {
			System.err.print("Exception InputMismatchException occured\n");
//			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.print("Exception Exception occured\n");
//			e.printStackTrace();
		}
	}
	int armstrongRecursion(int n) {
		if(n>0){			
			result+=Math.pow(n%10,inputLength);
			return armstrongRecursion(n/=10);
		}
		return result;
	}	
}

//	Enter integer: 
//	548834
//	548834 is an Armstrong Number.