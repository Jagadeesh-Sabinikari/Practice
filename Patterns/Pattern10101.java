import java.util.Scanner;
class Pattern10101
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		int r=obj.nextInt();
		int p=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				System.out.print(p+" ");
				p=1-p;
			}
			p=1-p;
			System.out.println();
		}
	}
}