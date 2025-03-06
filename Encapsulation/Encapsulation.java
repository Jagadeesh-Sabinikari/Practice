class E
{
	private int a=10;
	void set1(int a)
	{
		this.a=a;
	}
	int get1()
	{
		return a;
	}
}
class Encapsulation
{
	public static void main(String []args)
	{
		E obj=new E();
		obj.set1(50);
		System.out.println(obj.get1());
	}

}