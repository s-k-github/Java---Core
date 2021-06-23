/*3:Write a java program to make the addition of two 2D array And store result in Third array.*/
package day3;
import java.util.Scanner;
public class Day3_3_2DAddition 
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
		int[][] array1=new int[row][col];
		System.out.print("\nPlease enter elements for 2D array:\n");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				array1[i][j]=sc.nextInt();
		
		Display(Addition(array,array1,row,col));
		sc.close();
		
	}
	protected static int[][] Addition(int[][] a,int[][] b,int r,int c)
	{
		int[][] add=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				add[i][j]=a[i][j]+b[i][j];
		return add;
	}
	protected static void Display(int[][] a)
	{
		System.out.println("\nArray after addiion:");
		for(int i[]:a)
		{
			for(int k:i)		
				System.out.print(" "+k);
			System.out.println();
		}
	}
}
/*
 * Please enter row size of array: 3
Please enter column size of array: 2

Please enter elements for 2D array:
12 23
11 22
10 21

Please enter elements for 2D array:
3 2
3 6
1 5

Array after addiion:
 15 25
 14 28
 11 26
*/