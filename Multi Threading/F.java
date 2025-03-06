class F implements Runnable
{
	public void run()
	{
		m1();	
	}
	void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) throws Exception
	{
		F obj=new F();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
			t1.start();
			t1.join();
			t2.start();
			t2.join();	
			t3.start();
			t3.join();
		System.out.println("All Threads executed Successfully");
		
	}
}