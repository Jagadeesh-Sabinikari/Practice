import java.util.*;
class Question13
{
	static Scanner sc=new Scanner(System.in);
	static Question13 obj=new Question13();
	int m1(String s)
	{
		System.out.println(s);
		System.out.println("Enter Your interger Value");
		int a=sc.nextInt();
		return a;
	}
	static int m2(boolean b)
	{
		System.out.println(b);

		//System.out.println("Enter Your String Value");
		//System.out.println(obj.m1(sc.next()));

		System.out.println("Enter Your interger Value");
		System.out.println("Enter Your String Value");
		
		return (sc.nextInt())+(obj.m1(sc.next()));
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Your Boolean Value");
		System.out.println(obj.m2(sc.nextBoolean()));
	}
}
