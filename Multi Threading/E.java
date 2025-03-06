class C extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class D extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class E
{
	public static void main(String args[])
	{
		C t1=new C();
		D t2=new D();
		t1.start();
		t2.start();
	}
}