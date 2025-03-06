import java.util.*;
class Question5
{
	void m1(float f,String Name)
	{
		System.out.println("Entered float Number is: "+f);
		System.out.println("Entered Name is: "+Name);
	}
	static void m2(boolean b, long l)
	{
		System.out.println("Entered boolean value is: "+b);
		System.out.println("Entered long Number is: "+l);
	}
	void m3(char ch, int i)
	{
		System.out.println("Entered character: "+ch);
		System.out.println("Entered integer Number is: "+i);
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question5 obj=new Question5();
		System.out.println("Enter float and Name values");
		obj.m1(sc.nextFloat(),sc.next());
		System.out.println("Enter boolean and Long values");
		m2(sc.nextBoolean(),sc.nextLong());
		System.out.println("Enter character and Integer values");
		obj.m3(sc.next().charAt(0),sc.nextInt());
	}
}