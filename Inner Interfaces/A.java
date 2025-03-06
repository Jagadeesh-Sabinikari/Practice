import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.println("Parameterised Constructor "+a);
	}
	int m1(String n)
	{
		System.out.println("Outer Class Method: "+n);
		return sc.nextInt();
	}
	interface inter
	{
		float m2();
		default void m3()
		{
			System.out.println("Non Static Method Of inner Interface");	
		}
		static void m4()
		{
			System.out.println("Static Method Of inner Interface");	
		}
	}
	
	public static void main(String args[])
	{
		A obj=new A(sc.nextInt());
		System.out.println(obj.m1(sc.next()));
		inter obj1=new inter()
		{
			Scanner sc=new Scanner(System.in);
			public float m2()
			{
				System.out.println("Overridden Method Of inner Interface");	
				return sc.nextFloat();
			}
		};
		System.out.println(obj1.m2());
		obj1.m3();
		inter.m4();

	}

}