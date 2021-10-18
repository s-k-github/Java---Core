import java.util.Scanner;

public class SelectionSort
{
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		    System.out.println("Enter size of an array: ");
		    int array_size=sc.nextInt();
		    System.out.println("Enter "+array_size+" elements: ");
		    int[] array=new int[array_size];
		    for(int i=0;i<array_size;i++)
		        array[i]=sc.nextInt();
		    Main m=new Main();
		    m.selection(array_size,array);
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
	
	private void selection(int array_size,int[] a){
	    int temp=0,outer_loop=0,inner_loop=0;
	    for(int i=0;i<array_size-1;i++){
	        outer_loop++;
	        for(int j=i+1;j<array_size;j++){
	            inner_loop++;
	            if(a[j]<a[i]){
	              temp=a[j];
	              a[j]=a[i];
	              a[i]=temp;
	            }
	        }
	    }
	    System.out.println("Total passes: "+outer_loop);
	    System.out.println("Total iterations: "+inner_loop);
	    printArray(a);
	}
	
	private void printArray(int[] array){
	    for(int a:array)
	        System.out.print("  "+a);
	}
}

    // Enter size of an array:  4
    // Enter 4 elements: 98 23 34 1
    // Total passes: 3
    // Total iterations: 6
    //   1  23  34  98