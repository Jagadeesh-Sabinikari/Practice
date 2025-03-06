import java.util.*;
class Question17
{
	static Scanner sc=new Scanner(System.in);
	static Question17 obj=new Question17();
	Boolean m1(String s)
	{
		System.out.println(s);
		System.out.println("Enter Your Boolean");
		return sc.nextBoolean();
	}
	double m2(Boolean b)
	{
		System.out.println(b);
		System.out.println("Enter Your String Value");
		System.out.println(obj.m1(sc.next()));
		System.out.println("Enter Your Double Value");
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Your Boolean value");
		System.out.println(obj.m2(sc.nextBoolean()));
	}
}