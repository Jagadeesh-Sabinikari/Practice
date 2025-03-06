import java.util.*;
interface inter1
{
	static Scanner sc= new Scanner(System.in);
	int m1(String n);
	static String m2(int n)
	{
		System.out.println("Method m2 "+ n);
		System.out.println("Enter your String value");
		return sc.next();
	}
}
interface inter2
{
	static Scanner sc= new Scanner(System.in);
	float m3(String n);
	static boolean m4(int n)
	{
		System.out.println("Method m4 "+n);
		System.out.println("Enter your boolean value");
		return sc.nextBoolean();
	}
}
interface inter3
{
	static Scanner sc= new Scanner(System.in);
	double m5(long l);
	static int m6(boolean b)
	{
		System.out.println("Method m6 "+b);
		System.out.println("Enter your int value");
		return sc.nextInt();
	}

}
abstract class abc implements inter1,inter2,inter3
{
	static Scanner sc= new Scanner(System.in);
	private static String s=sc.next();
	void setString(String s)
	{
		this.s=s;
	}
	String getString()
	{
		return s;
	}

	abstract void m7();
	void m8()
	{
		System.out.println("abstract defined method invoked");
	}
	abc(String n)
	{
		System.out.println("Parameterised Constructor with Parameter "+n);
	}

	public int m1(String n)
	{
		System.out.println("m1 Method: "+n);
		System.out.println("Enter Integer");
		return sc.nextInt();
	}
	public float m3(String n)
	{
		System.out.println("m3 Method: "+n);
		 
		System.out.println("Enter Float value");
		return sc.nextFloat();
		
	}
	public double m5(long l)
	{
		System.out.println("Method m5: "+l);
		System.out.println("Enter Double value");
		return sc.nextDouble();
	}
}
class class1 extends abc
{
	static Scanner sc= new Scanner(System.in);
	
	class1()
	{
		super(sc.next());
	}
	void m7()
	{
		System.out.println("Abstract Method Overridden");
	}
	
}
class class2 extends abc
{
	class2()
	{
		super(sc.next());
	}
	void m7()
	{
		System.out.println("Abstract Method Overridden");
	}
}
class class3 extends abc
{
	class3()
	{
		super(sc.next());
	}
	void m7()
	{
		System.out.println("Abstract Method Overridden");
	}

}
class Test1
{
	static Scanner sc= new Scanner(System.in);
	
			
	void display(abc obj)
	{
		System.out.println("Enter a String Paramter");
		System.out.println(obj.m1(sc.next()));
		System.out.println("Enter Your String");
		System.out.println(obj.m3(sc.next()));
		System.out.println("Enter Your long number");
		System.out.println(obj.m5(sc.nextLong()));
		obj.m7();
		obj.m8();
		System.out.println("Enter Boolean Value");
		System.out.println(inter3.m6(sc.nextBoolean()));
		System.out.println("Enter Interger Value");
		System.out.println(inter2.m4(sc.nextInt()));
		System.out.println("Enter Interger Value");
		System.out.println(inter1.m2(sc.nextInt()));

	}	
	
	public static void main(String args[])
	{
		System.out.println("Enter a String to store\n----------------------------");
		
		abc obj1=new class1();
		System.out.println("Enter a String Parameter");
		while(true)
		{
		System.out.println("Enter your String to validate\n");
		String s1=sc.next();
		if(s1.equals(obj1.getString()))
		{
			System.out.println("STRING MATHCHED SUCCESSFULLY");
			System.out.println("Enter 1 to invoke class1\nEnter 2 to invoke class2\nEnter 3 to invoke class3");
			int n=sc.nextInt();
			Test1 obj2 =new Test1();
			switch(n)
			{
				case 1:obj2.display(obj1);
        				break;
        			case 2:obj2.display(obj1);
        				break;
        			case 3:obj2.display(obj1);
        				break;	
			}
			System.exit(0);
		}
		else
		{
			System.out.println("Entered String Value is Invalid\n");
			System.out.println("Enter 1 to Update the String OR 2 to Exit");
			int b=sc.nextInt();
			if(b==1)
			{
				System.out.println("Enter your New String");
				String s2=sc.next();
				obj1.setString(s2);
				System.out.println("Your Updated String is: "+obj1.getString());			
			}	
			else
			{
				System.exit(0);
			}	

		}
		}
	}
}