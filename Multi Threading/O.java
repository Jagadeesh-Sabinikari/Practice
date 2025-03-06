class M extends Thread
{
	
	public void run()
	{
		for(char alp='A';alp<='Z';alp++)
		{
			System.out.print(alp+" ");
			if(alp=='G')
			{
				O.t2.resume();
				O.t1.suspend();
			}
		}
		
	}
}
class N extends Thread
{
	
	public void run()
	{
		for(char Alp='a';Alp<='z';Alp++)
		{
			
			System.out.print(Alp+" ");
			if(Alp=='g')
			{
				O.t1.resume();
			}
		}
		
	}
}
class O
{
	static M t1;
	static N t2;
	public static void main(String args[])throws Exception
	{
		t1=new M();
		t2=new N();

		t1.start();
		t2.start();
		t2.suspend();
	}
}