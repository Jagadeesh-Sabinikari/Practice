class A1
{
	static int a=10;
	static int b=20;
	
	public static void m1()
	{
		int a=30,b=40;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	static void m2()
	{
		this.m1();
	}
	A1()	
	{
		System.out.println("Hi");
	}
	A1(int a)
	{
		this();
	}
}
class B1 extends A1
{
	B1()
	{
		super(10);
		System.out.println("Hello");
	}
	static void m3()
	{
		System.out.println(super.a);
		System.out.println(super.b);
	}
	static void m4()
	{
		super.m2();
	}
}

class Superthis
{
	public static void main(String args[])
	{
		B.m4();
	}
}
	