import java.util.*;
interface ii
{
	static Scanner sc=new Scanner(System.in);
	int m1(String a);
	default String m2(int a)
	{
		System.out.println("Default Method Of Interface "+a);
		System.out.println("enter String");
		return sc.next();
	}
	static boolean m3(double d)
	{
		System.out.println("static Method Of Interface "+d);
		System.out.println("enter Boolean");
		return sc.nextBoolean();
	}
	class AA
	{
		float m4(int a)
		{
			System.out.println("Concrete Class AA "+a);
			System.out.println("enter Float");
			return sc.nextFloat();	
		}
	}
	class AB
	{
		 char m5(String n)
		{
			System.out.println("Concrete Class AB "+n);
			System.out.println("enter character");
			return sc.next().charAt(0);	
		}
	}
	public static void main(String args[])
	{
		ii.AA obj=new AA();
		System.out.println("enter integer");
		System.out.println(obj.m4(sc.nextInt()));
		ii.AB obj1=new AB();
		System.out.println("enter String");
		System.out.println(obj1.m5(sc.next()));
		ii obj3=new ii()
		{
			public int m1(String a)
			{
				System.out.println("Abstract Method Overridden "+a);	
				System.out.println("enter Interger");
				return sc.nextInt();
			}

		};
		System.out.println("enter integer");
		System.out.println(obj3.m2(sc.nextInt()));
		System.out.println("enter double");
		System.out.println(ii.m3(sc.nextDouble()));
		

	}


}