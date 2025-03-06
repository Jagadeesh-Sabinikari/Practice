import java.util.*;
abstract class abs1
{
	static Scanner sc=new Scanner(System.in);
	abstract void m1();
	abstract boolean m2(String name);
	abs1(int a)
	{
		System.out.println("PC of Abs: "+a);
	}
	int m2()
	{
		System.out.println("Defined Method");
		return sc.nextInt();
	}
}
class concrete3 extends abs1
{
	concrete3()
	{
		super(sc.nextInt());
	}
	void m1()
	{
		System.out.println("abstract method1");
	}
	boolean m2(String name)
	{
		System.out.println(name);
		return sc.nextBoolean();
	}
	public static void main(String args[])
	{
		concrete3 obj=new concrete3();
		obj.m1();
		System.out.println(obj.m2(sc.next()));
		System.out.println(obj.m2());

	}
}
