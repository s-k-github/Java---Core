class SwapWithoutUsingThirdVariable
{
	public static void main(String[] args)
	{
		int a=8,b=6,sum=0;
		sum=a+b;
		System.out.println("\na  "+(sum-b));
		System.out.println("b  "+(sum-a));
		
		int m=3,n=2;
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("\n------------\nm  "+m);
		System.out.println("n  "+n);
		
		int m1=3,n1=2;
		m1=m1*n1;
		n1=m1/n1;
		m1=m1/n1;
		System.out.println("\n------------\nm  "+m);
		System.out.println("n  "+n);
	}
}