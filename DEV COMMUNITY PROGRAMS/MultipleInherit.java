interface Baseclass1
{ 
    public void print_b1class();
} 
interface Baseclass2
{ 
    public void print_b2class();
} 
interface ChildClass2 extends Baseclass1,Baseclass2 
{ 
    public void print_c2class();
} 
class child implements ChildClass2
{
	public void print_c2class()
	{
		System.out.println("ChildClass2 Method");
	}
	public void print_bclass()
	{
		System.out.println("Baseclass Method");
	}
	public void print_b2class()
	{
		System.out.println("ChildClass1 Method");
	}	
}
public class MultipleInherit
{ 
    public static void main(String[] args) 
    { 
        child g = new child(); 
        g.print_b1class(); 
        g.print_b2class(); 
		g.print_c2class(); 
    } 
} 
/*Baseclass Method
ChildClass1 Method
ChildClass2 Method*/