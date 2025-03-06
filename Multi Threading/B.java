class B extends Thread
{
	static B obj=new B();
	public void run()
	{
		obj.m1();
	}
		public void m1()
		{
			for(int i=1;i<=20;i++)
			{
				try
				{
					Thread.sleep(1000);
					System.out.print(i+" ");
				}
				catch(Exception e)
				{

				}
				
			}
		}
	
	public static void main(String args[]) throws Exception
	{
		obj.start();	
	}	
}