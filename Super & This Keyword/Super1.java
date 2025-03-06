import java.util.*;
class super2
{
	static Scanner sc=new Scanner(System.in);

	super2(int a)
	{
		System.out.println(a);
	}

}
class super1 extends super2
{
	super1()
	{
		super(10);
		System.out.println("Hello");
	}
	
	public static void main(String []args)
	{
		new super1();
	}
}