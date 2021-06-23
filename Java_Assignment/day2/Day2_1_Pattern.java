package day2;

public class Day2_1_Pattern 
{

	public static void main(String[] args) 
	{
		int i=0,j,n=5;
		for(;i<=n;i++) 
		{
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/