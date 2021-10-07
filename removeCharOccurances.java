package practise;

import java.util.Scanner;

public class removeCharOccurances {
	public static void main(String args[]) {
		try(Scanner sc=new Scanner(System.in)){
		    System.out.println("Enter string ");
		    String s=sc.nextLine();
		    System.out.println("Enter char ");
		    String character=Character.toString(sc.next().charAt(0));
		    System.out.println(s.replace(character,""));//using replace
		    
		    System.out.println(s.replaceAll(character,""));//using replaceAll
		}
	}
}

//	Enter string 
//	sanjana kajal
//	Enter char 
//	a
//	snjn kjl
//	snjn kjl
