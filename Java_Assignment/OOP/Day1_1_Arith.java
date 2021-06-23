/*
Accept  i/ps from User , till user enters "quit" or any other option.
I/P : operation(add|sub|mult|div) , number1(double) , number2(double) 
Display the result of the operation.
It should be done in a loop , till user enters "quit" 
*/
import java.util.Scanner;

class Day1_1_Arith
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		double a=0,b=0,result;
		String ch="";
		System.out.println("List of Operations:->\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Division\n 5. Modulus\n quit or any other number. Exit");
		while(true)
		{
			System.out.print("\n------------------------------------------\nEnter the choice : ");
			ch=sc.next();
			switch(ch)
			{
				case "1": 
					System.out.print("------------------------------------------");
					System.out.print("\nPlease enter first number : ");
					a=sc.nextDouble();
					System.out.print("Please enter second number : ");
					b=sc.nextDouble();
					System.out.print("Addition : "+(a+b));
					break;
				case "2": 
					System.out.print("------------------------------------------");
					System.out.print("\nPlease enter first number : ");
					a=sc.nextDouble();
					System.out.print("Please enter second number : ");
					b=sc.nextDouble();
					System.out.print("Subtraction : "+(a-b));
					break;
				case "3":
					System.out.print("------------------------------------------");
					System.out.print("\nPlease enter first number : ");
					a=sc.nextDouble();
					System.out.print("Please enter second number : ");
					b=sc.nextDouble();
					System.out.print("Multiplication : "+(a*b));
					break;
				case "4":
					System.out.print("------------------------------------------");
					System.out.print("\nPlease enter first number : ");
					a=sc.nextDouble();
					System.out.print("Please enter second number : ");
					b=sc.nextDouble();
					System.out.print("Division : "+(a/b));
					break;
				case "5":
					System.out.print("------------------------------------------");
					System.out.print("\nPlease enter first number : ");
					a=sc.nextDouble();
					System.out.print("Please enter second number : ");
					b=sc.nextDouble();
					System.out.print("Modulus : "+(a%b));
					break;
				case "quit":
				default: System.out.println("Thank you for using our application. Hope to see you soon");
					
			}
		}
	}
}
/*
E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\src>javac Day1_1_Arith.java

E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\src>java Day1_1_Arith
List of Operations:->
 1. Add
 2. Subtract
 3. Multiply
 4. Division
 5. Modulus
 quit or any other number. Exit

------------------------------------------
Enter the choice : 1
------------------------------------------
Please enter first number : 23
Please enter second number : 23
Addition : 46.0
------------------------------------------
Enter the choice : 2
------------------------------------------
Please enter first number : 23
Please enter second number : 20
Subtraction : 3.0
------------------------------------------
Enter the choice : 3
------------------------------------------
Please enter first number : 23
Please enter second number : 23
Multiplication : 529.0
------------------------------------------
Enter the choice : 4
------------------------------------------
Please enter first number : 23
Please enter second number : 10
Division : 2.3
------------------------------------------
Enter the choice : 5
------------------------------------------
Please enter first number : 23
Please enter second number : 10
Modulus : 3.0
------------------------------------------
Enter the choice : quit
Thank you for using our application. Hope to see you soon
*/ 