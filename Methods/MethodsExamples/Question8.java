import java.util.*;
class Question8
{
	static boolean m1(boolean b)
	{
		System.out.println("Entered boolean value: "+b);
		return true;
	}
	char m2(char ch)
	{
		System.out.println("Entered character value: "+ch);
		return 'J';
	}
	static double m3(double d)
	{
		System.out.println("Entered double value: "+d);
		return 3.7;
	}
	static long m4(long l)
	{
		System.out.println("Entered Long value: "+l);
		return 2569;
	}
	static float m5(float f)
	{
		System.out.println("Entered float value: "+f);
		return 3.77f;
	}
	String m6(String Name)
	{
		System.out.println("Entered Name: "+Name);
		return "Gula-Gulas";
	}

	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question8 obj=new Question8();
		System.out.println("Enter Your boolean Value");
		System.out.println(m1(sc.nextBoolean()));

		System.out.println("Enter Your Character Value");
		System.out.println(obj.m2(sc.next().charAt(0)));

		System.out.println("Enter Your Double Value");
		System.out.println(m3(sc.nextDouble()));

		System.out.println("Enter Your Long Value");
		System.out.println(m4(sc.nextLong()));

		System.out.println("Enter Your float Value");
		System.out.println(m5(sc.nextFloat()));

		System.out.println("Enter Your Name");
		System.out.println(obj.m6(sc.next()));			
		
	}
}