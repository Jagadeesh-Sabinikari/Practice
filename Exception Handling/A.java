import java.util.*;
class A
{	
	static Scanner sc=new Scanner(System.in);
	static A obj=new A();
	void m1(int a,int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch( ArithmeticException e)
		{
			System.out.println(e);
			obj.m1(sc.nextInt(),sc.nextInt());
		}
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		
		obj.m1(sc.nextInt(),sc.nextInt());
	}
}