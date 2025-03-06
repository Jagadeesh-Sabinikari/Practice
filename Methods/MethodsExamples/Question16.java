import java.util.*;
class Question16
{
	static Scanner sc=new Scanner(System.in);
	static Question16 obj=new Question16();
	boolean m1(String s)
	{
		System.out.println(s);
		System.out.println("Enter Your Boolean");
		return sc.nextBoolean();
	}
	void m2(float f)
	{
		System.out.println(f);
		System.out.println("Enter Your String");
		System.out.println(obj.m1(sc.next()));
	}
	public static void main(String[] args)
	{
		System.out.println("Enter your float value");
		obj.m2(sc.nextFloat());
	}
}