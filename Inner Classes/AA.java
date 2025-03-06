
import java.util.*;
class AA
{
	static Scanner sc=new Scanner(System.in);
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
		class B
		{
			String m2(int a)
			{	
				System.out.println(a);
				class C
				{
					boolean m3(int a)
					{
						System.out.println(a);
						return sc.nextBoolean();
					}	
				}
				C obj1=new C();
				System.out.println(obj1.m3(sc.nextInt()));
				class D
				{
					double m4(boolean b)
					{
						System.out.println(b);
						return sc.nextDouble();
					}
				}
				D obj2=new D();
				System.out.println(obj2.m4(sc.nextBoolean()));
				return sc.next();
			}
		}
		B obj = new B();
		
		public static void main(String args[])
		{
			AA a1=new AA();
			System.out.println(a1.m1(sc.next()));
			System.out.println(a1.obj.m2(sc.nextInt()));
		}
}