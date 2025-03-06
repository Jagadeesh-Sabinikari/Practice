import java.util.Scanner;
class Question19
{
    static Question19 obj=new Question19();
    static Scanner sc=new Scanner(System.in);
    public void m1(String Name)
    {
        System.out.println(Name);
    }
    public void m2(boolean b)
    {
        System.out.println(b);
	  System.out.println("enter Your Name");
    	  obj.m1(sc.next());
    }
    public static void main(String []args)
    {
	  System.out.println("Enter Boolean Value");
        obj.m2(sc.nextBoolean());
    }
}