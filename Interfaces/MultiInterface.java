import java.util.*;
interface in1
{
	static Scanner sc=new Scanner(System.in);
	int m1(String name);
	String m2(int n);
}
interface in2
{
	float m3(long l);
	long m4(float f);
}
interface in3
{
	double m5(boolean b);
	boolean m6(double d);
}
class MultiInterface implements in1,in2,in3
{
	public int m1(String name)
	{
		System.out.println(name);
		return sc.nextInt();
	}
	public String m2(int n)
	{
		System.out.println(n);
		return sc.next();
	}
	public float m3(long l)
	{
		System.out.println(l);
		return sc.nextFloat();
	}
	public long m4(float f)
	{
		System.out.println(f);
		return sc.nextLong();
	}
	public double m5(boolean b)
	{
		System.out.println(b);
		return sc.nextDouble();
	}
	public boolean m6(double d)
	{
		System.out.println(d);		
		return sc.nextBoolean();
	}
	public static void main(String args[])
	{
		MultiInterface obj=new MultiInterface();
		System.out.println(obj.m1(sc.next()));
		System.out.println(obj.m2(sc.nextInt()));
		System.out.println(obj.m3(sc.nextLong()));
		System.out.println(obj.m4(sc.nextFloat()));
		System.out.println(obj.m5(sc.nextBoolean()));
		System.out.println(obj.m6(sc.nextDouble()));
	}
}