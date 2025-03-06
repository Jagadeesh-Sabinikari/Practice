
class Question18
{
    static Question18 obj=new Question18();

    public void m1()
    {
        System.out.println("Okay Okay");
    }
    public void m2()
    {
        System.out.println("All Well Ahh");
        obj.m1();
    }
    public static void main(String []args)
    {
        obj.m2();
    }
}