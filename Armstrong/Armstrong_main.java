/*1: Find out whether number is armstrong or not.
  2: Program will keep running unless
     a: user asks to abort it
	 b: exception occurs
  3: Inheritance
*/
import java.util.*;

//main class
//accept input and chec for conditions
class Armstrong_main
{
	protected static int input_copy,sum=0,input=0;
	private static Scanner sc;
	public static void main(String[] args)
	{
		get();
	}
		
	//accept number and choice to restart the program
	//close scanner
	static void get()
	{
		int ch=0;
		sc=new Scanner(System.in);
		try
		{
			do
			{
				System.out.print("\n--------------------------------------\nENTER NUMBER TO CHECK ARMSTRONG: ");
				input=sc.nextInt();
				System.out.println(input);
				if(input<0)
				{
					System.out.print("Please enter positive integer\n");
					ch=1;
					continue;
				}
				Armstrong_operation.armstrong();
				System.out.print("Options: \n 1: press '1' for yes\n 2: press any other number for no\nDo you want to continue? ");
				ch=sc.nextInt();
			}while(ch==1);
			sc.close();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("WRONG INPUT ENTERED\n--------------------------------------");
		}
	}
	
}

//calculations to check is number is armstrong or not
class Armstrong_operation extends Armstrong_main
{
	protected static int input_copy,sum=0;
	
	
	static void armstrong()
	{
		String length=String.valueOf(input);
		input_copy=input;
		for(int i=0;i<length.length();i++)
		{
			int remainder=input_copy%10;
			sum+=Math.pow(remainder,length.length());
			input_copy/=10;
		}
		
		if(input==sum)
			System.out.println("\n"+input+" IS ARMSTRONG NUMBER\n-------------------------------");
		else
			System.out.println("\n"+input+" ISN'T ARMSTRONG NUMBER\n------------------------------");
	}
	
}
