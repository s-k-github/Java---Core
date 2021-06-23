/*2:Write a Java program to accept 2D aaray elements.Display all elements.*/
package day3;
import java.util.Scanner;
public class Day3_2_2DArrayDisplay 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter row size of array: ");
		int row=sc.nextInt();
		System.out.print("Please enter column size of array: ");
		int col=sc.nextInt();
		
		int[][] array=new int[row][col];
		System.out.print("\nPlease enter elements for 2D array:\n");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				array[i][j]=sc.nextInt();
		
		display(array,row,col);
		sc.close();
		
	}
	protected static void display(int[][] array,int row,int col)
	{	
		System.out.print("\nElements of provided 2D array:\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print("  "+array[i][j]);
			System.out.print("\n");
		}
		
	}
	

}
/*Please enter row size of array: 3
Please enter column size of array: 2

Please enter elements for 2D array:
12 23
11 22
10 21

Elements of provided 2D array:
  12  23
  11  22
  10  21
*/
