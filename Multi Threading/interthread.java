import java.util.*;
class Batch114_116
{
    boolean b=true;
    synchronized void java()
    {
        System.out.print("sir ochesta agandi");
        for(int i=0;i<5;i++)
        {
            try{
            Thread.sleep(1000);
            System.out.print(". ");
            }
            catch(InterruptedException e){}
        }
        System.out.println();
        notify();
    }
    synchronized void pro()
    {
        try{
        if(b==true)
        {
            System.out.println("please wait sir java class is going on");
            wait();
        }
        System.out.println("i will take care macha");
        for(int i=0;i<5;i++){
            
                 Thread.sleep(1000);
        }
        System.out.println("open instacks");
        }
        catch(InterruptedException e){}
    }
}
class Charan extends Thread
{
    static Batch114_116 x;
    Charan(Batch114_116 x){
        this.x=x;
    }
    public void run()
    {
        x.java();
    }
}
class PhaniSir extends Thread{
    static Batch114_116 x;
    PhaniSir(Batch114_116 x){
        this.x=x;
    }
    public void run()
    {
        x.pro();
    }
}
public class Main
{
	public static void main(String[] args) {
	   Batch114_116 x=new Batch114_116();
		Charan t1=new Charan(x);
		PhaniSir t2=new PhaniSir(x);
		t2.start();
		t1.start();
	}
}