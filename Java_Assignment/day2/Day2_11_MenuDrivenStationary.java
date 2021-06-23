package day2;

import java.util.Scanner;

public class Day2_11_MenuDrivenStationary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int total=0;
		int choice=1;
		do
		{
			System.out.print("\nItems available in stationary shop: \n1:Pen \n2:Pencil \n3:NoteBook \n4:Bottle \n5:ColorBox \n0:Quit\nPlease enter your choice: ");
			int ch=sc.nextInt();
			System.out.print("\n*********************************************************************");
	
			switch(ch)
			{
				case 1:
					System.out.print("\n1 Pen = 10Rs \nHow many pens do you want to buy? ");
					total+=(10*sc.nextInt());
					System.out.print("Total price of cart after buying pens is : "+total);
					break;
				case 2:
					System.out.print("\n1 Pencil = 5Rs \nHow many pencils do you want to buy? ");
					total+=(5*sc.nextInt());
					System.out.print("Total price of cart after buying pencils is : "+total);
					break;
				case 3:
					System.out.print("\n1 Notebook = 20Rs \nHow many notebook do you want to buy? ");
					total+=(20*sc.nextInt());
					System.out.print("Total price of cart after buying notebooks is : "+total);
					break;
				case 4:
					System.out.print("\n1 Bottle = 30Rs \nHow many bottle do you want to buy? ");
					total+=(30*sc.nextInt());
					System.out.print("Total price of cart after buying bottlesis : "+total);
					break;
				case 5:
					System.out.print("\n1 Codebox = 50Rs \nHow many codebox do you want to buy? ");
					total+=(50*sc.nextInt());
					System.out.print("Total price of cart after buying codebox is : "+total);
					break;
				default:
					System.out.print("\nWrong choice entered. Please try again");
			
			}
			System.out.print("\n*********************************************************************");
			System.out.print("\nDo you want to continue? \npress 0 for yes, otherwise press 1 : ");
			choice=sc.nextInt();
			System.out.print("\n*********************************************************************");
		}while(choice==0);
		sc.close();
	}		
}
/*
 
Items available in stationary shop: 
1:Pen 
2:Pencil 
3:NoteBook 
4:Bottle 
5:ColorBox 
0:Quit
Please enter your choice: 1

*********************************************************************
1 Pen = 10Rs 
How many pens do you want to buy? 4
Total price of cart after buying pens is : 40
*********************************************************************
Do you want to continue? 
press 0 for yes, otherwise press 1 : 0

*********************************************************************
Items available in stationary shop: 
1:Pen 
2:Pencil 
3:NoteBook 
4:Bottle 
5:ColorBox 
0:Quit
Please enter your choice: 2

*********************************************************************
1 Pencil = 5Rs 
How many pencils do you want to buy? 6
Total price of cart after buying pencils is : 70
*********************************************************************
Do you want to continue? 
press 0 for yes, otherwise press 1 : 0

*********************************************************************
Items available in stationary shop: 
1:Pen 
2:Pencil 
3:NoteBook 
4:Bottle 
5:ColorBox 
0:Quit
Please enter your choice: 5

*********************************************************************
1 Codebox = 50Rs 
How many codebox do you want to buy? 3
Total price of cart after buying codebox is : 220
*********************************************************************
Do you want to continue? 
press 0 for yes, otherwise press 1 : 1

**********************************************************************/
