package temp;

/*OUTCOME: Count number of occurrences once user enters string which can be alphanumeric.
 *
 *POSSIBLE CONDITIONS CONSIDERED:
 *     1: User enter non alphanumeric string
 *     2: Whitespace are't allowed
 *     3: If input is not provided
 */

import java.util.*;
import java.util.regex.*;

class Duplicate_char_count
{
	private static boolean result;
	private static Scanner sc=new Scanner(System.in);
	private static String s="";
	static int count=0;
	//constructor to input string
	//Program will ask for input again ana again until user provides the acceptable input.
	Duplicate_char_count()
	{
		System.out.print("Enter string: ");
		s=sc.nextLine();
	}
	
	//count character occurrences
	//Regex is used to check for alphanumeric input
	//result variable indicates whether the program has satisfied user's need of output or not.
	void Operation() throws InputMismatchException
	{
		int len=s.length();
		char[] c=s.toCharArray();
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher match = pattern.matcher(s);
		boolean val = match.find();
		if(!val )
		{
			System.out.println(match);
		for(int i=0;i<len;i++)
		{
			if(c[i]=='\0') 
			{
				continue;
			}
			System.out.print("\n"+c[i]+": ");
			count=1;
			for(int j=i+1;j<len;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='\0';
					count++;
				}
			}//j loop ended
			System.out.print(count);
			result=true;
		}//i loop ended
		}//if block ended
		else
		{
			result=false;
			throw new InputMismatchException();
		}
	}
	public static void main(String[] args)
	{
		System.out.println("DUPLICATE CHARACTER PROGRAM STARTED\n");
		do 
		{
			try
			{
				Duplicate_char d=new Duplicate_char();
				d.Operation();
			}//end try
			catch(InputMismatchException i)
			{
				System.out.println("Exception: Please enter nothing but string without whitespaces\n");
			}
		}while(!result);
		System.out.println("\n\nDUPLICATE CHARACTER PROGRAM ENDED\n");
	}//end psvm
}//end class