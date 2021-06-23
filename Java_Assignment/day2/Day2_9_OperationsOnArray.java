package day2;
import java.util.Scanner;

public class Day2_9_OperationsOnArray 
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
		
		int min=a[0],max=a[0],sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=a[i];
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.print("\nTotal of array elements: "+sum+"\nAverage of array elements: "+(sum/(float)size)+"\nMinimum element from array: "+min+"\nMinimum element from array: "+max);
	}
}
/*Please enter size of an array: 3
Please enter 3 elements of array: 
Element 1 : 12
Element 2 : 78
Element 3 : 43

Total of array elements: 133
Average of array elements: 44.333332
Minimum element from array: 12
Minimum element from array: 78*/
