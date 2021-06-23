package day2;
import java.util.Scanner;
public class Day2_7_SearchElementFromArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter size of an array: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		
		System.out.print("Please enter "+size+" elements of array: \n");
		for(int i=0;i<size;i++)
		{
			System.out.print("Element "+(i+1)+ " : ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("Please enter element you want to search for: ");
		int element=sc.nextInt();
		sc.close();
		
		int found=0;
		for(int i=0;i<size;i++)
			if(a[i]==element)
			{
				found=i+1;
				break;
			}
		if(found!=0)
			System.out.print("First occurance of "+element+" is at location : "+found);
		else
			System.out.print("Element not found in array provided");
		
	}
}
/*
 * Please enter size of an array: 3
Please enter 3 elements of array: 
Element 1 : 12
Element 2 : 78
Element 3 : 234
Please enter element you want to search for: 78
First occurance of 78 is at location : 2*/

