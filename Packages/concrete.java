package pack1;
import java.util.*;
public class concrete
{
	public static Scanner sc=new Scanner(System.in);
	public int n=sc.nextInt();
	public concrete()
	{
		this(sc.next());
	}
	public concrete(String name)
	{
		System.out.println("Parameterised Constructor invoked: "+name);
	}
	public double m1(int a)
	{
		System.out.println("Non-static method invoked "+a);
		System.out.println("Enter Double value");
		return sc.nextDouble();
	}
}
