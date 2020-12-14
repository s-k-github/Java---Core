class MethodOverridingParent
{
	int a=10;
	public void run()
	{
		System.out.println("MethodOverridingParent class's method");
	}
}
class MethodOverridingChild1 extends MethodOverridingParent
{
	int a=9;
	public void run()
	{
		System.out.println("MethodOverridingChild1 class's method "+a);
	}
}
class MethodOverridingChild2 extends MethodOverridingParent
{
	public void run()
	{
		System.out.println("MethodOverridingChild2 class's method "+a );
	}
}
class MethodOverriding
{
	public static void main(String[] args)
	{
		MethodOverridingParent m1=new MethodOverridingChild1();
		m1.run();
		MethodOverridingParent m2=new MethodOverridingChild2();
		m2.run();
	}
}
/*MethodOverridingChild1 class's method 9
MethodOverridingChild2 class's method 10*/