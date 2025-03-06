import java.util.*;
interface LambdaExpression
{
	static Scanner sc=new Scanner(System.in);
	String m1();
	interface ii2
	{
		int m2(String n);
	}
	LambdaExpression obj=(a) ->{
			 System.out.println("Method m1: "+a);
			System.out.println("Enter String");
			 return sc.next();
		       };
	public static void main(String agrs[])
	{
		System.out.println("Enter Integer");
		System.out.println(obj.m1(sc.nextInt()));
		LambdaExpression.ii2 obj1=(n) ->{
					System.out.println("Method M2: "+ n);
					System.out.println("Enter Integer");
					return sc.nextInt();
					};
		System.out.println("Enter String");
		System.out.println(obj1.m2(sc.next()));
		
		
		/*LambdaExpression obj=() -> sc.next();
		System.out.println(obj.m1());*/
	}
}