package pack1;
import java.util.*;
public interface i1
{
	Scanner sc=new Scanner(System.in);
	boolean m4(long l);
	default boolean m5(int n)
	{
		System.out.println("Interface-1 Non Static method invoked "+n);	
		System.out.println("Enter Boolean Value");
		return sc.nextBoolean();	
	}
	static int m6(char c)
	{
		System.out.println("Interface-1 static method invoked "+c);
		System.out.println("Enter Character");
		return sc.next().charAt(0);
	}
}