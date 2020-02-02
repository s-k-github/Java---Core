//please check the output for neet desciption of outcome.
//all possible input are considered

import java.util.*;
class Largest_char_in_string
{
	static String string="";
	static void input(Scanner sc)
	{
		try
		{
			System.out.println("Enter String");
			string=sc.nextLine();
			
			//INPUT MUSTN'T BE BLANK
			if(string.isEmpty() || string.replace(" ","").equals(""))
			{
				System.out.println("Provided input is blank. Please try again"+"\n----------------------------------------------");
				System.exit(0);
			}
			
			//INPUT MUST CONTAIN ONLY CHARACTERS
			string=string.replaceAll(" ","");
			char[] chars=string.toCharArray();
			for (char c : chars) 
			{
				if(!Character.isLetter(c))
				{
					System.out.println("Input must only contain characters\n----------------------------------------------");
					System.exit(0);
				}
			}
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Invalid input entered");
		}
	}
	void find_largest_char()
	{
		try
		{
		int max=0;
		string=string.replaceAll(" ","");
		for(int i=1;i<string.length();i++)
		{
			if(string.charAt(i)>string.charAt(max))
				max=i;
		}
		System.out.println("Largest character of "+string+" character is: "+string.charAt(max)+"\n----------------------------------------------");
		}
		catch(StringIndexOutOfBoundsException ie)
		{
			System.out.println("\nPlease check input "+ ie+"\n----------------------------------------------");
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		Largest_char_in_string l=new Largest_char_in_string();
		Scanner sc=new Scanner(System.in);
		
			input(sc);
			l.find_largest_char();
	}
}