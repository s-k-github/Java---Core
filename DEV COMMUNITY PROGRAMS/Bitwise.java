class Bitwise
{
	public static void main(String s[])
	{
		int a=10;//a=000....001010 32 bit representation
		int b=15;//b=000....001111 32 bit representation
		int c=-12;
		int d=64;
		System.out.println(+(a|b)); //if both bits 0 then return 0 else 1
		System.out.println(+(a&b)); //if both bits 0 then 1 return else 0
		System.out.println(+(a^b)); //if different bits the 1 else 0
		System.out.println(+(~a)); //step1: invert each bit
								   //step2: find out the integer value of the number. so
								   //       perform 2's complement on step 1's output including the sign
		System.out.println(+(b<<2));
		System.out.println(+(c<<1));
		System.out.println(+(d>>2));
		System.out.println(+(c>>1));
		System.out.println(+(c>>>1));
	}//main method end
}//main class end

/*
OUTPUT:
15 
10
5
-11
756
-24
16
-6
2147483642
*/