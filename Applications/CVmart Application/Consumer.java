import java.util.*;
class SignUp
{
	static Scanner sc=new Scanner(System.in);
	private String name=sc.next();
	private long mobnum=sc.nextLong();
	private String email=sc.next();
	private String password=sc.next();
	
	void setname(String name)
	{
		this.name=name;
	}
	void setnumber(long mobnum)
	{
		this.mobnum=mobnum;
	}
	void setemail(String email)
	{
		this.email=email;
	}
	void setpass(String password)
	{
		this.password=password;
	}
	String getname()
	{
		return name;
	}
	long getnumber()
	{
		return mobnum;
	}	
	String getemail()
	{
		return email;
	}	
	String getpass()
	{
		return password;
	}		
}
class style extends SignUp
{
	static int shirt=500,pant=600,wallet=200,tshirt=100,jeans=200,chudidhar=300;		
	static int milk=30,curd=30,oil=150,sugar=100;
	static int tmc=0,tcuc=0,toc=0,tsuc=0;

	static int tsc=0,tpc=0,twc=0,ttc=0,tjc=0,tcc=0;
	static void shirt()
	{
		System.out.println("Each Shirt Price is "+shirt);
		System.out.println("--------------------");
        	System.out.println("Enter number of shirts");
		int scount=sc.nextInt();
		tsc=tsc+scount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (Shirt, Pant, Wallets)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.men();
			break;
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();

			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n------------------------------------");
			System.exit(0);
		}
		}


	}
	static int calculation()
	{
		int total = (tsc*shirt)+(tpc*pant)+(twc*wallet)+(ttc*tshirt)+(tjc*jeans)+(tcc*chudidhar)+(tmc*milk)+(tcuc*curd)+(toc*oil)+(tsuc*sugar);
		return total;
	}
	static void billdetails()
	{
		System.out.println("Bill for "+tsc+" Shirts is = "+(tsc*shirt)+"\n"+"Bill for "+tpc+" Pants is = "+(tpc*pant)+"\n"+"Bill for "+twc+" Wallets is = "+(twc*wallet)+"\nBill for "+ttc+" T-shirts is = "+(ttc*tshirt)+"\n"+"Bill for "+tjc+" Jeans is = "+(tjc*jeans)+"\n"+"Bill for "+tcc+" Chudidhars is = "+(ttc*chudidhar)+"\n"+"Bill for "+tmc+" Litres of Milk is = "+(tmc*milk)+"\n"+"Bill for "+tcuc+" KG's of Curd is = "+(tcuc*curd)+"\n"+"Bill for "+toc+" Litres of Oil is = "+(toc*oil)+"\n"+"Bill for "+tsuc+" KG's of Sugar is = "+(tsuc*sugar));
	
	}
	
	static void pant()
	{
		System.out.println("Each Pant Price is "+pant);
		System.out.println("--------------------");
        	System.out.println("Enter number of Pants");
		int pcount=sc.nextInt();
		tpc=tpc+pcount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (Shirt, Pant, Wallets)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.men();
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n---------------------------------");
			System.exit(0);
		}
		}
	}
	static void wallet()
	{
		System.out.println("Each Wallet Price is "+wallet);
		System.out.println("--------------------");
        	System.out.println("Enter number of Wallets");
		int wcount=sc.nextInt();
		twc=twc+wcount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (Shirt, Pant, Wallets)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.men();
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n-----------------------------------");
			System.exit(0);
		}
		}
	}
	
	static void tshirt()
	{
		System.out.println("Each T-Shirt Price is "+tshirt);
		System.out.println("--------------------");
        	System.out.println("Enter number of T-shirts");
		int tscount=sc.nextInt();
		ttc=ttc+tscount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (T-Shirt, Jeans, Chudidhars)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.women();
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------");
			System.exit(0);
		}
		}


	}

	static void jeans()
	{
		System.out.println("Each Jeans Price is "+jeans);
		System.out.println("--------------------");
        	System.out.println("Enter number of Jeans");
		int tjcount=sc.nextInt();
		tjc=tjc+tjcount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (T-shirt, Jeans, Chudidhars)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.women();
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n-------------------------------------");
			System.exit(0);
		}
		}


	}
	static void chudidhars()
	{
		System.out.println("Each Chudidhar Price is "+chudidhar);
		System.out.println("--------------------");
        	System.out.println("Enter number of Chudidhars");
		int tccount=sc.nextInt();
		tcc=tcc+tccount;
		while(true)
		{
		System.out.print("Enter 1 to goback to cloth category (T-shirt, Jeans, Chudidhars)\nEnter 2 to go back to Gender Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.women();
		}
		else if(n==2)
		{
			Store.clothing();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------------");
			System.exit(0);
		}
		}


	}

	static void milk()
	{
		System.out.println("One litre Milk Price is "+chudidhar);
		System.out.println("--------------------");
        	System.out.println("Enter number of Litres");
		int mccount=sc.nextInt();
		tmc=tmc+mccount;
		while(true)
		{
		System.out.print("Enter 1 to goback to Diary category (Milk, Curd)\nEnter 2 to go back to Provisions(Diary,Grocery) Catagory\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.dairy();
		}
		else if(n==2)
		{
			Store.provisions();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------------");
			System.exit(0);
		}
		}


	}

	static void curd()
	{
		System.out.println("One KG Curd Price is "+curd);
		System.out.println("--------------------");
        	System.out.println("Enter number of KG's");
		int cccount=sc.nextInt();
		tcuc=tcuc+cccount;
		while(true)
		{
		System.out.print("Enter 1 to goback to Diary category (Milk, Curd)\nEnter 2 to go backto Provisions(Diary,Grocery)\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.dairy();
		}
		else if(n==2)
		{
			Store.provisions();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------------");
			System.exit(0);
		}
		}


	}

	static void oil()
	{
		System.out.println("One litre Oil Price is "+oil);
		System.out.println("--------------------");
        	System.out.println("Enter number of Litres");
		int ocount=sc.nextInt();
		toc=toc+ocount;
		while(true)
		{
		System.out.print("Enter 1 to goback to Grocery category (Oil, Sugar)\nEnter 2 to goback to Provisions(Diary,Grocery)\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.grocery();
		}
		else if(n==2)
		{
			Store.provisions();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------------");
			System.exit(0);
		}
		}


	}
	
	static void sugar()
	{
		System.out.println("One KG Sugar Price is "+sugar);
		System.out.println("--------------------");
        	System.out.println("Enter number of KG's");
		int sucount=sc.nextInt();
		tsuc=tsuc+sucount;
		while(true)
		{
		System.out.print("Enter 1 to goback to Grocery category (Oil, Sugar)\nEnter 2 to goback to Provisions(Diary,Grocery)\nEnter 3 for Main Shopping Menu\nEnter 4 to get final Bill and Exit\n-------------------------\n");
		int n=sc.nextInt();
		if(n==1)
		{
			Store.grocery();
		}
		else if(n==2)
		{
			Store.provisions();
			break;
		}
		else if(n==3)
		{
			Store.Shopping();
			break;
		}
		else if(n==4)
		{
			billdetails();
			System.out.println("------------------------------------------");
			System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
			
			System.out.println("Thank Your for Shopping with us\n----------------------------------------");
			System.exit(0);
		}
		}


	}
	
	
}
class Store extends style
{	
	
	
	static void Shopping()
	{	while(true)
		{
		System.out.println("Press 1 for Clothes section\nPress 2 for Provisions");
		System.out.println("----------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: clothing();
				break;
			case 2: provisions();
				break;
			default: System.out.println("Please check your selection");
				 System.out.println("---------------------------");

		}
		}
		
	
	}
	static void clothing()
	{
		while(true)
		{
		System.out.println("Press M for Men\nPress W for Women\nPress E for Final Bill & Exit Shopping");
		System.out.println("-----------------------");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'M': men();
				  break;
			case 'W' : women();
				  break;
			case 'E': System.out.println("------------------------------------------");
				style.billdetails();
				System.out.println("------------------------------------------");
				System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
				  System.exit(0);	 
			default: System.out.println("That's a Invalid Selection\nPlease select your Category\n--------------------------");
	
	

		}
		 System.out.println("Enter 1 Clother Category Men/Women\nEnter 2 for to get Main Menu Shopping ");
				  int n=sc.nextInt();
				  if(n==1)
				  {
					clothing();
					break;
				  }
				  else
				  {
					break;
				  }
					

		}
		
		
		
	}

	static void provisions()
	{
		while(true)
		{
		System.out.println("Press D for Dairy Products\nPress G for Groceries\nPress E for Final Bill & Exit Shopping");
		System.out.println("-----------------------");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'D': dairy();
				  break;
			case 'G' : grocery();
				  break;
			case 'E': System.out.println("------------------------------------------");
				style.billdetails();
				System.out.println("------------------------------------------");
				System.out.println("Total Purchased Bill is "+calculation()+"\n---------------------------\n");
				  System.exit(0);	 
			default: System.out.println("That's a Invalid Selection\nPlease select your Category\n--------------------------");
	
	

		}
		 System.out.println("Enter 1 Provisions Category Dairy/Grocery\nEnter 2 for to get Main Menu Shopping ");
				  int n=sc.nextInt();
				  if(n==1)
				  {
					provisions();
					break;
				  }
				  else
				  {
					break;
				  }
					

		}
		
		
		
	}
	static void men()
	{
		while(true)
		{
		System.out.println("Shirt Price - 500/- for each piece\nPant Price - 600/- for each piece\nWallet Price - 200/- for each piece");
		System.out.println("Enter 1 to buy Shirts\nEnter 2 to buy Pants\nEnter 3 to buy Wallets\nEnter 4 for Final Bill & Exit Shopping");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: style.shirt();		
				break;
			case 2: style.pant();
				break;
			case 3: style.wallet();
				break;
			case 4: style.billdetails();	
				System.out.println("Total Purchased Bill is "+style.calculation()+"\n---------------------------\n");
				System.out.println("Thank you for Visiting Us");
				System.exit(0);
			default:System.out.println("That's a Invalid Selection\nPlease select your style\n--------------------------\n");
				
		}
		}
				  
	}
	
	static void women()
	{
		
		while(true)
		{
		System.out.println("T-shirt Price - 100/- for each piece\nJeans Price - 200/- for each piece\nChudidhar Price - 300/- for each piece");
		System.out.println("Enter 1 to buy T-Shirts\nEnter 2 to buy Jeans\nEnter 3 to buy Chudidhars\nEnter 4 for Final Bill & exit Shopping");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: style.tshirt();		
				break;
			case 2: style.jeans();
				break;
			case 3: style.chudidhars();
				break;
			case 4: style.billdetails();	
				System.out.println("Total Purchased Bill is "+style.calculation()+"\n---------------------------\n");
				System.out.println("Thank you for Visiting Us");
				System.exit(0);
			default:System.out.println("That's a Invalid Selection\nPlease select your style\n--------------------------\n");
				
		}
		}
				  
	}
	
	static void dairy()
	{
		while(true)
		{
		System.out.println("Milk Price - 30/- per Litre\nCurd Price - 30/- per Kg");
		System.out.println("Enter 1 to buy Milk\nEnter 2 to buy Curd\nEnter 3 for Final Bill & Exit Shopping");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: style.milk();		
				break;
			case 2: style.curd();
				break;
			case 3: style.billdetails();	
				System.out.println("Total Purchased Bill is "+style.calculation()+"\n---------------------------\n");
				System.out.println("Thank you for Visiting Us");
				System.exit(0);
			default:System.out.println("That's a Invalid Selection\nPlease select your style\n--------------------------\n");
				
		}
		}
				  
	}

	static void grocery()
	{
		while(true)
		{
		System.out.println("Cooking Oil Price - 150/- per Litre\nSugar Price - 100/- per Kg");
		System.out.println("Enter 1 to buy Cooking\nEnter 2 to buy Sugar\nEnter 3 for Final Bill & Exit Shopping");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: style.oil();		
				break;
			case 2: style.sugar();
				break;
			case 3: style.billdetails();	
				System.out.println("Total Purchased Bill is "+style.calculation()+"\n---------------------------\n");
				System.out.println("Thank you for Visiting Us");
				System.exit(0);
			default:System.out.println("That's a Invalid Selection\nPlease select your style\n--------------------------\n");
				
		}
		}
				  
	}
	
	
}
class Consumer extends Store
{
	static{
		System.out.println("<---WELCOME TO CV~MART--->");
		System.out.println("Enter Your Following Details to Create Account in CVMart Shoppe\nName\nMobile Number\nEmail-ID\nPassword");
		System.out.println("--------------------------------------------");
	      }
		static Consumer c=new Consumer();
		static boolean checkemailsuccess(String e)
		{
			
			if(e.equals(c.getemail()))
			{
			return true;
			}
		return false;
		}
		
