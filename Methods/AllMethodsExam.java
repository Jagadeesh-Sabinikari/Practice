import java.util.Scanner;
class AllMethodsExam
{	static Scanner sc=new Scanner(System.in);
	static AllMethodsExam obj=new AllMethodsExam();
	
	
	
	static int a = sc.nextInt();
	  static int b = sc.nextInt();

	public static void m1()
	{
		System.out.println(a);
		System.out.println(obj.b);
	}

	public void m2()
	{
		System.out.println(a);
		System.out.println(obj.b);
	}

	public static int m3()
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println("Enter return value M2()");
		return sc.nextInt();
	}

	public int m4()
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println("Enter return value for M4()");
		return sc.nextInt();
	}
	
	public static void m5(int c)
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(c);

		
	}
	
	public void m6(int d)
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(d);
		
	}
	
	public static int m7(int e)
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println("Enter parameter E of m7()");
		System.out.println(e);
		System.out.println("Enter return value for M7()");
		return sc.nextInt();
	}
	public int m8(int f)
	{
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println("Enter parameter F of m8()");
		System.out.println(f);
		System.out.println("Enter return value for M8()");
		return sc.nextInt();
	}
	public static void main(String args[])
{
	m1();
	obj.m2();
	System.out.println(m3());
	System.out.println(obj.m4());
	m5(sc.nextInt());
	obj.m6(sc.nextInt());
	System.out.println(m7(sc.nextInt()));
	System.out.println(obj.m8(sc.nextInt()));
}
}