class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[])
	{
		A obj=new A();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);

		System.out.println("First Thread Status: "+t1.isAlive());
		System.out.println("Second Thread Status: "+t2.isAlive());
		System.out.println("Third Thread Status: "+t3.isAlive());

		System.out.println("Before Thread Name: "+t1.getName());
		System.out.println("Before Thread Name: "+t2.getName());
		System.out.println("Before Thread Name: "+t3.getName());
		
		t1.setPriority(MIN_PRIORITY);
		t1.setName("Jagadeesh");
		t1.start();
		System.out.println("final first Thread Status: "+ t1.isAlive()+" PRIORITY "+t1.getPriority());

		t2.setPriority(5);
		t2.setName("Honey");
		t2.start();	
		System.out.println("final second Thread Status: "+ t2.isAlive()+" PRIORITY "+t2.getPriority());

		t3.setPriority(10);
		t3.setName("Hanshu");
		t3.start();
		System.out.println("final third Thread Status: "+ t3.isAlive()+" PRIORITY "+t3.getPriority());

		System.out.println("Before Thread Name: "+t1.getName());
		System.out.println("Before Thread Name: "+t2.getName());
		System.out.println("Before Thread Name: "+t3.getName());
		
		
	}	
}