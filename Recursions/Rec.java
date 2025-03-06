import java.util.*;
class Rec
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(rec(n));
	}
	public static int rec(int a)
	{
		if(a>0)
		{
			int x=rec(a-1);
			int y=2*rec(a-2);
			return x+y+a;
		}
		return 3;
	}
		

}