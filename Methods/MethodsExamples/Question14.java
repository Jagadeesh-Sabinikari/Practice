import java.util.*;
class Question14
{
	static Scanner sc=new Scanner(System.in);
	static Question14 obj=new Question14();
	int add(int a,int b)
	{
		//System.out.println(a);
		//System.out.println(b);
		int c=a+b;
		return c;
	}
	int sub(int a,int b)
	{
		//System.out.println(a);
		//System.out.println(b);
		int c=a-b;
		return c;
	}
	int multi()
	{	System.out.println("Enter 2 Integers");
		System.out.println(obj.add(sc.nextInt(),sc.nextInt())*(obj.sub(sc.nextInt(),sc.nextInt()));
		//System.out.println("Enter 2 Integers");
		//System.out.println(obj.sub(sc.nextInt(),sc.nextInt()));
		//System.out.println("Enter 4 Integers");
		//int c=(obj.add(sc.nextInt(),sc.nextInt()))*(obj.sub(sc.nextInt(),sc.nextInt()));
		//return c;
	}
	public static void main(String[] args)
	{	
		System.out.print(obj.multi());
	}
}
	