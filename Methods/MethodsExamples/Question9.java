import java.util.*;
class Question9
{
	boolean m1(char ch)
	{
		System.out.println("Entered character value: "+ch);
		return true;
	}

	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question9 obj=new Question9();

		System.out.println("Enter Your Character Value");
		System.out.println(obj.m1(sc.next().charAt(0)));			
		
	}
}