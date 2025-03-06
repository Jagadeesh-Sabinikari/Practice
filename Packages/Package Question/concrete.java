package p2;

import java.util.*;
public class concrete
{
	public static Scanner sc=new Scanner(System.in);
	static int m4(boolean b)
	{
		System.out.println("defined method of concrete "+b);
		System.out.println("Enter Interger");
		return sc.nextInt();
	}
	public concrete(String n)
	{
		super(sc.nextInt());
		System.out.println("PC invoked "+n);
	}
	public concrete()
	{
		this(sc.next());
	}
	
}