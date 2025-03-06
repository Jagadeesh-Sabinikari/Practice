package pack3;
import java.util.*;

import pack1.*;
import pack1.i1;
import pack1.pack2.i2;
import pack1.pack2.i3;
class Test extends Abs implements i1,i2,i3 
{
	Test()
	{
		super(sc.next());
	}
	static Scanner sc=new Scanner(System.in);
	public char m2(String n)
	{
		System.out.println("Abstract Method of Abstract class Invoked :"+n);
		System.out.println("Enter character");
		return sc.next().charAt(0);
	}
	public boolean m4(long l)
	{
		System.out.println("Interface 1 Abstract Method invoked: "+ l);
		System.out.println("Enter Boolean");
		return sc.nextBoolean();
	}	
	public boolean m7(String a)
	{
		System.out.println("Interface 2 Abstract Method invoked: "+a);
		System.out.println("Enter Boolean");
		return sc.nextBoolean();
	}
	public boolean m10(String a)
	{
		System.out.println("Interface 3 Abstract Method invoked: "+a);
		System.out.println("Enter Boolean");
		return sc.nextBoolean();
	}
		
	public static void main(String args[])
	{
		System.out.println("Enter String");
		pack1.concrete c=new pack1.concrete();
		System.out.println("Enter String");
		Test T=new Test();
		System.out.println("Enter Interger");
		System.out.println(c.m1(sc.nextInt()));

		System.out.println("Enter Interger");
		System.out.println(T.m3(sc.nextInt()));

		System.out.println("Enter Integer");
		System.out.println(T.m5(sc.nextInt()));

		System.out.println("Enter Character");
		System.out.println(i1.m6(sc.next().charAt(0)));

		System.out.println("Enter Integer");
		System.out.println(i2.m8(sc.nextInt()));

		System.out.println("Enter Interger");
		System.out.println(T.m9(sc.nextInt()));

		System.out.println("Enter Interger");
		System.out.println(i3.m11(sc.nextInt()));
		
		System.out.println("Enter Interger");
		System.out.println(T.m12(sc.nextInt()));

		System.out.println("Enter String");
		System.out.println(T.m2(sc.next()));

		System.out.println("Enter Long value");
		System.out.println(T.m4(sc.nextLong()));

		System.out.println("Enter String");
		System.out.println(T.m7(sc.next()));
		
		System.out.println("Enter String");
		System.out.println(T.m10(sc.next()));

	}
}
