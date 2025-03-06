class A
{
	void m1(int a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	static void m1(int a)
	{
		System.out.println(a);
	}
	public static void main(String[]args)
	{	
		m1(10);
	}
}