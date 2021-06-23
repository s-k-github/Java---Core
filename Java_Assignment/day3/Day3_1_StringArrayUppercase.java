/*1:Write a function to accept array of string.Display all elements in uppercase.*/
package day3;
import java.util.Scanner;
public class Day3_1_StringArrayUppercase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter size of string array: ");
		int n=sc.nextInt();
		
		String[] array=new String[n];
		System.out.print("Please enter elements:");
		for(int i=0;i<n;i++)
			array[i]=sc.next();
		
		uppercase(array,n);
		sc.close();
		
	}
	protected static void uppercase(String[] array,int n)
	{
		System.out.print("Uppercase array: ");
		for(int i=0;i<n;i++)
			System.out.print(" "+array[i].toUpperCase());
	}
}
/*Please enter size of string array: 3
Please enter elements:sejal supriya kolhe
Uppercase array:  SEJAL SUPRIYA KOLHE*/