		static boolean checkpasssuccess(String p)
		{
			
			if(p.equals(c.getpass()))
			{
			return true;
			}
		return false;
		}
	public static void main(String args[])
	{
		
	    	System.out.println("Your Registration is Successfull");
		System.out.println("----------------------------------");
		System.out.println("Enter your Email to Login");
		while(true)
		{
			String e=sc.next();
		
			if(checkemailsuccess(e))
			{
				System.out.println("Please Enter your password");
				String p=sc.next();
				if(checkpasssuccess(p))
				{
					Store.Shopping();
				}
				else
				{
					System.out.println("Please check your Password");
					if(!p.equals(c.getpass()))
					{
						System.out.println("Enter Your new password to reset");
						String pr=sc.next();
						c.setpass(pr);
						System.out.println("password updated Successfully!!\nYour New password is: "+c.getpass());
						System.out.println("Please enter Your Email address and password to login");
					}
				}
			
			}
			else
			{
				System.out.println("Please check your Email Address");
				if(!e.equals(c.getemail()))
				{
					System.out.println("Enter Your new email to reset");
					String er=sc.next();
					c.setemail(er);
					System.out.println("Email updated Successfully!!\nYour New UserId is: "+c.getemail());
					System.out.println("Please enter Your Email address to login");
				}
			
			}
		 }
		
		
	}
}
