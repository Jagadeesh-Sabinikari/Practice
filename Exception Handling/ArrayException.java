import java.util.*;
class ArrayException
{		
	static Scanner sc=new Scanner(System.in);
	static ArrayException obj=new ArrayException();
	void m1(int a[])
	{
		try
		{
			for(int i=0;;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
		
	public static void main(String args[])
	{	
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		obj.m1(a);
		
	}
}