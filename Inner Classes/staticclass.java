class staticclass
{
	static class Z	
	{
		void m1()
		{
			System.out.println("M1 Method");
		}
	}
	public static void main(String args[])
	{
		staticclass.Z obj=new staticclass.Z();
		obj.m1();		

	}
}