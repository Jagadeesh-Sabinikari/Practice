import java.util.*;
class Question11
{
	static Scanner sc=new Scanner(System.in);
	static Question11 obj=new Question11();
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(String s)
	{
		System.out.println(s);
		System.out.println("Enter your Interger Value");
		obj.m1(sc.nextInt());
	}
	void m3(float f)
	{
		System.out.println(f);
		System.out.println("Enter your String Value");
		obj.m2(sc.next());
	}
	void m4(boolean b)
	{
		System.out.println(b);
		System.out.println("Enter your float Value");
		obj.m3(sc.nextFloat());
	}
	void m5(double d)
	{
		System.out.println(d);
		System.out.println("Enter your Boolean Value");
		obj.m4(sc.nextBoolean());
	}
	public static void main(String[] args)
	{	
		System.out.println("Enter your Double Value");
		obj.m5(sc.nextDouble());
	}
}
			