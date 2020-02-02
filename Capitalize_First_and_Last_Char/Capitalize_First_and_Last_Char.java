/*  1. Capitalize the first and last character of each word in a string.
    2. Input will only contain characters. 
	3. Input can't be space/whitespace.
 */


import java.util.*;
class Capitalize_First_and_Last_Char
{
	private static Scanner sc=new Scanner(System.in);
	static String s="";
	static void input()
	{
		try
		{
			System.out.print("Enter String: ");
			s=sc.nextLine();
			if(s.isEmpty() || s.replace(" ","").equals(""))
			{
				System.out.println("Provided input is blank. Please try again"+"\n----------------------------------------------");
				System.exit(0);
			}
			String s1=s.replaceAll(" ","");
			char[] chars=s1.toCharArray();
			for (char c : chars) 
			{
				if(!Character.isLetter(c))
				{
					System.out.println("Please enter characters only\n----------------------------------------------");
					System.exit(0);
				}
			}
			
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Invalid input entered\n----------------------------------------------");
		}
	}
	
	void operation()
	{
		
		    char[] chars=s.toCharArray();
			int j=chars.length-1;
			//Capitalize first character from array
			chars[0]=Character.toUpperCase(chars[0]);
			
			//Capitalize last character from array
			chars[j]=Character.toUpperCase(chars[j]);
			
			//Capitalize each character which appears before and after whitespace
			//Next if block is used to optimize the code i.e. if string without any space is entered then there is no need to access each and evry element of string
			if(s.contains(" "))
			{
				for(int i=1;i<chars.length-1;i++)
			    {
					if(Character.isWhitespace(chars[i]) && !Character.isWhitespace(chars[i-1]))
					{
						chars[i-1]=Character.toUpperCase(chars[i-1]);
						chars[i+1]=Character.toUpperCase(chars[i+1]);
					}
				}
			}
			//print ourput
			System.out.print("\nOUTPUT: ");
			System.out.print(chars);
	}
	public static void main(String args[])
	{
		Capitalize_First_and_Last_Char k=new Capitalize_First_and_Last_Char();
		input();
	    k.operation();
	}
}