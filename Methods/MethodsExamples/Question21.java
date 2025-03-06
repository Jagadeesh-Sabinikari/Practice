import java.util.Scanner;
class Question21
{
    static Question21 obj=new Question21();
    static Scanner sc=new Scanner(System.in);
    public static boolean m1(boolean b)
    {
        System.out.println(b);
	  System.out.println("enter Boolean Value");
        return sc.nextBoolean();
    }
    public char m2(char c)
    {
        System.out.println(c);
        return sc.next().charAt(0);
    }
    public static double m3(double d)
    {
        System.out.println(d);
        return sc.nextDouble();
    }
     public long m4(long l)
    {
        System.out.println(l);
        return sc.nextLong();
    }
    public static float m5(float f)
    {
        System.out.println(f);
        return sc.nextFloat();
    }
    public String m6(String str)
    {
        System.out.println(str);
        return sc.next();
    }
    public static void main(String []args)
    {
	  System.out.println("enter Boolean Value");
        System.out.println(m1(sc.nextBoolean()));

	  System.out.println("enter Character Value");
        System.out.println(obj.m2(sc.next().charAt(0)));
	
	  System.out.println("enter Double Value");
        System.out.println(m3(sc.nextDouble()));

	  System.out.println("enter Long Value");
        System.out.println(obj.m4(sc.nextLong()));

	  System.out.println("enter float Value");
        System.out.println(m5(sc.nextFloat()));

	  System.out.println("enter string Value");
        System.out.println(obj.m6(sc.next()));
    }
}