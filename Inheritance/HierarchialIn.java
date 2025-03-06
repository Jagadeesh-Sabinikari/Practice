class A
{
	int a=100;
	int b=200;
	
}
class B extends A
{
	 int c=300;
	 int d=400;
}
class C extends A
{
	 int e=500;
	 int f=600;
}
class HierarchialIn
{
	public static void main(String[] args)
	{
		System.out.print(new C().a+" "+new C().b);
	}
}