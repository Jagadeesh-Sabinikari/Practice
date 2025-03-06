import java.util.*;
public class ReverseNumUsingRec {
	static String reverse(int n)
	{	int rev=0;
		String rev1="";
		if(n>0)
		{
			int r=n%10;
		    rev1=rev*10+r+rev1;
			reverse(n/10);
		}
		return rev1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(reverse(n));
		}

}
