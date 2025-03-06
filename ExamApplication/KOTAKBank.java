package RBI.KOTAK;
import RBI.*;
public class KOTAKBank implements RBI.Process
{
	public static String name;
	public static long aadhar;
	public static long phno;
	public static String pan;
	public static String dob;
	public static int balance=0;
	public static String ifsc="KOTAK00001212";
	public static KOTAKBank kotak=new KOTAKBank();
	public void kotakBank()
	{	
		while(true)
		{
			System.out.println("Enter 1 to Open Account in KOTAK MAHINDRA Bank!");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println(kotak.accOpening());
				balance+=sc.nextInt();
				System.out.println("Dear Customer! Your Current Account Balance is: "+balance+"\n\n");
				System.out.printf("%110s","You're all good to go!! Happy Banking\n");
				break;
			}
			else
			{
				System.out.println("Kindly Please check your Option before Proceeding\n");
			}
		}
		while(true)
		{
			System.out.println("Enter 1 to Deposit\nEnter 2 to Withdraw\nEnter 3 to check Balance\nEnter 4 to Apply Loan\nEnter 5 to terminate the Transaction\n");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: System.out.println(kotak.deposit());
					System.out.println("-------------------------------------------------");
					break;
				case 2: System.out.println(kotak.withdraw());
					System.out.println("--------------------------------------------------");
					break;
				case 3: System.out.println(kotak.checkbal());
					System.out.println("--------------------------------------------------");
					break;
				case 4: loan();
					break;
				case 5: System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
					System.out.println();
					System.out.printf("%100s","******************************************");	
					System.exit(0);
					break;
				default: System.out.println("That's a Invalid Option");
					break;
			

			}
		}
	}
	public String accOpening()
	{
		System.out.println("Fill the Form with following Details\n");
		System.out.println("Account Holder Name\nAadhar Number\nMobile Number\nPAN Number\nDate Of Birth(DOB)\nLocation\n-----------------------");
		System.out.print("Account Holder Name: ");
		name=sc.next();
		System.out.print("Aadhar Number: ");
		aadhar=sc.nextLong();
		System.out.print("Mobile Number: ");
		phno=sc.nextLong();
		System.out.print("PAN Number: ");
		pan=sc.next();
		System.out.print("Date of Birth(DOB): ");
		dob=sc.next();
		System.out.printf("%110s","Please Wait! Your details are being fectched");
		RBI.Process.loading();
		System.out.println("\n");
		System.out.print("Your ICICI Account Number is: ");
		return NewAccNum+"\nYour IFSC Code: "+ifsc+"\n\nPlease Deposit RS.1000 as Minimum Balance\n--------------------------------------------------";
		
	}
	public int deposit()
	{
		System.out.println("Please enter your deposit amount\n");
		balance+=sc.nextInt();
		System.out.printf("%110s","Please wait! Your transaction is being processed");
		RBI.Process.loading();
		System.out.print("\nDeposit is Successful!\nDear Customer! Your Current Account Balance is: ");
		return balance;
	}
	public int withdraw()
	{
		System.out.println("Please enter your Withdrawl amount\n");
		balance-=sc.nextInt();
		System.out.printf("%110s","Please wait! Your transaction is being processed");
		RBI.Process.loading();
		System.out.print("\nYour Transaction is Successful!\nDear Customer! Your Current Account Balance is: ");
		return balance;				             
		
	}
	public int checkbal()
	{
		while(true)
		{
			System.out.print("Please Enter Your Account Number: ");
			String n=sc.next();
			System.out.print("\nPlease Enter Your KOTAK MAHINDRA Bank IFSC code: ");
			String s=sc.next();
			if(n.equals(NewAccNum)&&s.equals(ifsc))
			{
				System.out.printf("%110s","Please wait! Your transaction is being processed");
				RBI.Process.loading();
				System.out.print("\nDear Customer! Your Current Account Balance is: ");
				return balance;
			}
			else
			{
				System.out.println("Please Check Your Account Number and IFSC code\n");	
			}
		}
	}
	public void loan()
	{	
		while(true)
		{
			System.out.println("Please Select Your Loan Type: \n----------------------------\nPress 1 for Personal Laon\nPress 2 for Car Loan\nPress 3 for Home Loan");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: Ploan();
					break;
				case 2: Cloan();
					break;
				case 3: Hloan();
					break;	
				default: System.out.println("Kidnly Please Check Your Option\n");
					break;
			}
		}
	}
	public void Ploan()
	{
		System.out.print("Please Enter Your CIBIL Score: ");
		int n=sc.nextInt();
		System.out.printf("%100s","Fetching Details and Eligibility");		
		RBI.Process.loading();
		System.out.println();
		if(n>=750&&n<=800)
		{
			System.out.println("Congratulations!! You're Eligible for Personal Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest               Tenure                 EMI     | ");
			System.out.println("|  10 Lakhs			      12% p.a			5years		      22,244/-   | ");	
			System.out.println("|  5 Lakhs			      14% p.a			5years		      11,634/-   | ");
			System.out.println("|  2 Lakhs			      16% p.a			5years		      4,864/-    | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);	
 		}
		else if(n>=800)
		{
			System.out.println("Congratulations!! You're Eligible for Personal Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest               Tenure                 EMI     | ");
			System.out.println("|  10 Lakhs			       9% p.a			5years		     20,758/-    | ");	
			System.out.println("|  5 Lakhs			      10% p.a			5years		     10,624/-    | ");
			System.out.println("|  2 Lakhs			      12% p.a			5years		     4,449/-     | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
		else
		{
			System.out.println("Your CIBIL Score "+n+"is Below 750");
			System.out.println("Sorry! You're not Eligible for Loan...Please Try Again! after somedays.\n-------------------------------------------------------------");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
	}
	public void Cloan()
	{
		System.out.print("Please Enter Your CIBIL Score: ");
		int n=sc.nextInt();
		System.out.printf("%100s","Fetching Details and Eligibility");		
		RBI.Process.loading();
		if(n>=750&&n<=800)
		{
			System.out.println("Congratulations!! You're Eligible for Personal Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest             Tenure                 EMI      | ");
			System.out.println("|  25 Lakhs			      10% p.a			10years		     33,038/-   | ");	
			System.out.println("|  20 Lakhs			      11% p.a			10years		     27,550/-   | ");
			System.out.println("|  10 Lakhs			      14% p.a			10years		     15,527/-   | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);	
 		}
		else if(n>=800)
		{
			System.out.println("Congratulations!! You're Eligible for Car Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest             Tenure                 EMI      | ");
			System.out.println("|  25 Lakhs			      7% p.a			10years		     23,027/-   | ");	
			System.out.println("|  20 Lakhs			      8% p.a			10years		     24,266/-   | ");
			System.out.println("|  10 Lakhs			      9% p.a			10years		     12,668/-   | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
		else
		{
			System.out.println("Your CIBIL Score "+n+" is Below 750");
			System.out.println("Sorry! You're not Eligible for Loan...Please Try Again! after somedays.\n-------------------------------------------------------------");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
	}
	public void Hloan()
	{
		System.out.print("Please Enter Your CIBIL Score: ");
		int n=sc.nextInt();
		System.out.printf("%100s","Fetching Details and Eligibility");		
		RBI.Process.loading();
		if(n>=750&&n<=800)
		{
			System.out.println("Congratulations!! You're Eligible for Home Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest              Tenure                 EMI     | ");
			System.out.println("|  50 Lakhs			      6% p.a			15years		     42,193/-   | ");	
			System.out.println("|  40 Lakhs			      7% p.a			15years		     35,953/-   | ");
			System.out.println("|  30 Lakhs			      8% p.a			15years		     28,670/-   | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);	
 		}
		else if(n>=800)
		{
			System.out.println("Congratulations!! You're Eligible for Personal Loan");
			System.out.println("Your Loan Elibility based on Your CIBIL Report\n");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("|  Loan Amount                 Rate of Interest              Tenure                  EMI    | ");
			System.out.println("|  80 Lakhs			      6% p.a			15years		     67,509/-   | ");	
			System.out.println("|  60 Lakhs			      6% p.a			15years		     50,631/-   | ");
			System.out.println("|  40 Lakhs			      7% p.a			15years		     35,953/-   | ");
			System.out.println("--------------------------------------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
		else
		{
			System.out.println("\nYour CIBIL Score "+n+"is Below 750");
			System.out.println("Sorry! You're not Eligible for Loan...Please Try Again! after somedays.\n-------------------------------------------------------------\n");
			System.out.printf("%100s","THANK YOU FOR CHOOSING KOTAK MAHINDRA BANK");
			System.out.println();
			System.out.printf("%100s","******************************************");
			System.exit(0);
		}
	}
}
	