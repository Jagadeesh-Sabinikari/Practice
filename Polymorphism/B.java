class A
{
 	void m1()
	{
		System.out.println("Hi");
	}	
	String m1(int a)
	{
		return "Welcome";
	}

}
class B extends A
{
	String m1(float b)
	{
		return "Namaste";
	}
	int m1(String a)
	{	
		return 10;
	}
	
	public static void main(String[]args)
	{
		B obj = new B();
		System.out.println(obj.m1(10));
		obj.m1();
		System.out.println(obj.m1("ja"));
	
	}
}