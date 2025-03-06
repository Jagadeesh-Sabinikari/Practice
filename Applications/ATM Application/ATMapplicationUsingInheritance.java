import java.util.*;
class Bank
{	
	static Scanner sc=new Scanner(System.in);
     	static long accountNum=123456789;
	static int atmPin=1234;
	static int balance=5000;
}
class ATMapplicationUsingInheritance extends Bank
{	static Customer obj=new Customer();
	int withdraw()
	{	
		System.out.println("Enter your Withdrawl Amount");
		int num3=sc.nextInt();
		int num4=balance-num3;
		return num4;
	}

	int deposit()
	{	

		System.out.println("Enter your Deposit Amount");
		int num3=sc.nextInt();
		int num4=balance+num3;
		return num4;
	}
	
	int balanceEnq()
	{	
	      return balance;
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to Gula-Gula ATM");
		System.out.println("Insert Your Card");
		System.out.println("Enter Your Account Number");
		int num=sc.nextInt();
		if(num==accountNum)
		{	
			System.out.println("Enter Your 4 digit ATM Pin");
			int pin=sc.nextInt();
			if(pin==atmPin)
			{

				System.out.print("Press 1 to Withdrawl \nPress 2 to Deposit\nPress 3 to Balance Enquiry");
				int n=sc.nextInt();
				switch(n)
				{
					case 1: System.out.print("Your Current balance: "+obj.withdraw());
					  break;
					case 2: System.out.print("Your Current balance: "+obj.deposit());
					  break;
					case 3: System.out.print("Your Current balance: "+obj.balanceEnq());
					  break;
					default: System.out.println("Sorry! It's a Invalid Input");
				}
			}
			else
			{
				System.out.print("Sorry! You've entered Wrong Pin");
			}
		}
		else
		{
			System.out.println("Please Check your Account Number");
		}
 		
	}
}

