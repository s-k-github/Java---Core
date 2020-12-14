class MethodOverloading
{
	static int one (int a)
	{
		return a*a;
	}//return square
	static int two(int a,int b)
	{
		return a*b;
	}//return multiplication
	static int three(int a,int b,int c)
	{
		return a+b+c;
	}//return addition
}
class MethodOverloadingBoth
{
	public static void main(String[] args)
	{
		System.out.println(MethodOverloading.one(5));
		System.out.println(MethodOverloading.two(2,3));
		System.out.println(MethodOverloading.three(2,3,4));
	}
}
/*25
6
9*/