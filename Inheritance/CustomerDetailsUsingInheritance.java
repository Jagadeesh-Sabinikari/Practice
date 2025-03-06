class Bank
{
	static int acc_num;
	static String ifsc;
	static int atmpin;
	static int bal_amt;
}
class Customer1 extends Bank
{
	static void bankDetails()
	{	
		acc_num=123456;
		ifsc= "AXIS000111";
		atmpin=1234;
		bal_amt=20000;
		System.out.println("Bank Details of Customer 1:");
		System.out.println("----------------------------");
		System.out.println("Account Number= "+acc_num);
		System.out.println("IFSC= "+ifsc);
		System.out.println("ATM PIN= "+atmpin);
		System.out.println("Balance Amount= "+bal_amt);
		
	}
}
class Customer2 extends Bank
{
	static void bankDetails()
	{	
		acc_num=5654566;
		ifsc= "AXIS22336";
		atmpin=8965;
		bal_amt=35000;
		System.out.println("Bank Details of Customer 2:");
		System.out.println("----------------------------");
		System.out.println("Account Number= "+acc_num);
		System.out.println("IFSC= "+ifsc);
		System.out.println("ATM PIN= "+atmpin);
		System.out.println("Balance Amount= "+bal_amt);
		
	}
}
class Customer3 extends Bank
{
	static void bankDetails()
	{	
		acc_num=326449;
		ifsc= "AXIS0058543";
		atmpin=3652;
		bal_amt=50000;
		System.out.println("Bank Details of Customer 3:");
		System.out.println("----------------------------");
		System.out.println("Account Number= "+acc_num);
		System.out.println("IFSC= "+ifsc);
		System.out.println("ATM PIN= "+atmpin);
		System.out.println("Balance Amount= "+bal_amt);
		
	}
}
class Customer4 extends Bank
{
	static void bankDetails()
	{	
		acc_num=6556565;
		ifsc= "AXIS002489";
		atmpin=1254;
		bal_amt=95000;
		System.out.println("Bank Details of Customer 4:");
		System.out.println("----------------------------");
		System.out.println("Account Number= "+acc_num);
		System.out.println("IFSC= "+ifsc);
		System.out.println("ATM PIN= "+atmpin);
		System.out.println("Balance Amount= "+bal_amt);
		
	}
}

class CustomerDetailsUsingInheritance
{
	public static void main(String[]args)
	{
		Customer1.bankDetails();
		Customer2.bankDetails();
		Customer3.bankDetails();
		Customer4.bankDetails();
	}
}