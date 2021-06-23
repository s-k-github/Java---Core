package day5_3;

public class Day5_3_TestDate 
{
	public static void main(String[] args) {
		
		System.out.println("Default Constructor ->");
		Day5_3_Date date1 = new Day5_3_Date();
		date1.displayDate();
		System.out.println("\nParemeterised Constructor->");
		Day5_3_Date date2 = new Day5_3_Date(23, 07, 1997);
		date2.displayDate();
	}
}
