class I	extends Thread
{
	public void run()
	{	
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class J	extends Thread
{
	public void run()
	{	

		for(int i=10;i<=20;i++)
		{
			if(i==15)
			{
				L.t3.resume();
			}
			try
			{
				Thread.sleep(1000);
				System.out.print(i+" ");
			}				
			catch(Exception e)
			{}
		}
		System.out.println();
	}
}
class K	extends Thread
{
	public void run()
	{	
		for(int i=20;i<=21;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class L
{
	static K t3;
	public static void main(String args[]) throws Exception
	{
		I t1=new I();
		J t2 =new J();
		  t3=new K();
			
			t1.start();
			t1.join();
			t2.start();
			t3.start();
			t3.suspend();
	}

}
