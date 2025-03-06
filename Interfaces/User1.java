import java.util.*;
interface Redbus
{
	public static final int tp=500;
	String tb(int seats);

}
interface Airtel
{
	public static final int smallpack=499;
	public static final int familypack=699;
	String rech(long number);
	
}
class Paytm implements Redbus,Airtel
{
	static Paytm p=new Paytm();
	static Scanner sc=new Scanner(System.in);
	static void paytm()
	{
	System.out.println("Press 1 for Ticket Booking\nPress 2 for Recharge");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.print("Enter No.of Seats\n");
				System.out.println(p.tb(sc.nextInt()));
				break;
			case 2: System.out.print("Enter your Mobile Number for Recharge\n ");	
				System.out.println(p.rech(sc.nextLong()));
				break;
			default: System.out.println("Invalid Selection");
				break;
		}
	}
	public String tb(int seats)
	{
		System.out.println("You've selected "+seats+" Seats");
		return "Total amount to pay is "+(tp*seats);
	}
	public String rech(long number)
	{
		System.out.println("Please select your Recharge pack from here");
		System.out.println("Enter 1 for small pack recharge\nEnter 2 for Family pack recharge");
		int n=sc.nextInt();
		if(n==1)
		{
			return "Your Mobile Number "+number+" is Successfully recharged with small pack "+smallpack;

		}
			return "Your Mobile Number "+number+" is Successfully recharged with Family pack "+familypack;

	}
	

}
class GooglePay implements Redbus,Airtel
{
	static GooglePay g=new GooglePay();
	static Scanner sc=new Scanner(System.in);
	static void googlepay()
	{
	System.out.println("Press 1 for Ticket Booking\nPress 2 for Recharge");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.print("Enter No.of Seats\n");
				System.out.println(g.tb(sc.nextInt()));
				break;
			case 2: System.out.print("Enter your Mobile Number for Recharge\n");	
				System.out.println(g.rech(sc.nextLong()));
				break;
			default: System.out.println("Invalid Selection");
				break;
		}
	}
	public String tb(int seats)
	{
		System.out.println("You've selected "+seats+" Seats");
		return "Total amount to pay is "+(tp*seats);
	}
	public String rech(long number)
	{
		System.out.println("Please select your Recharge pack from here");
		System.out.println("Enter 1 for small pack recharge\nEnter 2 for Family pack recharge");
		int n=sc.nextInt();
		if(n==1)
		{
			return "Your Mobile Number "+number+" is Successfully recharged with small pack "+smallpack;

		}
			return "Your Mobile Number "+number+" is Successfully recharged with Family pack "+familypack;

	}
	

	
}
class User1
{	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{	
		System.out.println("Press 1 for PAYTM\nPress 2 for GOOGLEPAY");
		int n=sc.nextInt();
		if(n==1)
		{
			GooglePay.googlepay();
		}
		else
		{
			Paytm.paytm();
		}
	}


}