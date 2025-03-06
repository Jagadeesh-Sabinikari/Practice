public class LambaThread
{
  public static void main (String[]args)
  {
    Thread t = new Thread (()->{
			   for (int i = 0; i < 10; i++)
			   System.out.print (i + " ");});
    t.run ();
    System.out.println ("Hello World");
  }
}
