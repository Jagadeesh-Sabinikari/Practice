package RBI;
import java.util.*;
public interface Process
{
	
	public static Scanner sc=new Scanner(System.in);
	String NewAccNum="987456321";
	public String accOpening();
	public int deposit();
	public int withdraw();
	public int checkbal();
	public void loan();
	public void Ploan();
	public void Cloan();	
	public void Hloan();		
	public static void loading()
	{
		for(int i=1; i <=4; i++) 
		{
         		System.out.print(".");
        	 	try {
           			 Thread.sleep(800); // sleep/stop a thread for 1 second
         	 	     }	
			 catch(InterruptedException e)
			 {
        		    System.out.println("An Excetion occured: " + e);
        		 }
		}
	}
}