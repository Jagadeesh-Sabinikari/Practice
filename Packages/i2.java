package pack1.pack2;
import java.util.*;
public interface i2
{
	Scanner sc=new Scanner(System.in);
	boolean m7(String a);
	static String m8(int n)
	{
		System.out.println("Interface Static method invoked "+n);	
		System.out.println("Enter String Value");
		return sc.next();	
	}
	default boolean m9(int n)
	{
		System.out.println("Interface Static method invoked "+n);	
		System.out.println("Enter boolean Value");
		return sc.nextBoolean();	
	}
}