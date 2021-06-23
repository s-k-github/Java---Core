package day2;
import java.util.Scanner;
public class Day2_5_DisplayArray 
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
		for(int i=0;i<5;i++)
			System.out.print(" "+a[i]);
		
	}
}
/*
Please enter 5 elements of array: 
Element 1 : 2
Element 2 : 3
Element 3 : 4
Element 4 : 5
Element 5 : 6

Elements of given array:
 2 3 4 5 6*/