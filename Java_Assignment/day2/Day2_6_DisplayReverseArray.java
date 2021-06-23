package day2;
import java.util.Scanner;
public class Day2_6_DisplayReverseArray 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter 5 elements of array: \n");
		for(int i=0;i<5;i++)
		{
			System.out.print("Element "+(i+1)+ " : ");
			a[i]=sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("\nElements of given array:\n");
		for(int i=4;i>=0;i--)
			System.out.print(" "+a[i]);
		
	}
}
/*
Please enter 5 elements of array: 
Element 1 : 23
Element 2 : 34
Element 3 : 21
Element 4 : 8
Element 5 : 3

Elements of given array:
 3 8 21 34 23*/
