import java.util.*;
interface i1
{
	static Scanner sc=new Scanner(System.in);
	int m1(int a);
	int m2(int b);

	static String m3(String name)
	{
		System.out.println(name);
		return sc.next();
	}
	default boolean m4(String name)
	{
		System.out.println(name);
		return sc.nextBoolean();+

	}

}
class Concrete implements i1
{
	public int m1(int a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public int m2(int b)
	{
		System.out.println(b);
		return sc.nextInt();
	}
	public static void main(String args[])
	{
		Concrete c=new Concrete();
		System.out.println(c.m1(sc.nextInt()));
		System.out.println(c.m2(sc.nextInt()));
		System.out.println(i1.m3(sc.next()));
		System.out.println(c.m4(sc.next()));
	}

}