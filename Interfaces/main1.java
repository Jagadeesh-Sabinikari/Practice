import java.util.*;
interface ii
{
	static Scanner sc=new Scanner(System.in);
	int m1(String n);
	
}
interface iii 
{
   	String m2();
}
abstract class a1 implements ii,iii
{
	a1(int a)
	{
		System.out.println(a);
	}
	boolean m3()
	{
		return sc.nextBoolean();
	}
	abstract float m4();
}
class main1 extends a1
{
	main1()
	{
		super(sc.nextInt());
	}
	public int m1(String n)
	{
		System.out.println(n);
		return sc.nextInt();
	}
	public String m2()
	{
		return sc.next();
	}
	float m4()
	{
		return sc.nextFloat();
	}
	public static void main(String[]args)
	{
		main1 obj=new main1();
		System.out.println(obj.m1(sc.next()));
		System.out.println(obj.m2());
		System.out.println(obj.m3());
		System.out.println(obj.m4());
		
		
	}

}