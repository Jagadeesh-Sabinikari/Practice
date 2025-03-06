import java.util.*;
interface ii1
{
	static Scanner sc=new Scanner(System.in);
	int m1();
	String m2();
	static void m3()
	{
		System.out.println("M3 Method");
	}
	default void m4()
	{
		System.out.println("M4 Method");
	}
}
interface ii2
{
	int m5();
	String m6();
	static void m7()
	{
		System.out.println("M7 Method");
	}
	default void m8()
	{
		System.out.println("M8 Method");
	}
}
abstract class ab2 
{
	ab2(int a)
	{
		System.out.println(a);
	}
	abstract int m9();
	
}
class main2 extends ab2 implements ii1,ii2
{
	main2()
	{
		super(sc.nextInt());
	}
	public int m1()
	{
		return sc.nextInt();
	}
	public String m2()
	{
		return sc.next();
	}
	public int m5()
	{
		return sc.nextInt();
	}
	public String m6()
	{
		return sc.next();
	}
	int m9()
	{
		System.out.println("Method M9");
		return sc.nextInt();
	}
}
class test
{
	static main2 obj=new main2();
	public static void main(String args[])
	{
		System.out.println(obj.m1());
		System.out.println(obj.m2());
		System.out.println(obj.m5());
		System.out.println(obj.m6());
		System.out.println(obj.m9());
		ii1.m3();
		ii2.m7();
		obj.m4();
		obj.m8();
		

	

	}
}