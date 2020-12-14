class MethodOverloading
{
	static int mult (int a,int b)
	{
		return a*b;
	}
	static double mult(double a,double b,double c)
	{
		return a*b*c;
	}
}
class MethodOverloadingChangingDataType
{
	public static void main(String[] args)
	{
		System.out.println(MethodOverloading);
		System.out.println(MethodOverloading);
	}
}
/*15
35.721*/