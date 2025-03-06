class AA extends Thread
{
	void m1()
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		Thread t=Thread.currentThread();
		if(t.getName().equals("hi"))
		{
			t1.suspend();
		}
		else
		{
			t1.resume();
		}
		for(int i=11;i<=20;i++)	
		{
			System.out.print(i+" ");

		}
		//System.out.println();		
	}
	public void run()
	{
		m1();
	}
		static	AA obj=new AA();
		static Thread t1=new Thread(obj,"hi");
		static Thread t2=new Thread(obj,"bye");
	public static void main(String args[])
	{
		 
		System.out.println(obj);
		
		System.out.println(t1);
		t1.start();
		t2.start();
	}
}