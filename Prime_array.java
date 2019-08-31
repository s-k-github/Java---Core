//CHECK ARRAY FOR PRIME NUMBERS AND PRINT THEM IN ASCENDING ORDER

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
class Prime_array
{
	/*14: DECLARING LENGTH:-------STORE INPUT ARRAY LENGTH,
	  15:    	SCANNER:------OBJECT OF SCANNER CLASS,
	  16:		INPUT ARRAY:--STORE ARRAY PROVIDED BY USER,
	  17:		ARRAYLIST:----STORE PRIME ELEMENTS OF INPUT ARRAY*/
	protected static int len;
	protected static Scanner sc,s;
	protected static float[] a;
	protected static ArrayList<Float> b=new ArrayList<Float>();
	
	//CONSTRUCTOR TO PERFORM INPUT OPERATIONS
	/*29. INPUT ARRAY LENGTH
          30: THROW EXCEPTION WHEN ARRAY LENGTH IS ENTERED AS 0
	  33. INITIALIZE ARRAY WITH LENGTH
          35. INPUT ARRAY ELEMENTS*/
	Prime_array()
	{
	        try
		{	sc=new Scanner(System.in);
			System.out.print("\nEnter length of an array:");
			len=sc.nextInt();
			if(len==0)
				throw new IllegalArgumentException();
			a=new float[len];
			System.out.println();
			for(int i=0;i<len;i++)
			{
				System.out.print("a["+(i)+"]:  ");
				a[i]=sc.nextFloat();
			}
			
		}//end try
		
		//IF ENTERED INVALID INPUT SUCH AS STRING OR SPECIAL SYMBOL OR CHARACTER AND SO ON
		catch(InputMismatchException ne)
		{
			System.out.println("\nInvalid input\n*********************************************");
			System.exit(0);
		}
		
		//IF ENETERED NEGATIVE SIZE ARRAY
		catch(NegativeArraySizeException ne)
		{
			System.out.println("\nNegative array is entered\n*********************************************");
			System.exit(0);
		}
		
		//IF ARRAY LENGTH IS PASSED AS 0
		catch(IllegalArgumentException il)
		{
			System.out.println("\nArray size can't be 0\n*********************************************");
			System.exit(0);
		}
	}//end constructor
	
	//FIND PRIME ELEMENTS OF AN ARRAY
	/*77: CLEAR ARRAYLIST BECAUSE OF DO WHILE LOOP IN MAIN METHOD
	  78: i FOR LOOP TO ACCESS EASCH ELEMENT OF ARRAY SEQUENTIALL
	  80: IF i'th ELEMENT 0 OR 1 THEN CONTINUE FOR LOOP BY INCREMENTING i VALUE.
	        REASON: ANY -VE NUMBER AND 0 AND 1 ARE NOT PRIME NUMBERS. THIS WILL SAVE EXECUTION TIME
	  82: DECLARE DIV FLAG
	  83: divider LOOP FOR DIVIDING EACH ARRAY ELEMENT WITH NUMEBRS FALLS BETWEEN 2 AND ELEMENT/2
	  85: RESET IF ELEMENT IS DIVISIBLE BY AT LEAST ONE NUMBER EXCEPT 0,1 AND ITSELF
	  91: IF div FLAG IS RESET THEN BREAK THE LOOP ELSE ADD THE ELEMENT INTO ARRAYLIST
	*/
	void find_prime()
	{
		b.clear();
		for(int i=0;i<len;i++)
		{
			if(a[i]<2)
				continue;
			boolean div=false;
			for(int divider=2;divider<=(a[i]/2);divider++)
			{ 
				if(a[i]%divider==0)
				{
					div=true;
					break;
				}
			}//end divider for loop
			if(!div)
				b.add(a[i]);
		}//end i for loop
	}
	
	//PRINT ARRAYLIST CONTAINING PRIME ELEMENTS
	void print()
	{
		if(b.isEmpty())
			System.out.println("No prime element found");
		else
		{
			Collections.sort(b);
			System.out.print("Sorted array with prime numbers:  ");
			for(float a1 : b)
			{
				System.out.print("\nb["+b.indexOf(a1)+"]:  "+a1);
			}
		}
	}
	
	//MAIN METHOD
	/*
	  121:DO WHILE LOOP: PROGRAM KEEPS REPEATING ITSELF ACCORDING TO USER'S CHOICE & UNTIL EXCEPTION OCCURS
	  124: CREATING CLASS OBJECT
	  125: CALLING find_prime() METHIOD USING OBJECT
	  126: CALLING print() METHIOD USING OBJECT*/
	public static void main(String[] args)
	{
		int ch=1;
		try{
			do
			{
				s=new Scanner(System.in);
				Prime_array p=new Prime_array();
				p.find_prime();
				p.print();
				System.out.println("\n.............................................");
				System.out.println("\n\nDo you want to continue? 1 for yes");
				ch=s.nextInt();
				System.out.println("\n.............................................");
			}while(ch==1);
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Invalid input entered\n*********************************************");
		}
	}//end main
}//end class
