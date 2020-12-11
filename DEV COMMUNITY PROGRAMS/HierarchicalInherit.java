class Baseclass 
{ 
    public void print_bclass() 
    { 
        System.out.println("Base class method"); 
    } 
} 
class ChildClass1 extends Baseclass
{ 
    public void print_c1class() 
    { 
        System.out.println("ChildClass1 method"); 
    } 
} 
class ChildClass2 extends Baseclass 
{ 
    public void print_c2class() 
    { 
        System.out.println("ChildClass2 method"); 
    } 
} 
public class HierarchicalInherit
{ 
    public static void main(String[] args) 
    { 
        ChildClass1 g = new ChildClass1(); 
        g.print_bclass(); 
        g.print_c1class(); 
		ChildClass2 g1 = new ChildClass2(); 
        g.print_bclass(); 
        g.print_c2class(); 
    } 
} 
/*Base class method
ChildClass1 method
Base class method
ChildClass2 method*/