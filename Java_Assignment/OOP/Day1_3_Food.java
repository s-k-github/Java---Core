/*
3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/

import java.util.Scanner;
class Day1_3_Food
{
	public static void main(String[] args)
	{
		int dosa=60,vadaPav=15,tea=10,samosa=15,pavBhaji=30,Pizza=150,pasta=100,burger=60,maggie=10;
		String item="";
		int total=0,quantity=0,ch=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Items in the list\n 1. dosa\n 2. vadaPav\n 3. tea\n 4. samosa\n 5. pavBhaji\n 6. Pizza,\n 7. pasta\n 8. burger\n 9. maggie\n 10. exit");
		while(true)
		{
			System.out.print("\nEnter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("------------------------------------------\nPlease enter quantity for dosa (1 dosa=60) : ");
					quantity=sc.nextInt();
					total+=(dosa*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 2:
					System.out.print("------------------------------------------\nPlease enter quantity for vada pav (1 vadaPav=15) : ");
					quantity=sc.nextInt();
					total+=(vadaPav*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 3:
					System.out.print("------------------------------------------\nPlease enter quantity for tea (1 tea=10) : ");
					quantity=sc.nextInt();
					total+=(tea*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 4:
					System.out.print("------------------------------------------\nPlease enter quantity for samosa (1 samosa=15) : ");
					quantity=sc.nextInt();
					total+=(samosa*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 5:
					System.out.print("------------------------------------------\nPlease enter quantity for pav bhaji (1 pav bhaji=30) : ");
					quantity=sc.nextInt();
					total+=(pavBhaji*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 6:
					System.out.print("------------------------------------------\nPlease enter quantity for pizza (1 pizza=150) : ");
					quantity=sc.nextInt();
					total+=(Pizza*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 7:
					System.out.print("------------------------------------------\nPlease enter quantity for pasta (1 pasta=100) : ");
					quantity=sc.nextInt();
					total+=(pasta*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 8:
					System.out.print("------------------------------------------\nPlease enter quantity for burger (1 burger=60) : ");
					quantity=sc.nextInt();
					total+=(burger*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 9:
					System.out.print("------------------------------------------\nPlease enter quantity for maggie (1 maggie=10) : ");
					quantity=sc.nextInt();
					total+=(maggie*quantity);
					System.out.println("Current total bill : "+total);
					break;
				case 10:
					System.out.println("------------------------------------------\nThank you for using our program. Hope to see you seen");
					System.exit(0);
				default:
					System.out.println("------------------------------------------\nInvalid input. Please try again.");
					
			}
		}
	}	
}
/*
E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\src>java Day1_3_Food
Items in the list
 1. dosa
 2. vadaPav
 3. tea
 4. samosa
 5. pavBhaji
 6. Pizza,
 7. pasta
 8. burger
 9. maggie
 10. exit

Enter your choice : 1
------------------------------------------
Please enter quantity for dosa (1 dosa=60) : 1
Current total bill : 60

Enter your choice : 2
------------------------------------------
Please enter quantity for vada pav (1 vadaPav=15) : 3
Current total bill : 105

Enter your choice : 7
------------------------------------------
Please enter quantity for pasta (1 pasta=100) : 1
Current total bill : 205

Enter your choice : 11
------------------------------------------
Invalid input. Please try again.

Enter your choice : 10
------------------------------------------
Thank you for using our program. Hope to see you seen
*/