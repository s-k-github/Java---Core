/*5:Write a program to  merge two arrays into a single array.*/
package day3;
import java.util.Scanner;
public class Day3_5_MergeArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter size of first array : ");
		int n1=sc.nextInt();
		
		int a[]=new int[n1];
		System.out.println("Please enter elements of first array: ");
		for(int i=0;i<n1;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("\nPlease enter size of second array : ");
		int n2=sc.nextInt();
		
		int b[]=new int[n2];
		System.out.println("Please enter elements of second array: ");
		for(int i=0;i<n2;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			b[i]=sc.nextInt();
		}
		sc.close();
		display(merge(a,b));

	}
	
	protected static int[] merge(int[] a,int[] b)
	{
		int[] c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			index++;
		}
		for(int i=0;i<b.length;i++)
			c[index++]=b[i];
		return c;
	}
	protected static void display(int[] c)
	{
		System.out.print("\nMerged array: ");
		for(int i:c)
			System.out.print(i+" ");
	}

}
/*
Please enter size of first array : 3
Please enter elements of first array: 
Element 1 : 12
Element 2 : 23
Element 3 : 34

Please enter size of second array : 4
Please enter elements of second array: 
Element 1 : 12
Element 2 : 23
Element 3 : 34
Element 4 : 87

Merged array: 12 23 34 12 23 34 87 */
