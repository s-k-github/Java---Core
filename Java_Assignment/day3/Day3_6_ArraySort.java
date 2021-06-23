/*6:Write a java program to sort array.*/
package day3;
import java.util.Scanner;
public class Day3_6_ArraySort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PrintSort(GetArray(sc));
		sc.close();
	}
	
	protected static int[] GetArray(Scanner sc)
	{
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(++index)+" : ");
			a[i]=sc.nextInt();
		}
		return a;
	}
	
	protected static void PrintSort(int[] a)
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			if(a[j]<a[i])
			{	
				a[j]=a[j]+a[i];
				a[i]=a[j]-a[i];
				a[j]=a[j]-a[i];
			}
		}
		System.out.print("\nSorted Array:");
		for(int j:a)
			System.out.print(" "+j);
	}
}
/*
Enter size of array: 4
Element 1 : 12
Element 2 : 9
Element 3 : 2
Element 4 : 13

Sorted Array: 2 9 12 13*/
