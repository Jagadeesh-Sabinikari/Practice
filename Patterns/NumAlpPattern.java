import java.util.*;
class NumAlpPattern
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch=(char)65;
		int c=1;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==j)
					{
						System.out.print("* ");
						c++;
						ch++;
					}
					else if(i<j)
					{
						System.out.print(c+" ");
						c++;
						ch++;
					}
					else
					{
						if(ch=='Z')
						{
							System.out.print(ch+" ");
							ch=(char)65;
						}
						System.out.print(ch+" ");
						ch++;
						c++;
					}
				}
				System.out.println();
	
			}
		}
		else
		{
			System.out.print("Invalid Input");	
		}
	}
}