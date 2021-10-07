package practise;

import java.util.Scanner;

public class CompareString {
public static void main(String args[]) {
	try(Scanner sc=new Scanner(System.in)){
    
		System.out.println("String comparison with same content : string pool and heap ");
		String ss1="sejal";
		String ss2="sejal";
		System.out.println("ss1.equals(ss2) "+ss1.equals(ss2));
		System.out.println("ss1==ss2 "+(ss1==ss2));
		
		String sss1=new String("sejal");
		String sss2=new String("sejal");
		System.out.println("sss1.equals(sss2) "+sss1.equals(sss2));
		System.out.println("sss1==sss2 "+(sss1==sss2));
		
		System.out.println("ss1.equals(sss1) "+ss1.equals(sss1));
		System.out.println("ss2==sss2 "+(ss2==sss2));
	    //using StringBuilder
		System.out.println("Enter 2 strings: ");
		StringBuilder sb1 = new StringBuilder(sc.next());
	    StringBuilder sb2 = new StringBuilder(sc.next());
	        
	    System.out.println("Compare Output: " + sb1.toString().equals(sb2.toString()));
	    System.out.println("Compare Output: "+ (sb1.compareTo(sb2)==0));
	    System.out.println();
	    
	    //using String
	    System.out.println("Enter 2 strings: ");
	    String s1=sc.next();
	    String s2=sc.next();
	    
	    System.out.println("Compare Output: " + (s1==s2));
	    System.out.println("Compare Output: " + s1.equals(s2));
	    System.out.println("Compare Output: " + s1.equalsIgnoreCase(s2));
	    System.out.println("Compare Output: " + (s1.compareTo(s2)==0));
	}
	}
}
