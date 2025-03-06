package p2;
import java.util.*;
import p1.A1;
import p1.i1;
import p2.concrete;
public class Test extends concrete
{	
	int m1(String n)
	{
		System.out.println(n);
		return sc.nextInt();
	}
        public String m2(int n)
	{
  		System.out.println(n);
		return sc.next();
	}
	

	public static void main(String args[])
	{
		concrete obj =new concrete();
		Test obj1 = new Test();
		A1 obj2= new Test();
		System.out.println(obj1.m1(sc.next()));
		System.out.println(obj1.m2(sc.nextInt()));
	}
}