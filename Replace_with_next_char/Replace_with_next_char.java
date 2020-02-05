/*  1. Replace current character with very next charcter
    2. Input will only contain characters. 
	3. Input: alphabets
	          whitespace
 */

import java.util.*;
class Replace_with_next_char
{
	static String str=null;
	
	//Input method: Accept input until valid value is entered
	private static void input(Scanner sc)
	{	
		
		try
		{
			int correct_input=1;
			do
			{
				System.out.print("\nPlease enter a string: ");
				str=sc.nextLine();
				
				//check if input is empty
				if(str.isEmpty())
				{
					System.out.println("Please enter valid input.\n------------------------------------------");
					correct_input=0;
					continue;
				}
				else
				{
					correct_input=1;
					
				}
				//check if input contains only letters
				String s1=str.replaceAll(" ","");
				char[] chars=s1.toCharArray();
				for (char c : chars) 
				{
					if(!Character.isLetter(c))
					{
						System.out.println("Please enter characters only\n----------------------------------------------");
						correct_input=0;
						break;
					}
				}
			}while(correct_input==0);
			operation();
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Please enter corrent input\n------------------------------------------");
		}
	}
	
	//change character with current+n	character
	private static void operation()
	{
		System.out.print("\nEncrypted value: ");
		char[] c=str.toCharArray();
		for(char c1: c)
		{
			if(Character.isWhitespace(c1))
			{	
				System.out.print(" ");
				continue;
			}
			
			if(c1==90|| c1==122)
				System.out.print((char)(c1-25));
			else 
				System.out.print((char)(++c1));
		}
		System.out.println("\n------------------------------------------");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		input(sc);
		
	}
}