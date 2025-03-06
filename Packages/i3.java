package pack1.pack2;
import java.util.*;
public interface i3
{
	Scanner sc=new Scanner(System.in);
	boolean m10(String a);
	static String m11(int n)
	{
		System.out.println("Interface Static method invoked "+n);	
		System.out.println("Enter String Value");
		return sc.next();	
	}
	default boolean m12(int n)
	{
		System.out.println("Interface Static method invoked "+n);	
		System.out.println("Enter boolean Value");
		return sc.nextBoolean();	
	}
}