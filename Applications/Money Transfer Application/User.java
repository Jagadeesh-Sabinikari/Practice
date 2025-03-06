import java.util.*;
class Bank
{	
	static Scanner sc=new Scanner(System.in);
     	long accountNum=12356;
	int atmPin=sc.nextInt();
	//int userid=sc.next
	//String Password=sc.next();
	//long phonenum=sc.nextLong();
	int balance=20000;
}
class Phonepe extends Bank
{	
	String transfer(long phonenum)
	{	
		System.out.println("Enter the transfer amount");
		int num1=sc.nextInt();
		balance=balance-num1;
		return "Transfer Successful!\nYour Current Account Balance= "+balance;
	} 
}
class ATM extends Bank
{	
	String transfer(long accountNum,int atmPin)
	{	
		System.out.println("Enter the amount");
		int num2=sc.nextInt();
		balance=balance+num2;
		return "Deposit Successful!\nYour Current Account Balance= "+balance;
	} 
}
class NetBanking extends Bank
{	
	String transfer(int userid,String password)
	{	
		System.out.println("Enter the transfer amount");
		int num3=sc.nextInt();
		balance=balance-num3;
		return "Transfer Successful!\nYour Current Account Balance= "+balance;
	} 
}
class User 

{
	public static void main(String []args)
	{
		System.out.println("Please select your Transfer option");
		System.out.println("Press 1 for Phonepe \nPress 2 for ATM \nPress 3 for Net Banking");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.println("Enter Receiver Mobile Number");
				  System.out.println(new Phonepe().transfer(sc.nextLong()));
				  break;	
			case 2: System.out.println("Enter Your Account Number and ATM pin"); 
				  System.out.println(new ATM().transfer(sc.nextLong(),sc.nextInt()));
				  break;
			case 3: System.out.println("Enter Your User-ID and Password"); 
				  System.out.println(new NetBanking().transfer(sc.nextInt(),sc.next()));
				  break;
			default: System.out.println("Sorry! Please choose correct Option");
		}
	}

}