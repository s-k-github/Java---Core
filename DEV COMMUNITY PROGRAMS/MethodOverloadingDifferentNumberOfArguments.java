class MethodOverloading
{
	static int mult (int a,int b)
	{
		return a*b;
	}
	static int mult(int a,int b,int c)
	{
		return a*b*c;
	}
}
class MethodOverloadingDifferentNumberOfArguments
{
	public static void main(String[] args)
	{
		System.out.println(MethodOverloading.mult(13,13));
		System.out.println(MethodOverloading.mult(9,9,9));
	}
}