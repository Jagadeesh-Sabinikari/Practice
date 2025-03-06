class G implements Runnable
{
	static G obj=new G();
	static Thread t1=new Thread(obj);
	public void run()
	{
		m1();	
	}
	void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if(i==3)	
			{
				H.t2.resume();
			}
		}
		System.out.println();
	}
}
class H extends G
{
	static H obj1=new H();
	static Thread t2=new Thread(obj1);
	public void run()
	{
		m2();	
	}
	void m2()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) throws Exception
	{
			t1.start();
			t2.start();
			t2.suspend();	
		System.out.println("All Threads executed Successfully");
		
	}
}