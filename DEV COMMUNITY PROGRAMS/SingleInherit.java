class Baseclass 
{ 
    public void print_bclass() 
    { 
        System.out.println("Base class method"); 
    } 
} 
  
class ChildClass extends Baseclass 
{ 
    public void print_cclass() 
    { 
        System.out.println("Child class method"); 
    } 
} 
public class SingleInherit 
{ 
    public static void main(String[] args) 
    { 
        ChildClass g = new ChildClass(); 
        g.print_bclass(); 
        g.print_cclass(); 
    } 
} 
/*
Base class method
Child class method*/