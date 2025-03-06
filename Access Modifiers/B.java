package p2;
import p1.*;
class B extends A
{
	public static void main(String args[])	
	{
		B obj=new B();
		A.m1();
		System.out.println(obj.name);
		System.out.println(obj.d);
	}
	
}