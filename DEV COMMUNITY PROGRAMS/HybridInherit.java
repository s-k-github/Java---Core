interface Baseclass
{ 
    public void print_bclass();
}
interface Middleclass1 extends Baseclass
{ 
    public void print_m1class();
}
interface Middleclass2 extends Baseclass
{ 
    public void print_m2class();
}
 interface Childclass1 extends Middleclass1
{ 
    public void print_c1class();
} 
class Child1 implements Childclass1,Middleclass1
{
	public void print_bclass()
	{
		System.out.println("Baseclass through Child1 Method");
	}
	public void print_m1class()
	{
		System.out.println("Middleclass1 Method");
	}
	public void print_c1class()
	{
		System.out.println("ChildClass1 Method");
	}	
}
class Child2 implements Middleclass2
{
	public void print_m2class()
	{
		System.out.println("Middleclass2 Method");
	}
	public void print_bclass()
	{
		System.out.println("Baseclass through Child2 Method");
	}
}
public class HybridInherit
{ 
    public static void main(String[] args) 
    { 
        Child1 g = new Child1(); 
        g.print_bclass(); 
        g.print_m1class(); 
		g.print_c1class(); 
		Child2 g1=new Child2();
		g1.print_m2class();
		g1.print_bclass();
    } 
} 
/*Baseclass through Child1 Method
Middleclass1 Method
ChildClass1 Method
Middleclass2 Method
Baseclass through Child2 Method*/