import java.util.*;
class Question10
{
	int m1(String Name)
	{
		System.out.println("Entered Name: "+Name);
		return 37 ;
	}
	static float m2(boolean b)
	{
		System.out.println("Entered boolean value: "+b);
		return 3.75f


;
	}
	double m3(char ch)
	{
		System.out.println("Entered character value: "+ch);
		return 3.77;
	}
	

	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question10 obj=new Question10();
		System.out.println("Enter Your Name");
		System.out.println(obj.m1(sc.next()));

		System.out.println("Enter Your Boolean Value");
		System.out.println(m2(sc.nextBoolean()));

		System.out.println("Enter Your Character Value");
		System.out.println(obj.m3(sc.next().charAt(0)));

					
		
	}
}