import java.util.*;
class Main1
{
	static Scanner sc=new Scanner(System.in);

	Main1()
	{
		System.out.println("Hello");
	}

	/*boolean m1(String name)
	{
		System.out.println(name);
		return sc.nextBoolean();
	}*/
}
/*class Main2 extends Main1
{
	boolean m1(String name)
	{
		System.out.println(name);
		System.out.println(super.m1(sc.next()));
		return sc.nextBoolean();
	}
}
class Main3 extends Main2
{
	boolean m1(String name)
	{
		System.out.println(name);
		System.out.println(super.m1(sc.next()));
		return sc.nextBoolean();
	}
}*/
class SuperLevel2 extends Main1
{
	Main4(int a)
	{
		System.out.println("Hello");
	}
	
	public static void main(String []args)
	{
		new Main3(sc.nextInt());
	}
}
