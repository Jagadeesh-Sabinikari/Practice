import CVException.BatchLimit;
class A1
{
	void BatchAdmit(int n)throws BatchLimit
	{
		if(n<=10)
		{		
			System.out.println("Seat Confirmed");
		}
		else
		{
			BatchLimit obj=new BatchLimit("Admissions Full\nNo Seats availabe");
			throw obj;
		}
		System.out.print("hiiii");
		
	}
	public static void main(String args[])throws BatchLimit
	{
		A1 x=new A1();
		for(int i=1;i>=1;i++)
		{
			x.BatchAdmit(i);	
		}

		
	}
}