package practise;

import java.util.Scanner;

public class palindrome {
	private static String s,reverse;
	public static void main(String args[]) {
		try(Scanner sc=new Scanner(System.in)){
		    System.out.println("Enter string ");
		    s=sc.next();
		    reverse="";
		    for(int i=s.length()-1;i>=0;i--){
		    	reverse=reverse+s.charAt(i);
		    }
		    System.out.println((reverse.compareTo(s))==0);
		    System.out.println(reverse.equals(s));
		    System.out.println(reverse.equalsIgnoreCase(s));
		    //----------------------------------------------------------
		    char[] chArray=s.toCharArray();
		    String rev="";
		    for(int i=chArray.length-1;i>=0;i--) {
		    	rev+=chArray[i];
		    }
		    System.out.println(rev.equals(s));
		    //----------------------------------------------------------
		    StringBuilder sb=new StringBuilder(sc.next());
		    StringBuilder sb1=new StringBuilder(sb);
		    
		    System.out.println(sb.reverse().compareTo(sb1)==0);
		}
	}
	palindrome(){
		s="";
	}
}
