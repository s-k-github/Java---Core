package day1;

public class Day1_3_CompoundInterest 
{

	public static void main(String[] args) 
	{
		int p=20000,t=3,n=12;
		
		double  r=.06, amount =p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
	}

}
/*Compound Interest after 3 years: 3933.6104964682927
Amount after 3 years: 23933.610496468293
*/