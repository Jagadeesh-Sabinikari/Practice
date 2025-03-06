import java.util.*;
class Q15
{
	static Scanner sc=new Scanner(System.in);
	static Q15 obj=new Q15();
	String m1(int a)
	{
		System.out.println(a);
		String s=sc.next();
		return s;
	}
	String m2(boolean b)
	{
		System.out.println(b);
		System.out.println(obj.m1(sc.nextInt()));
		String p=obj.m1(sc.nextInt());
		return p;
	}
	Boolean m3(float f)
	{
		System.out.print(f);
		Boolean b=sc.nextBoolean();
		return b;
	}
	Boolean m4(char c)
	{
		System.out.print(c);
		System.out.println(obj.m3(sc.nextFloat()));
		Boolean q=obj.m3(sc.nextFloat());
		return q;
	}
	public static void main(String[] args)
	{
		System.out.println(obj.m2(sc.nextBoolean()));
		System.out.println(obj.m4(sc.next().charAt(0)));
	}
}