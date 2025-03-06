package User;
import RBI.*;
import RBI.ICICI.*;
import RBI.AXIS.*;
import RBI.KOTAK.*;
import RBI.YES.*;
import RBI.SBI.*;
import java.util.*;
class User 
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.printf("%100s","Welcome To You");
		System.out.println();
		System.out.printf("%100s","*****************");
		System.out.printf("%160s","Please Select Your Bank");
		System.out.println();
		System.out.printf("%105s","************************");
		System.out.println("\n\nEnter 1 for ICICI Bank\nEnter 2 for AXIS Bank\nEnter 3 for KOTAK MAHINDRA BANK\nEnter 4 for YES BANK\nEnter 5 for SBI BANK");	
		int n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.printf("%100s","WELCOME TO ICICI BANK");
				System.out.println();
				System.out.printf("%100s","**********************");
				System.out.println();
				ICICIBank.icici.iciciBank();
				break;
			case 2: System.out.printf("%100s","WELCOME TO AXIS BANK");
				System.out.println();
				System.out.printf("%100s","**********************");
				System.out.println();
				AXISBank.axis.axisBank();
				break;
			case 3: System.out.printf("%100s","WELCOME TO KOTAK MAHINDRA BANK");
				System.out.println();
				System.out.printf("%100s","******************************");
				System.out.println();
				KOTAKBank.kotak.kotakBank();
				break;
			case 4: System.out.printf("%100s","WELCOME TO YES BANK");
				System.out.println();
				System.out.printf("%100s","*********************");
				System.out.println();
				YESBank.yes.yesBank();
				break;
			case 5: System.out.printf("%100s","WELCOME TO SBI BANK");
				System.out.println();
				System.out.printf("%100s","*******************");
				System.out.println();
				SBIBank.sbi.sbiBank();
				break;
			default: System.out.println("Invalid Option");
			
		}
	}

}