import java.util.*;
class Bank
{	
	static Scanner sc=new Scanner(System.in);
      long accountNum=sc.nextInt();
	String ifsc= sc.next();
	int atmPin=sc.nextInt();
}
class Customer extends Bank

{	
	void display()
	{	
		System.out.println("CUSTOMER DETAILS");
		System.out.println("----------------");
		System.out.println("Account Number: "+accountNum);
		System.out.println("IFSC: "+ifsc);
		System.out.println("ATM PIN: "+atmPin);
	}
}
class SingleLevelInheritance
{
	public static void main(String args[])
	{
		System.out.println("Enter No of Customers");
		int n=Bank.sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			new Customer().display();
		}
	}
}

