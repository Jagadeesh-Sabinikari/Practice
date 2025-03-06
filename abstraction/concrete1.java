import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(int a);
	abstract String m2(String name);
	 void m1()
	{	
		System.out.print("hi");
	}

}
class concrete1 extends A
{
	
	int m1(int a)
	{
		System.out.println(a);
		return 10;
	}
	String m2(String name)
	{
		System.out.println(name);
		return "Jagadeesh";		
	}
	public static void main(String args[])
	{	
		concrete1 obj=new concrete1();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj.m2(sc.next()));
		obj.m1();
	}
}