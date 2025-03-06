class Question22
{
	static Question22 obj=new Question22();
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	public boolean m1(String str)
	{
		System.out.println(str);
		System.out.println("enter Boolean Value");
		return sc.nextBoolean();
	}
	public static char m2(int a)
	{
		System.out.println(a);
		System.out.println("enter String Value");
		obj.m1(sc.next());
		System.out.println("enter char Value");
		return sc.next().charAt(0);
	}
	public static void main(String []args)
	{	
		System.out.println("enter your interger Number");
		m2(sc.nextInt());
	}
}