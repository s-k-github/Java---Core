/*7:Write a java program to convert char array into String.*/
package day3;

import java.util.Scanner;

public class Day3_7_CharArraytoString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Convert(get(sc));
		
		sc.close();
	}
	
	protected static char[] get(Scanner sc)
	{
		System.out.print("Please enter size of char array:");
		int n=sc.nextInt();
		
		System.out.println();
		char[] c=new char[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+"th character: ");
			c[i]=sc.next().charAt(0);
		}
		return c;
	}
	
	protected static void Convert(char[] c)
	{
		/*type 1:
		String s=String.valueOf(c);
		System.out.println("\nCharacter array to string result-> "+s);*/
		
		/*System.out.println("\nCharacter array to string result-> "+String.valueOf(c));*/
		
		/*type 2:
		String s="";
		s=String.copyValueOf(c,0,c.length);
		System.out.println("\nCharacter array to string result-> "+s);*/
		
		/*System.out.println("\nCharacter array to string result-> "+String.copyValueOf(c));*/
		
		//type 3:
		String s="";
		for(int i=0;i<c.length;i++)
			s+=c[i];
		System.out.println("\nCharacter array to string result-> "+s);
		
		/*type 4:
		String s=new String(c);
		System.out.println("\nCharacter array to string result-> "+s);*/
	}
}
/*
Please enter size of char array:4

Enter 1th character: e
Enter 2th character: f
Enter 3th character: g
Enter 4th character: h

Character array to string result-> efgh
*/
