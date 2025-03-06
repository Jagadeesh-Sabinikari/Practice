import java.util.*;
class Question7
{
	String m2(String Name)
	{
		System.out.println("Entered Name: "+Name);
		return "CVcorp Gula-Gulas";
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question7 obj=new Question7();
		System.out.println("Enter Your Name");
		System.out.println(obj.m2(sc.next()));		
		
	}
}