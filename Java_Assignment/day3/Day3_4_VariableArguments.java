/*4.Write a function /method which takes variable no of int numbers as an argument and returns the sum of these arguments as an output.*/
package day3;

public class Day3_4_VariableArguments 
{
	protected static void AddInt(int... a)
	{
		int sum=0,len=a.length;
		if(len==0)
			System.out.print("0 element received");
		else
		{
			System.out.println("\n\nAddition of following elements:");
			for(int i:a)
			{
				sum+=i;
				System.out.print(i+ " ");
				
			}
			
			System.out.print(" = "+sum);
		}
	}
	public static void main(String[] args) 
	{
		AddInt();
		AddInt(100);
		AddInt(2,3);
		AddInt(1,2,3,4,5,6,7,8,9);
		
	}
}
/*0 element received

Addition of following elements:
100  = 100

Addition of following elements:
2 3  = 5

Addition of following elements:
1 2 3 4 5 6 7 8 9  = 45*/
