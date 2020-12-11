class Baseclass 
{ 
    public void print_bclass() 
    { 
        System.out.println("Base class method"); 
    } 
} 
class Middleclass extends Baseclass
{ 
    public void print_mclass() 
    { 
        System.out.println("Middle class method"); 
    } 
} 
class ChildClass extends Middleclass 
{ 
    public void print_cclass() 
    { 
        System.out.println("Child class method"); 
    } 
} 
public class MultilevelInherit 
{ 
    public static void main(String[] args) 
    { 
        ChildClass g = new ChildClass(); 
        g.print_bclass(); 
        g.print_mclass(); 
        g.print_cclass(); 
    } 
} 
/*
Base class method
Middle class method
Child class method*/