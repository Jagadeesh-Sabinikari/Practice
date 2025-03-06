package pack1;
import java.util.*;
public abstract class Abs
{
	static Scanner sc=new Scanner(System.in);
	public abstract char m2(String n);
	public Abs(String name)
	{
		System.out.println("Abstract Class PC invoked "+name);
	}
	public boolean m3(int n)
	{
		System.out.println("Abstract Class Non Static method invoked "+n);	
		System.out.println("Enter Boolean Value");
		return sc.nextBoolean();	
	}
}