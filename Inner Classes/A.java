import java.util.*;
class A
{	static Scanner sc=new Scanner(System.in);
	private int a=sc.nextInt();
	int m1(int n)
	{
		System.out.println("Method1: "+a);
		System.out.println("Method1 Parameter: "+n);
		System.out.println("Enter an interger");
		return sc.nextInt();
	}
	class B
	{	
		String m2(double d)
		{
			System.out.println("Method2: "+a);
			System.out.println("Method2 Parameter: "+d);
			System.out.println("Enter an String");
			return sc.next();
		}
	}
	class C
	{	
		boolean m3(String n)
		{
			System.out.println("Method3: "+a);	
			System.out.println("Method3 Parameter: "+n);
			System.out.println("Enter an true/false");
			return sc.nextBoolean();
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter interger");
		A obj=new A();
		A.B obj1= obj.new B();
		A.C obj2= obj.new C();
		System.out.println("Enter interger");
		System.out.println(obj.m1(sc.nextInt()));

		System.out.println("Enter double");
		System.out.println(obj1.m2(sc.nextDouble()));

		System.out.println("Enter String");
		System.out.println(obj2.m3(sc.next()));


	}	

}