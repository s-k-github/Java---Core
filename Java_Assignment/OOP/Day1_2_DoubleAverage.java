/*
Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.

import java.util.Scanner;
class Day1_2_DoubleAverage
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Please enter first double number : ");
		String a=sc.next();
        double c = Double.parseDouble(a);
		System.out.print("Please enter second double number : ");
		String b=sc.next();
        double d = Double.parseDouble(b);
        // will only get to here if input was a double
		System.out.println("Average : "+(c+d)/2);
    } catch (NumberFormatException ignore) {
        System.out.println("Invalid input");
    }
    }
}*/
import java.util.Scanner;
class Day1_2_DoubleAverage
{
	public static void main(String[] args)
	{
		String a,b;
		double avg,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter first double number : ");
		a=sc.next();
		c=Double.parseDouble(a);
		if(checkDouble(c))
		{
			System.out.print("Please enter second double number : ");
			b=sc.next();
			d=Double.parseDouble(b);
			if(checkDouble(d))
				System.out.println("Average : "+(c+d)/2);
		}
	}
	public static boolean checkDouble(double c)
	{
		if(c==Math.floor(c))
		{
			System.out.println("Invalid input");
			return false;
		}
		return true;
	}
}
/*
E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\bin>java Day1_2_DoubleAverage
Please enter first double number : 123.4f
Please enter second double number : 123.2f
Average : 123.30000000000001

E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\bin>java Day1_2_DoubleAverage
Please enter first double number : 123.4
Please enter second double number : 123.2
Average : 123.30000000000001

E:\CDAC\CDAC ONLY\CDAC assignments\Java_M\bin>java Day1_2_DoubleAverage
Please enter first double number : 123
Invalid input
*/