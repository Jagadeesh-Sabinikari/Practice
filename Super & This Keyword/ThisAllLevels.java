import java.util.*;
class ThisAllLevels
{	
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	ThisAllLevels()
	{
		this(sc.nextInt());
	}
	ThisAllLevels(int a)
	{
		System.out.println(a+this.a);
		System.out.print(this.m1(sc.nextInt()));
	}
	String m1(int a)
	{
		System.out.println(a+this.a);
		System.out.print(this.m2());
		return sc.next();
	}
	boolean m2()
	{
		System.out.println("M2 Method");
		return sc.nextBoolean();
	}
	public static void main(String[]args)
	{
		new ThisAllLevels();

	}
}