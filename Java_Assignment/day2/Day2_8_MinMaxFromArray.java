package day2;
import java.util.Scanner;
public class Day2_8_MinMaxFromArray 
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
		sc.close();
		
		int min=a[0],max=a[0];
		for(int i=1;i<size;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.print("\nMinimum element from array: "+min+"\nMinimum element from array: "+max);
	}
}
/*Please enter size of an array: 4
Please enter 4 elements of array: 
Element 1 : 23
Element 2 : 78
Element 3 : 34
Element 4 : 6

Minimum element from array: 6
Minimum element from array: 78*/
