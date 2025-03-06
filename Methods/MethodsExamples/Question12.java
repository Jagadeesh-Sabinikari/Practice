import java.util.*;
class Question12
{
	static Scanner sc=new Scanner(System.in);
	static Question12 obj=new Question12();
	float m1(String s)
	{
		System.out.println(s);
		System.out.println("Enter your float Value");
		return sc.nextFloat();
	}
	static boolean m2(char c)
	{
		System.out.println(c);
		System.out.println("Enter your String Value");
		System.out.println(obj.m1(sc.next()));
		System.out.println("Enter your Boolean Value");
		return sc.nextBoolean();
	}
	double m3(int a)
	{
		System.out.println(a);
		System.out.println("Enter your char Value");
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println("Enter your double Value");
		return sc.nextDouble();
	}
	static int m4(boolean b)
	{
		System.out.println(b);
		System.out.println("Enter your Interger Value");
		System.out.println(obj.m3(sc.nextInt()));
		System.out.println("Enter your interger Value");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		System.out.println("Enter your Boolean Value");
		System.out.println(obj.m4(sc.nextBoolean()));
	}
}
			