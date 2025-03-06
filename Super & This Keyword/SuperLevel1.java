import java.util.*;
class Main1
{
	static Scanner sc=new Scanner(System.in)
	boolean m1(String name)
	{
		System.out.println(name);
		return sc.nextBoolean();
	}
}
class Main2 extends Main1
{
	boolean m2(String name)
	{
		System.out.println(name);
		super.m1(sc.next());
		return sc.nextBoolean();
	}
}
class Main3 extends Main1
{
	boolean m3(String name)
	{
		System.out.println(name);
		super.m2(sc.next());
		return sc.nextBoolean();
	}
}
class SuperLevel1
{
	public static void main(String []args)
	{
		new Main3().m3(sc.next());
	}
}
