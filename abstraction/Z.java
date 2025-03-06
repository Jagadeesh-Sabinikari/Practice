abstract class A
{
	abstract void m1();
}
class Z extends A
{
	void m1()
	{
		System.out.print("Hello");
	}
	public static void main(String []args)
	{
		Z obj=new Z();
		obj.m1();
	}

}