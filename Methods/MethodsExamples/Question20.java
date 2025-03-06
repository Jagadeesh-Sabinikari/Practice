import java.util.Scanner;
class Question20
{
    static Question20 obj=new Question20();
    static Scanner sc=new Scanner(System.in);
    public float m1()
    {	
        return sc.nextFloat();
    }
    public boolean m2()
    {	
	  System.out.println("enter float value");
        System.out.println(obj.m1());
        System.out.println("enter Boolean Value");
        return sc.nextBoolean();
    }
    public static void main(String []args)
    {
        System.out.println(obj.m2());
    }
}