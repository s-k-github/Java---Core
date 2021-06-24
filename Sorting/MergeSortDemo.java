package sort;

import java.util.Scanner;

public class MergeSortDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" array elements : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		//int[] arr=new int[] {5,4,3,2,1};
		MergeSort sort=new MergeSort();
		sort.mergeOperation(arr);
	}//end main
}//end MergeSortDemo

