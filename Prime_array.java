import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
class Prime_array
{
	/*DECLARING LENGTH:-------STORE INPUT ARRAY LENGTH,
				SCANNER:------OBJECT OF SCANNER CLASS,
				INPUT ARRAY:--STORE ARRAY PROVIDED BY USER,
				ARRAYLIST:----STORE PRIME ELEMENTS OF INPUT ARRAY*/
	protected static int len;
	protected static Scanner sc;
	protected static float[] a;
	protected static ArrayList<Float> b=new ArrayList<Float>();
	
	//CONSTRUCTOR TO PERFORM INPUT OPERATIONS
	Prime_array()
	{
		/*26. INPUT ARRAY LENGTH
		  27. INITIALIZE ARRAY WITH LENGTH
          29. INPUT ARRAY ELEMENTS*/
		try
		{
			sc=new Scanner(System.in);
			System.out.print("\nEnter length of an array:");
			len=sc.nextInt();
			a=new float[len];
			System.out.println();
			for(int i=0;i<len;i++)
			{
				System.out.print("Element "+i+":  ");
				a[i]=sc.nextFloat();
			}
			
		}//end try
		
		//IF ENTERED INVALID INPUT SUCH AS STRING OR SPECIAL SYMBOL OR CHARACTER AND SO ON
		catch(InputMismatchException ne)
		{
			System.out.println("\nPlease enter valid input\n");
			System.exit(0);
		}
		
		//IF ENETERED NEGATIVE SIZE ARRAY
		catch(NegativeArraySizeException ne)
		{
			System.out.println("\nNegative array array is entered");
		}
		
	}//end constructor
	
	//FIND PRIME ELEMENTS OF AN ARRAY
	/*61: i FOR LOOP TO ACCESS EASCH ELEMENT OF ARRAY SEQUENTIALL
	  63: DECLARE DIV FLAG
	  64: divider LOOP FOR DIVIDING EACH ARRAY ELEMENT WITH NUMEBRS FALLS BETWEEN 2 AND ELEMENT/2
	  66: RESET IF ELEMENT IS DIVISIBLE BY AT LEAST ONE NUMBER EXCEPT 0,1 AND ITSELF
	  72: IF div FLAG IS RESET THEN BREAK THE LOOP ELSE ADD THE ELEMENT INTO ARRAYLIST
	*/
	void find_prime()
	{
		for(int i=0;i<len;i++)
		{
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
		for(float a1 : b)
			System.out.print(" "+a1);
	}
	
	//MAIN METHOD
	/*90: CREATING CLASS OBJECT
	  91: CALLING find_prime() METHIOD USING OBJECT
	  92: CALLING print() METHIOD USING OBJECT	*/
	public static void main(String[] args)
	{
		Prime_array p=new Prime_array();
		p.find_prime();
		p.print();
	}//end main
}//end class