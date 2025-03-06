class sync extends Thread
{
    static sync obj =new sync();
    public void run()
    {
         obj.m1();
    }
    synchronized void m1()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
	System.out.println();
    }
    public static void main (String[] args) 
    {
        Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	t1.start();
	t2.start();
    }
}