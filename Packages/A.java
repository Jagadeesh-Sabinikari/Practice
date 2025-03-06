package p1;
public class A
{
	public int a=10;
	public A(String name)
	{
		System.out.println("Constructor invokes: "+name);
	}
	public int m1(char ch)
	{
		System.out.println("non static method invokes: "+ch);
		return 100;
	}
}