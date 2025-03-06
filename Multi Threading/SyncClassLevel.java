class sync1
{
	synchronized void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class SyncClassLevel extends Thread
{
	static sync1 obj = new sync1();
	public void run()	
	{
		obj.m1();
	}
	public static void main(String args[])
	{
		SyncClassLevel t1=new SyncClassLevel();
		SyncClassLevel t2=new SyncClassLevel();
		t1.start();
		t2.start();
	}
		
}