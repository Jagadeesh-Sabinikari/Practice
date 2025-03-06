import java.util.*;
class Question6
{
	int m1(int num)
	{
		System.out.println("Entered Number is: "+num);
		return 37;
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		Question6 obj=new Question6();
		System.out.println("Enter Integer Value");
		System.out.println(obj.m1(sc.nextInt()));		
		
	}
}