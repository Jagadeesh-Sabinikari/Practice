class F
{
	private int a=10;
	private String s="Jagadeesh";
	private boolean b=false;
	void set1(int a,String s, boolean b)
	{
		this.a=a;
		this.s=s;
		this.b=b;
	}
	int get1()
	{
		return a;
	}
	String get2()
	{
		return s;
	}
	boolean get3()
	{
		return b;
	}
}
class Encapsulation1
{
	public static void main(String []args)
	{
		F obj=new F();
		obj.set1(100,"Sabinkar",true);
		System.out.println(obj.get1());
		System.out.println(obj.get2());
		System.out.println(obj.get3 ());
	}

}