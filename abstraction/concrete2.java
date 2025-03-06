
import java.util.*;
class concrete1
{
	static Scanner sc=new Scanner(System.in);
	concrete1(String name)
	{
		System.out.println(name);
	}
	void meth()
	{	
		System.out.println("defined method of concrete1 class invoked");
	}
}
abstract class abs extends concrete1
{
	abs(int a)	
	{
		super(sc.next());
		System.out.println(a);
	}
	void m()
	{
		super.meth();
		System.out.println("Abstract class defined m1() invoked");			
	}
	abstract void m1();
	abstract void m2();
}
class concrete2 extends abs
{
	
	concrete2()
	{
		
		super(sc.nextInt());
		this.m1();
	}
 	void m1()
	{
		this.m2();
		System.out.println("Abstract m1()invoked");
	}
	void m2()
	{	super.m();
		System.out.println("Abstract m2()invoked");
	}
	public static void main(String args[])
	{
		
		concrete2 obj=new concrete2();
		obj.m1();
		/*obj.m2();
		obj.m();
		obj.meth();*/	

	}

}