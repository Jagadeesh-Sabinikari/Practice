interface I
{
	int a=10;
	int b=a+10;
	void m1();
}
class A implements I
{
        public void m1()
	{	
		System.out.println(a);
		System.out.println("Method invoked");
	}
	public static void main(String args[])
	{
		new A().m1();
	}	
}