package sort;

public class MergeSort {
	//method to print array
	private void printArray(int[] arr) {
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();

	}
	
	public void mergeOperation(int[] arr) {
		printArray(mergeSortOperation(arr));
	}

	//method to devide the array
	private int[] mergeSortOperation(int[] arr) {
		int n=arr.length;
		
		//if array is empty or has 1 element. return array to the calling method
		if(n<=1)
			return arr;
		
		//find mid which will handle partition of the array into left and right part
		int mid=n/2;
		
		//declare left and right arrays as algorithm requests
		int[] left=new int[mid];
		int[] right;//right left can be uneven if n is odd. thus check if n is even or odd and then initialise right array.
		int[] sortedArray=new int[n];
		
		//check if array length is even or odd. accordingly initialize right array, in order to save the memory space
		if(n%2==0)
			right=new int[mid];
		else
			right=new int[mid+1];
		
		//lets populate left right arrays
		for(int i=0;i<left.length;i++)
			left[i]=arr[i];
		for(int j=0;j<right.length;j++)
			right[j]=arr[mid+j];//right array starts from mid to n-1
		
		//divide left and right array into subarray by using recurson method
		left=mergeSortOperation(left);
		right=mergeSortOperation(right);
		
		sortedArray=merge(left,right);
		return sortedArray;
	}
	
	//sort and merge left right array
	public int[] merge(int[] left,int[] right) {
		int[] sortedArray=new int[left.length+right.length];
		int leftPtr,rightPtr,sortedPtr;
		leftPtr=rightPtr=sortedPtr=0;
		
		//lets ensure that we have something to merge in left or right array
		while(leftPtr<left.length || rightPtr<right.length) {
			//if statement to check if noth left and right have elements ro merge
			if(leftPtr<left.length && rightPtr<right.length) {
				if(left[leftPtr]<right[rightPtr]) {
					sortedArray[sortedPtr++]=left[leftPtr++];					
				}
				else {
					sortedArray[sortedPtr++]=right[rightPtr++];
				}
			}
			else if(leftPtr<left.length) {
				sortedArray[sortedPtr++]=left[leftPtr++];
			}
			else if(rightPtr<right.length){
				sortedArray[sortedPtr++]=right[rightPtr++];
			}
		}//end while
		
		return sortedArray;
	}//end merge()
}//class end

//OUTPUT:
//		Size of array : 
//		16
//		Enter 16 array elements : 
//		16 11 15 09 10 13 14 08 02 01 05 12 06 03 07 04
//		1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 

