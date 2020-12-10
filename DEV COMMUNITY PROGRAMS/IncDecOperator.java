class IncDecOperator 
{
    public static void main(String[] args) 
	{
        int var1 = 5, var2 = 5;

        // var1 is displayed
        // Then, var1 is increased to 6.
        System.out.println(var1++);

        // var2 is increased to 6
        // Then, var2 is displayed
        System.out.println(++var2); 
		
		// var1 is displayed
        // Then, var1 is decreased to 5.
        System.out.println(var1--);

        // var2 is decreased to 5
        // Then, var2 is displayed
        System.out.println(--var2);
    }//main method end
}//main class end

/*
OUTPUT:
5
6
6
6
*/