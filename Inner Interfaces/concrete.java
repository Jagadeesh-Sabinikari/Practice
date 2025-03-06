import java.util.*;
interface i1
{
	static Scanner sc=new Scanner(System.in);
	void m1();
	default void m2(int a)
	{
		System.out.println(a);
		System.out.println("M2 Method");
	}
	interface i2
	{
		void m3();
		static void m4(boolean b)
		{
			System.out.println(b);
			System.out.println("M4 Method");		
		}
		
	}
	
}
class concrete implements i1,i1.i2
{
	public void m1()
	{
		System.out.println("M1 Method");
	}
	public void m3()
	{
		System.out.println("M3 Method");
	}
	public static void main(String args[])
	{

		i1 obj=new concrete();
		i2 obj1=new concrete();
		obj.m1();
		obj1.m3();
		obj.m2(sc.nextInt());
		i1.i2.m4(sc.nextBoolean());
	}

}