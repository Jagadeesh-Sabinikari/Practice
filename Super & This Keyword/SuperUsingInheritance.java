
class z
{

	z()
	{
		System.out.println("Hi");
	}

}
class y extends z
{
	y()
	{
		System.out.println("Hello");
	}
}
class x extends y
{
	x(int a,int b)
	{
		System.out.println(a+" "+b);
	}
}
class w extends x
{
	w(int a)
	{
		super(20,30);
		System.out.println(a);
	}
}
class SuperUsingInheritance extends w
{
	v()
	{
		super(10);
		System.out.println("Namaste");
	}
	public static void main(String []args)
	{
		new v();
	}
}







	
