
import java.util.*;
interface mehfil
{
	int cb=249,c65b=299,mb=349,smb=399,pb=199,vb=189,mshb=249,cc=199,pc=179,amc=129,c65=149,cl=159,cmj=199,rr=25,br=49,tr=35,dt=20,ds=25,dm=30,dmd=35;
	
}
interface paradise
{
	int cb=299,c65b=345,mb=399,smb=449,pb=219,vb=199,mshb=269,cc=249,pc=199,amc=149,c65=199,cl=199,cmj=220,rr=30,br=60,tr=50,dt=20,ds=25,dm=30,dmd=35;
}
interface bawarchi
{
	int cb=279,c65b=329,mb=330,smb=359,pb=179,vb=159,mshb=249,cc=180,pc=160,amc=140,c65=180,cl=190,cmj=210,rr=20,br=35,tr=45,dt=20,ds=25,dm=30,dmd=35;
}
class Random implements mehfil
{
	static int random()
	{
		int min=100000;
		int max=999999;
		int range = (max-min)+1;
		int random=(int)(Math.random()*range)+min;
		return random;
	}
}
class Payment extends Random
{
	static Scanner sc=new Scanner(System.in);	
	static void payment()
	{
		System.out.println("\nSelect Your Payment Mode\n");
		System.out.printf("%90s","-*Offers of the Day!!!*-"+"\n");
		System.out.printf("%110s","Get Flat 500Rs Cashback using PhonePe on order above 2000Rs"+"\n");
		System.out.printf("%110s","Get Flat 300Rs Cashback using Gpay on order above 1500Rs"+"\n");
		System.out.printf("%110s","Get Flat 250Rs Cashback using Mobikwik on order above 1500Rs"+"\n");
		System.out.printf("%120s","Get Instant 30% discount using Rupay Debit/Credit Cards on order above 2000Rs"+"\n");
		System.out.println("Enter P for PhonePe\nEnter G for Gpay\nEnter M for Mobikwik\nEnter D for Debit/Credit Transaction\n--------------------------------");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'P': phonepe();
					  break;
			case 'G': gpay();
					  break;
			case 'M': mobikwik();
					  break;
			case 'D': debit();
					  break;
			default: System.out.println("Hey! That's an Invalid Choice..Please Check your Payment Mode and Try Again");
					Payment.payment();
					break;
		}
    }
	static int limit=3;
	static void phonepe()
	{
		System.out.println("Please enter your PhonePe linked Mobile Number.\n");
		long num=sc.nextLong();
		while(limit>0)
		{
			int otp=Random.random();
			System.out.println("Your 6 Digit OTP is: "+otp);
			System.out.println("Enter 6 digit OTP sent on Your Mobile Number\n-------------------------------------------------\n");
			int n=sc.nextInt();
			if(n==otp)
			{
				System.out.println("OTP Verification Successfull\n--------------------------------");
				if(Billing.Mtotalbill()>=2000||Billing.Ptotalbill()>=2000||Billing.Btotalbill()>=2000)
				{
					System.out.println("Congratulations!! You're eligible for 500Rs Cashback");
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi=sc.nextInt();
					System.out.println("Your payment is Successfull and cashback will be processed into your wallet in next 24 hours\n");
					System.out.println("-------------------------------------------\nHey! Your Order has been Placed Successfully.\nThank You for Ordering from Us.\n----------------------------------------------");
					System.exit(0);
				}
				else
				{
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi2=sc.nextInt();
					System.out.println("Your payment is Successfull.");
					System.out.println("\n--------------------------------------------\nYour Order has been Placed Successfully.\nThank You for Ordering from Us.\n---------------------------------------------");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Incorrect OTP.\nPlease Try Again!\n");
				while(true)
				{
					System.out.println("Press 1 to resend OTP\nEnter 2 to Change Payment Mode");
					int rotp=sc.nextInt();
				
					if(rotp==1)
					{
						limit--;
						System.out.println("You've "+limit+" attempts left for the Day.\n");
						break;
					}
					else if(rotp==2)
					{
						Payment.payment();
					}
					else
					{
						System.out.println("Please check your Input!");
						break;
					}
				}
		
			}
		}
		System.out.println("Sorry! You're Exceeded with OTP Limit.\nYour Account has been blocked for 24 Hours.");
		System.exit(0);
		
	}
	
	static void gpay()
	{
		System.out.println("Please enter your Gpay linked Mobile Number.\n");
		long num=sc.nextLong();
		while(limit>0)
		{
			int otp=Random.random();
			System.out.println("Your 6 Digit OTP is: "+otp);
			System.out.println("Enter 6 digit OTP sent on Your Mobile Number\n-------------------------------------------------\n");
			int n=sc.nextInt();
			if(n==otp)
			{
				System.out.println("OTP Verification Successfull\n--------------------------------");
				if(Billing.Mtotalbill()>=1500||Billing.Ptotalbill()>=1500||Billing.Btotalbill()>=1500)
				{
					System.out.println("Congratulations!! You're eligible for 300Rs Cashback");
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi=sc.nextInt();
					System.out.println("Your payment is Successfull and cashback will be processed into your wallet in next 24 hours\n");
					System.out.println("-------------------------------------------\nHey! Your Order has been Placed Successfully.\nThank You for Ordering from Us.\n----------------------------------------------");
					System.exit(0);
				}
				else
				{
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi2=sc.nextInt();
					System.out.println("Your payment is Successfull.");
					System.out.println("\n--------------------------------------------\nYour Order has been Placed Successfully.\nThank You for Ordering from Us.\n---------------------------------------------");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Incorrect OTP.\nPlease Try Again!\n");
				while(true)
				{
					System.out.println("Press 1 to resend OTP\nEnter 2 to Change Payment Mode");
					int rotp=sc.nextInt();
				
					if(rotp==1)
					{
						limit--;
						System.out.println("You've "+limit+" attempts left for the Day.\n");
						break;
					}
					else if(rotp==2)
					{
						Payment.payment();
					}
					else
					{
						System.out.println("Please check your Input!");
						break;
					}
				}
		
			}
		}
		System.out.println("Sorry! You're Exceeded with OTP Limit.\nYour Account has been blocked for 24 Hours.");
		System.exit(0);
		
	}
	
	static void mobikwik()
	{
		System.out.println("Please enter your Mobikwik linked Mobile Number.\n");
		long num=sc.nextLong();
		while(limit>0)
		{
			int otp=Random.random();
			System.out.println("Your 6 Digit OTP is: "+otp);
			System.out.println("Enter 6 digit OTP sent on Your Mobile Number\n-------------------------------------------------\n");
			int n=sc.nextInt();
			if(n==otp)
			{
				System.out.println("OTP Verification Successfull\n--------------------------------");
				if(Billing.Mtotalbill()>=1500||Billing.Ptotalbill()>=1500||Billing.Btotalbill()>=1500)
				{
					System.out.println("Congratulations!! You're eligible for 250Rs Cashback");
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi=sc.nextInt();
					System.out.println("Your payment is Successfull and cashback will be processed into your wallet in next 24 hours\n");
					System.out.println("-------------------------------------------\nHey! Your Order has been Placed Successfully.\nThank You for Ordering from Us.\n----------------------------------------------");
					System.exit(0);
				}
				else
				{
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi2=sc.nextInt();
					System.out.println("Your payment is Successfull.");
					System.out.println("\n--------------------------------------------\nYour Order has been Placed Successfully.\nThank You for Ordering from Us.\n---------------------------------------------");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Incorrect OTP.\nPlease Try Again!\n");
				while(true)
				{
					System.out.println("Press 1 to resend OTP\nEnter 2 to Change Payment Mode");
					int rotp=sc.nextInt();
				
					if(rotp==1)
					{
						limit--;
						System.out.println("You've "+limit+" attempts left for the Day.\n");
						break;
					}
					else if(rotp==2)
					{
						Payment.payment();
					}
					else
					{
						System.out.println("Please check your Input!");
						break;
					}
				}
		
			}
		}
		System.out.println("Sorry! You're Exceeded with OTP Limit.\nYour Account has been blocked for 24 Hours.");
		System.exit(0);
		
	}
	
	static void debit()
	{
		System.out.println("Please enter your Debit or Credit Card Number.\n");
		long num=sc.nextLong();
		if(Billing.Mtotalbill()>=2000)
		{
			float mdisc=Billing.Mtotalbill();
			float fmtotalbill=mdisc-((float)30/100)*mdisc;
			System.out.println("Your Total Mehfil Bill after Discount: "+fmtotalbill);
		}
		else if(Billing.Ptotalbill()>=2000)
		{
			float pdisc=Billing.Ptotalbill();
			float fptotalbill=pdisc-((float)30/100)*pdisc;
			System.out.println("Your Total Paradise Bill after Discount: "+fptotalbill);
		}
		else if(Billing.Btotalbill()>=2000)
		{
			float bdisc=Billing.Btotalbill();
			float fbtotalbill=bdisc-((float)30/100)*bdisc;
			System.out.println("Your Total Bawarchi Bill after Discount: "+fbtotalbill);
		}
		
		while(limit>0)
		{
			int otp=Random.random();
			System.out.println("Your 6 Digit OTP is: "+otp);
			System.out.println("Enter 6 digit OTP sent on Your Mobile Number\n-------------------------------------------------\n");
			int n=sc.nextInt();
			if(n==otp)
			{
				System.out.println("OTP Verification Successfull\n--------------------------------");
				if(Billing.Mtotalbill()<=2000||Billing.Ptotalbill()<=2000||Billing.Btotalbill()<=2000)
				{
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi2=sc.nextInt();
					System.out.println("Your payment is Successfull.");
					System.out.println("\n--------------------------------------------\nYour Order has been Placed Successfully.\nThank You for Ordering from Us.\n---------------------------------------------");
					System.exit(0);
				}
				else
				{
					
					System.out.println("Please enter your 4 digit UPI pin to Complete the Transaction.");
					int upi=sc.nextInt();
					System.out.println("Your payment is Successfull.\n");
					System.out.println("-------------------------------------------\nHey! Your Order has been Placed Successfully.\nThank You for Ordering from Us.\n----------------------------------------------");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Incorrect OTP.\nPlease Try Again!\n");
				while(true)
				{
					System.out.println("Press 1 to resend OTP\nEnter 2 to Change Payment Mode");
					int rotp=sc.nextInt();
				
					if(rotp==1)
					{
						limit--;
						System.out.println("You've "+limit+" attempts left for the Day.\n");
						break;
					}
					else if(rotp==2)
					{
						Payment.payment();
					}
					else
					{
						System.out.println("Please check your Input!");
						break;
					}
				}
		
			}
		}
		System.out.println("Sorry! You're Exceeded with OTP Limit.\nYour Account has been blocked for 24 Hours.");
		System.exit(0);
		
	}
}

class Billing extends Payment
{
	static int tcb=0,tc65b=0,tmb=0,tsmb=0,tpb=0,tvb=0,tmshb=0,tcc=0,tpc=0,tamc=0,tc65=0,tcl=0,tcmj=0,trr=0,tbr=0,ttr=0,tdt=0,tds=0,tdm=0,tdmd=0;
	static int ctrl=0;
	static void Mbill()
	{
		System.out.println("Your Complete Bill Details: \n--------------------------------------------------------------------");
			System.out.println("   ITEMS                "+"QUANTITY           "+"COUNT           "+"TOTAL    ");
		if(tpb!=0)
			System.out.println("Panner Biryani             "+tpb+"               "+tpb+" * "+ mehfil.pb+"           "+(tpb* mehfil.pb));				  
		if(tvb!=0)
			System.out.println("Vegetable Biryani          "+tvb+"               "+tvb+" * "+ mehfil.vb+"           "+(tvb* mehfil.vb));
		if(tmshb!=0)
			System.out.println("Mushroom Biryani           "+tmshb+"             "+tmshb+" * "+ mehfil.mshb+"       "+(tmshb* mehfil.mshb));
		if(tcb!=0)
			System.out.println("Chicken Biryani            "+tcb+"               "+tcb+" * "+ mehfil.cb+"           "+(tcb* mehfil.cb));
		if(tc65b!=0)
			System.out.println("Chicken 65 Biryani         "+tc65b+"             "+tc65b+" * "+ mehfil.c65b+"       "+(tc65b* mehfil.c65b));
		if(tmb!=0)
			System.out.println("Mutton Biryani             "+tmb+"               "+tmb+" * "+ mehfil.mb+"           "+(tmb* mehfil.mb));
		if(tsmb!=0)
			System.out.println("Special Mutton Biryani     "+tsmb+"              "+tsmb+" * "+ mehfil.smb+"         "+(tsmb* mehfil.smb));
		if(tc65!=0)
			System.out.println("Chicken-65                 "+tc65+"              "+tc65+" * "+ mehfil.c65+"         "+(tc65* mehfil.c65));
		if(tcl!=0)
			System.out.println("Chicken-Lollipops          "+tcl+"               "+tcl+" * "+ mehfil.cl+"           "+(tcl* mehfil.cl));
		if(tcmj!=0)
			System.out.println("Chicken-Majestic          "+tcmj+"               "+tcmj+" * "+ mehfil.cmj+"         "+(tcmj* mehfil.cmj));
		if(tcc!=0)
			System.out.println("Chicken-Curry             "+tcc+"                "+tcc+" * "+ mehfil.cc+"           "+(tcc* mehfil.cc));
		if(tpc!=0)
			System.out.println("Panner Curry              "+tpc+"                "+tpc+" * "+ mehfil.pc+"           "+(tpc* mehfil.pc));
		if(tamc!=0)
			System.out.println("Aloo Masala Curry         "+tamc+"               "+tamc+" * "+ mehfil.amc+"         "+(tamc* mehfil.amc));
		if(tdt!=0)
			System.out.println("Thump-Up                  "+tdt+"                "+tdt+" * "+ mehfil.dt+"           "+(tdt* mehfil.dt));
		if(tds!=0)
			System.out.println("Sprite                    "+tds+"                "+tds+" * "+ mehfil.ds+"           "+(tds* mehfil.ds));
		if(tdm!=0)
			System.out.println("Maaza                     "+tdm+"                "+tdm+" * "+ mehfil.dm+"           "+(tdm* mehfil.dm));
		if(tdmd!=0)
			System.out.println("Mountain-dew              "+tdmd+"               "+tdmd+" * "+ mehfil.dmd+"         "+(tdmd* mehfil.dmd));
		if(trr!=0)
			System.out.println("Rumali Roti               "+trr+"                "+trr+" * "+ mehfil.rr+"           "+(trr* mehfil.rr));
		if(tbr!=0)
			System.out.println("Butter Roti              "+tbr+"                 "+tbr+" * "+ mehfil.br+"           "+(tbr* mehfil.br));
		if(ttr!=0)
		{
			System.out.println("Tandoori Roti            "+ttr+"                 "+ttr+" * "+ mehfil.tr+"           "+(ttr* mehfil.tr));
		}
		System.out.println("----------------------------------------------------------------");
	}
	
	static void Pbill()
	{
		System.out.println("Your Complete Bill Details: \n--------------------------------------------------------------------");
			System.out.println("   ITEMS                "+"QUANTITY           "+"COUNT           "+"TOTAL    ");
		if(tpb!=0)
			System.out.println("Panner Biryani             "+tpb+"               "+tpb+" * "+ paradise.pb+"           "+(tpb* paradise.pb));				  
		if(tvb!=0)
			System.out.println("Vegetable Biryani          "+tvb+"               "+tvb+" * "+ paradise.vb+"           "+(tvb* paradise.vb));
		if(tmshb!=0)
			System.out.println("Mushroom Biryani           "+tmshb+"             "+tmshb+" * "+ paradise.mshb+"       "+(tmshb* paradise.mshb));
		if(tcb!=0)
			System.out.println("Chicken Biryani            "+tcb+"               "+tcb+" * "+ paradise.cb+"           "+(tcb* paradise.cb));
		if(tc65b!=0)
			System.out.println("Chicken 65 Biryani         "+tc65b+"             "+tc65b+" * "+ paradise.c65b+"       "+(tc65b* paradise.c65b));
		if(tmb!=0)
			System.out.println("Mutton Biryani             "+tmb+"               "+tmb+" * "+ paradise.mb+"           "+(tmb* paradise.mb));
		if(tsmb!=0)
			System.out.println("Special Mutton Biryani     "+tsmb+"              "+tsmb+" * "+ paradise.smb+"         "+(tsmb* paradise.smb));
		if(tc65!=0)
			System.out.println("Chicken-65                 "+tc65+"              "+tc65+" * "+ paradise.c65+"         "+(tc65* paradise.c65));
		if(tcl!=0)
			System.out.println("Chicken-Lollipops          "+tcl+"               "+tcl+" * "+ paradise.cl+"           "+(tcl* paradise.cl));
		if(tcmj!=0)
			System.out.println("Chicken-Majestic          "+tcmj+"               "+tcmj+" * "+ paradise.cmj+"         "+(tcmj* paradise.cmj));
		if(tcc!=0)
			System.out.println("Chicken-Curry             "+tcc+"                "+tcc+" * "+ paradise.cc+"           "+(tcc* paradise.cc));
		if(tpc!=0)
			System.out.println("Panner Curry              "+tpc+"                "+tpc+" * "+ paradise.pc+"           "+(tpc* paradise.pc));
		if(tamc!=0)
			System.out.println("Aloo Masala Curry         "+tamc+"               "+tamc+" * "+ paradise.amc+"         "+(tamc* paradise.amc));
		if(tdt!=0)
			System.out.println("Thump-Up                  "+tdt+"                "+tdt+" * "+ paradise.dt+"           "+(tdt* paradise.dt));
		if(tds!=0)
			System.out.println("Sprite                    "+tds+"                "+tds+" * "+ paradise.ds+"           "+(tds* paradise.ds));
		if(tdm!=0)
			System.out.println("Maaza                     "+tdm+"                "+tdm+" * "+ paradise.dm+"           "+(tdm* paradise.dm));
		if(tdmd!=0)
			System.out.println("Mountain-dew              "+tdmd+"               "+tdmd+" * "+ paradise.dmd+"         "+(tdmd* paradise.dmd));
		if(trr!=0)
			System.out.println("Rumali Roti               "+trr+"                "+trr+" * "+ paradise.rr+"           "+(trr* paradise.rr));
		if(tbr!=0)
			System.out.println("Butter Roti              "+tbr+"                 "+tbr+" * "+ paradise.br+"           "+(tbr* paradise.br));
		if(ttr!=0)
		{
			System.out.println("Tandoori Roti            "+ttr+"                 "+ttr+" * "+ paradise.tr+"           "+(ttr* paradise.tr));
		}
		System.out.println("----------------------------------------------------------------");
	}

	static void Bbill()
	{
		System.out.println("Your Complete Bill Details: \n--------------------------------------------------------------------");
			System.out.println("   ITEMS                "+"QUANTITY           "+"COUNT           "+"TOTAL    ");
		if(tpb!=0)
			System.out.println("Panner Biryani             "+tpb+"               "+tpb+" * "+ bawarchi.pb+"           "+(tpb* bawarchi.pb));				  
		if(tvb!=0)
			System.out.println("Vegetable Biryani          "+tvb+"               "+tvb+" * "+ bawarchi.vb+"           "+(tvb* bawarchi.vb));
		if(tmshb!=0)
			System.out.println("Mushroom Biryani           "+tmshb+"             "+tmshb+" * "+ bawarchi.mshb+"       "+(tmshb* bawarchi.mshb));
		if(tcb!=0)
			System.out.println("Chicken Biryani            "+tcb+"               "+tcb+" * "+ bawarchi.cb+"           "+(tcb* bawarchi.cb));
		if(tc65b!=0)
			System.out.println("Chicken 65 Biryani         "+tc65b+"             "+tc65b+" * "+ bawarchi.c65b+"       "+(tc65b* bawarchi.c65b));
		if(tmb!=0)
			System.out.println("Mutton Biryani             "+tmb+"               "+tmb+" * "+ bawarchi.mb+"           "+(tmb* bawarchi.mb));
		if(tsmb!=0)
			System.out.println("Special Mutton Biryani     "+tsmb+"              "+tsmb+" * "+ bawarchi.smb+"         "+(tsmb* bawarchi.smb));
		if(tc65!=0)
			System.out.println("Chicken-65                 "+tc65+"              "+tc65+" * "+ bawarchi.c65+"         "+(tc65* bawarchi.c65));
		if(tcl!=0)
			System.out.println("Chicken-Lollipops          "+tcl+"               "+tcl+" * "+ bawarchi.cl+"           "+(tcl* bawarchi.cl));
		if(tcmj!=0)
			System.out.println("Chicken-Majestic          "+tcmj+"               "+tcmj+" * "+ bawarchi.cmj+"         "+(tcmj* bawarchi.cmj));
		if(tcc!=0)
			System.out.println("Chicken-Curry             "+tcc+"                "+tcc+" * "+ bawarchi.cc+"           "+(tcc* bawarchi.cc));
		if(tpc!=0)
			System.out.println("Panner Curry              "+tpc+"                "+tpc+" * "+ bawarchi.pc+"           "+(tpc* bawarchi.pc));
		if(tamc!=0)
			System.out.println("Aloo Masala Curry         "+tamc+"               "+tamc+" * "+ bawarchi.amc+"         "+(tamc* bawarchi.amc));
		if(tdt!=0)
			System.out.println("Thump-Up                  "+tdt+"                "+tdt+" * "+ bawarchi.dt+"           "+(tdt* bawarchi.dt));
		if(tds!=0)
			System.out.println("Sprite                    "+tds+"                "+tds+" * "+ bawarchi.ds+"           "+(tds* bawarchi.ds));
		if(tdm!=0)
			System.out.println("Maaza                     "+tdm+"                "+tdm+" * "+ bawarchi.dm+"           "+(tdm* bawarchi.dm));
		if(tdmd!=0)
			System.out.println("Mountain-dew              "+tdmd+"               "+tdmd+" * "+ bawarchi.dmd+"         "+(tdmd* bawarchi.dmd));
		if(trr!=0)
			System.out.println("Rumali Roti               "+trr+"                "+trr+" * "+ bawarchi.rr+"           "+(trr* bawarchi.rr));
		if(tbr!=0)
			System.out.println("Butter Roti              "+tbr+"                 "+tbr+" * "+ bawarchi.br+"           "+(tbr* bawarchi.br));
		if(ttr!=0)
		{
			System.out.println("Tandoori Roti            "+ttr+"                 "+ttr+" * "+ bawarchi.tr+"           "+(ttr* bawarchi.tr));
		}
		System.out.println("----------------------------------------------------------------");
	}
	
		static float Mtotalbill()
		{
			float total = (tpb*mehfil.pb)+(tvb*mehfil.vb)+(tmshb*mehfil.mshb)+(tcb*mehfil.cb)+(tc65b*mehfil.c65b)+(tmb*mehfil.mb)+(tsmb*mehfil.smb)+(tcc*mehfil.cc)+(tpc*mehfil.pc)+(tamc*mehfil.amc)+(tc65*mehfil.c65)+(tcl*mehfil.cl)+(tcmj*mehfil.cmj)+(trr*mehfil.rr)+(tbr*mehfil.br)+(ttr*mehfil.tr)+(tdt*mehfil.dt)+(tds*mehfil.ds)+(tdm*mehfil.dm)+(tdmd*mehfil.dmd);
			if(total>=2000)
			{
				if(ctrl==0)
				{
					System.out.println("Dear Customer! 8% GST is added to bill as order Value is above 2000\n");
					ctrl++;
				}
				float ftotal=total+((float)8/100)*total;
				return ftotal;
			}
			else
			{
				return total;
			}		
		}
		
		static float Ptotalbill()
		{
			float total = (tpb*paradise.pb)+(tvb*paradise.vb)+(tmshb*paradise.mshb)+(tcb*paradise.cb)+(tc65b*paradise.c65b)+(tmb*paradise.mb)+(tsmb*paradise.smb)+(tcc*paradise.cc)+(tpc*paradise.pc)+(tamc*paradise.amc)+(tc65*paradise.c65)+(tcl*paradise.cl)+(tcmj*paradise.cmj)+(trr*paradise.rr)+(tbr*paradise.br)+(ttr*paradise.tr)+(tdt*paradise.dt)+(tds*paradise.ds)+(tdm*paradise.dm)+(tdmd*paradise.dmd);
			if(total>=2000)
			{
				if(ctrl==0)
				{
					System.out.println("Dear Customer! 8% GST is added to bill as order Value is above 2000\n");
					ctrl++;
				}
				float ftotal=total+((float)8/100)*total;
				return ftotal;
			}
			else
			{
				return total;
			}		
		}
		
		static float Btotalbill()
		{
			float total = (tpb*bawarchi.pb)+(tvb*bawarchi.vb)+(tmshb*bawarchi.mshb)+(tcb*bawarchi.cb)+(tc65b*bawarchi.c65b)+(tmb*bawarchi.mb)+(tsmb*bawarchi.smb)+(tcc*bawarchi.cc)+(tpc*bawarchi.pc)+(tamc*bawarchi.amc)+(tc65*bawarchi.c65)+(tcl*bawarchi.cl)+(tcmj*bawarchi.cmj)+(trr*bawarchi.rr)+(tbr*bawarchi.br)+(ttr*bawarchi.tr)+(tdt*bawarchi.dt)+(tds*bawarchi.ds)+(tdm*bawarchi.dm)+(tdmd*bawarchi.dmd);
			if(total>=2000)
			{
				if(ctrl==0)
				{
					System.out.println("Dear Customer! 8% GST is added to bill as order Value is above 2000\n");
					ctrl++;
				}
				float ftotal=total+((float)8/100)*total;
				return ftotal;
			}
			else
			{
				return total;
			}		
		}
}
class items extends Billing
{
	static Scanner sc=new Scanner(System.in);
	
	static int pb()
	{
		System.out.println("Enter your Paneer biryani Quantity");
		int n=sc.nextInt();
		tpb=tpb+n;
		return tpb;
		
	}
	static int vb()
	{
		System.out.println("Enter your Vegetable biryani Quantity");
		int n=sc.nextInt();
		tvb=tvb+n;
		return tvb;
	}
	
	static int mshb()
	{
		System.out.println("Enter your Mushroom biryani Quantity");
		int n=sc.nextInt();
		tmshb=tmshb+n;
		return tmshb;
	}
	static int cb()
	{
		System.out.println("Enter your Chicken Biryani Quantity");
		int n=sc.nextInt();
		tcb=tcb+n;
		return tcb;
	}
	static int c65b()
	{
		System.out.println("Enter your Chickem-65 Biryani Quantity");
		int n=sc.nextInt();
		tc65b=tc65b+n;
		return tc65b;
	}
	static int mb()
	{
		System.out.println("Enter your Mutton Biryani Quantity");
		int n=sc.nextInt();
		tmb=tmb+n;
		return tmb;
	}
	static int smb()
	{
		System.out.println("Enter your Special Mutton Quantity");
		int n=sc.nextInt();
		tsmb=tsmb+n;
		return tsmb;
	}
	static int c65()
	{
		System.out.println("Enter your Chicken-65 Quantity");
		int n=sc.nextInt();
		tc65=tc65+n;
		return tc65;
	}
	static int cl()
	{
		System.out.println("Enter your Chicken Lollipops Quantity");
		int n=sc.nextInt();
		tcl=tcl+n;
		return tcl;
	}
	static int cmj()
	{
		System.out.println("Enter your Chicken Majestic Quantity");
		int n=sc.nextInt();
		tcmj=tcmj+n;
		return tcmj;
	}
	static int cc()
	{
		System.out.println("Enter your Chicken Curry Quantity");
		int n=sc.nextInt();
		tcc=tcc+n;
		return tcc;
	}
	static int pc()
	{
		System.out.println("Enter your Paneer Curry Quantity");
		int n=sc.nextInt();
		tpc=tpc+n;
		return tpc;
	}
	static int amc()
	{
		System.out.println("Enter your Aloo Masala Curry Quantity");
		int n=sc.nextInt();
		tamc=tamc+n;
		return tamc;
	}
	static int dt()
	{
		System.out.println("Enter No.of Thump-Up Bottles Quantity");
		int n=sc.nextInt();
		tdt=tdt+n;
		return tdt;
	}
	static int ds()
	{
		System.out.println("Enter No.of Sprite Bottles Quantity");
		int n=sc.nextInt();
		tds=tds+n;
		return tds;
	}
	static int dm()
	{
		System.out.println("Enter No.of Maaza Bottles Quantity");
		int n=sc.nextInt();
		tdm=tdm+n;
		return tdm;
	}
	static int dmd()
	{
		System.out.println("Enter No.of Mountain-dew Bottles Quantity");
		int n=sc.nextInt();
		tdmd=tdmd+n;
		return tdmd;
	}
	static int rr()
	{
		System.out.println("Enter your Rumali Roti Quantity");
		int n=sc.nextInt();
		trr=trr+n;
		return trr;
	}
	static int br()
	{
		System.out.println("Enter your Butter Roti Quantity");
		int n=sc.nextInt();
		tbr=tbr+n;
		return tbr;
	}
	static int tr()
	{
		System.out.println("Enter your Aloo Masala Curry Quantity");
		int n=sc.nextInt();
		ttr=ttr+n;
		return ttr;
	}
	
}
class IC extends items
{
	static Scanner sc=new Scanner(System.in);
	static void Mveg()
	{
		System.out.println("Paneer Biryani= "+mehfil.pb+"\n"+"Vegetable Biryani= "+mehfil.vb+"\n"+"Mushroom Biryani= "+mehfil.mshb+"\n-----------------------------");
		System.out.println("Enter 1 for Paneer Biryani\nEnter 2 for Vegetable Biryani\nEnter 3 for Mushroom Biryani\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.pb();
					break;
			case 2: items.vb();
					break;
			case 3: items.mshb();
					break;
			case 4: MenuCard.MehfilMenu();
					break;
			case 5: if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
						
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					 IC.Mveg();
					break;
		}
	}
	static void MnonVeg()
	{
		System.out.println("Chicken Biryani= "+mehfil.cb+"\n"+"Chicken-65 Biryani= "+mehfil.c65b+"\n"+"Mutton Biryani= "+mehfil.mb+"\n"+"Special Mutton Biryani= "+mehfil.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Biryani\nEnter 2 for Chickem-65 Biryani\nEnter 3 for Mutton Biryani\nEnter 4 for Special Mutton Biryani\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cb();
				break;
			case 2: items.c65b();
				break;
			case 3: items.mb();
				break;
			case 4: items.smb();
					break;
			case 5: MenuCard.MehfilMenu();
					break;
			case 6:if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
		
	}
	static void Mstarters()
	{
		System.out.println("Chicken 65= "+mehfil.c65+"\n"+"Chicken Lollipops= "+mehfil.cl+"\n"+"Chicken Majesttic= "+mehfil.cmj+"\n"+"Special Mutton Biryani= "+mehfil.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken 65\nEnter 2 for Chicken Lollipops\nEnter 3 for Chicken Majestic\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.c65();
				break;
			case 2: items.cl();
				break;
			case 3: items.cmj();
				break;
			case 4: MenuCard.MehfilMenu();
					break;
			case 5:if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Mcurries()
	{
		System.out.println("Chicken Curry= "+mehfil.cc+"\n"+"Paneer Curry= "+mehfil.pc+"\n"+"Aloo Masala Curry= "+mehfil.amc+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Curry\nEnter 2 for Paneer Curry\nEnter 3 for Aloo Masala Curry\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cc();
				break;
			case 2: items.pc();
				break;
			case 3: items.amc();
				break;
			case 4: MenuCard.MehfilMenu();
					break;
			case 5:if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Mcd()
	{
		System.out.println("Thump-Up= "+mehfil.dt+"\n"+"Sprite= "+mehfil.ds+"\n"+"Maaza= "+mehfil.dm+"\n"+"Mountain-dew= "+mehfil.dmd+"\n--------------------------------\n");
		System.out.println("Enter 1 for Thump-Up\nEnter 2 for Sprite\nEnter 3 for Maaza\nEnter 4 for Mountain-dew\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.dt();
				break;
			case 2: items.ds();
				break;
			case 3: items.dm();
				break;
			case 4: items.dmd();
					break;
			case 5: MenuCard.MehfilMenu();
					break;
			case 6:if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Mrotis()
	{
		System.out.println("Rumali Roti= "+mehfil.rr+"\n"+"Butter Roti= "+mehfil.br+"\n"+"Tandoori Roti= "+mehfil.tr+"\n--------------------------------\n");
		System.out.println("Enter 1 for Rumali Roti\nEnter 2 for Butter Roti\nEnter 3 for Tandoori Roti\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.rr();
				break;
			case 2: items.br();
				break;
			case 3: items.tr();
				break;
			case 4: MenuCard.MehfilMenu();
					break;
			case 5:if(Billing.Mtotalbill()!=0)
					{
						Billing.Mbill();
						System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	//**********************************************************************************************************************************************************************
	static void Pveg()
	{
		System.out.println("Paneer Biryani= "+paradise.pb+"\n"+"Vegetable Biryani= "+paradise.vb+"\n"+"Mushroom Biryani= "+paradise.mshb+"\n-----------------------------");
		System.out.println("Enter 1 for Paneer Biryani\nEnter 2 for Vegetable Biryani\nEnter 3 for Mushroom Biryani\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.pb();
					break;
			case 2: items.vb();
					break;
			case 3: items.mshb();
					break;
			case 4: MenuCard.ParadiseMenu();
					break;
			case 5: if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
						
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					 IC.Mveg();
					break;
		}
	}
	static void PnonVeg()
	{
		System.out.println("Chicken Biryani= "+paradise.cb+"\n"+"Chicken-65 Biryani= "+paradise.c65b+"\n"+"Mutton Biryani= "+paradise.mb+"\n"+"Special Mutton Biryani= "+paradise.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Biryani\nEnter 2 for Chickem-65 Biryani\nEnter 3 for Mutton Biryani\nEnter 4 for Special Mutton Biryani\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cb();
				break;
			case 2: items.c65b();
				break;
			case 3: items.mb();
				break;
			case 4: items.smb();
					break;
			case 5: MenuCard.ParadiseMenu();
					break;
			case 6:if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
		
	}
	static void Pstarters()
	{
		System.out.println("Chicken 65= "+paradise.c65+"\n"+"Chicken Lollipops= "+paradise.cl+"\n"+"Chicken Majesttic= "+paradise.cmj+"\n"+"Special Mutton Biryani= "+paradise.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken 65\nEnter 2 for Chicken Lollipops\nEnter 3 for Chicken Majestic\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.c65();
				break;
			case 2: items.cl();
				break;
			case 3: items.cmj();
				break;
			case 4: MenuCard.ParadiseMenu();
					break;
			case 5:if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Pcurries()
	{
		System.out.println("Chicken Curry= "+paradise.cc+"\n"+"Paneer Curry= "+paradise.pc+"\n"+"Aloo Masala Curry= "+paradise.amc+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Curry\nEnter 2 for Paneer Curry\nEnter 3 for Aloo Masala Curry\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cc();
				break;
			case 2: items.pc();
				break;
			case 3: items.amc();
				break;
			case 4: MenuCard.ParadiseMenu();
					break;
			case 5:if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Pcd()
	{
		System.out.println("Thump-Up= "+paradise.dt+"\n"+"Sprite= "+paradise.ds+"\n"+"Maaza= "+paradise.dm+"\n"+"Mountain-dew= "+paradise.dmd+"\n--------------------------------\n");
		System.out.println("Enter 1 for Thump-Up\nEnter 2 for Sprite\nEnter 3 for Maaza\nEnter 4 for Mountain-dew\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.dt();
				break;
			case 2: items.ds();
				break;
			case 3: items.dm();
				break;
			case 4: items.dmd();
					break;
			case 5: MenuCard.ParadiseMenu();
					break;
			case 6:if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Protis()
	{
		System.out.println("Rumali Roti= "+paradise.rr+"\n"+"Butter Roti= "+paradise.br+"\n"+"Tandoori Roti= "+paradise.tr+"\n--------------------------------\n");
		System.out.println("Enter 1 for Rumali Roti\nEnter 2 for Butter Roti\nEnter 3 for Tandoori Roti\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.rr();
				break;
			case 2: items.br();
				break;
			case 3: items.tr();
				break;
			case 4: MenuCard.ParadiseMenu();
					break;
			case 5:if(Billing.Ptotalbill()!=0)
					{
						Billing.Pbill();
						System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	//*****************************************************************************************************************************************************************************************************************
		static void Bveg()
	{
		System.out.println("Paneer Biryani= "+bawarchi.pb+"\n"+"Vegetable Biryani= "+bawarchi.vb+"\n"+"Mushroom Biryani= "+bawarchi.mshb+"\n-----------------------------");
		System.out.println("Enter 1 for Paneer Biryani\nEnter 2 for Vegetable Biryani\nEnter 3 for Mushroom Biryani\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.pb();
					break;
			case 2: items.vb();
					break;
			case 3: items.mshb();
					break;
			case 4: MenuCard.BawarchiMenu();
					break;
			case 5: if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
						
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					 IC.Mveg();
					break;
		}
	}
	static void BnonVeg()
	{
		System.out.println("Chicken Biryani= "+bawarchi.cb+"\n"+"Chicken-65 Biryani= "+bawarchi.c65b+"\n"+"Mutton Biryani= "+bawarchi.mb+"\n"+"Special Mutton Biryani= "+bawarchi.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Biryani\nEnter 2 for Chickem-65 Biryani\nEnter 3 for Mutton Biryani\nEnter 4 for Special Mutton Biryani\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cb();
				break;
			case 2: items.c65b();
				break;
			case 3: items.mb();
				break;
			case 4: items.smb();
					break;
			case 5: MenuCard.BawarchiMenu();
					break;
			case 6:if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
		
	}
	static void Bstarters()
	{
		System.out.println("Chicken 65= "+bawarchi.c65+"\n"+"Chicken Lollipops= "+bawarchi.cl+"\n"+"Chicken Majesttic= "+bawarchi.cmj+"\n"+"Special Mutton Biryani= "+bawarchi.smb+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken 65\nEnter 2 for Chicken Lollipops\nEnter 3 for Chicken Majestic\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.c65();
				break;
			case 2: items.cl();
				break;
			case 3: items.cmj();
				break;
			case 4: MenuCard.BawarchiMenu();
					break;
			case 5:if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Bcurries()
	{
		System.out.println("Chicken Curry= "+bawarchi.cc+"\n"+"Paneer Curry= "+bawarchi.pc+"\n"+"Aloo Masala Curry= "+bawarchi.amc+"\n--------------------------------\n");
		System.out.println("Enter 1 for Chicken Curry\nEnter 2 for Paneer Curry\nEnter 3 for Aloo Masala Curry\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.cc();
				break;
			case 2: items.pc();
				break;
			case 3: items.amc();
				break;
			case 4: MenuCard.BawarchiMenu();
					break;
			case 5:if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Bcd()
	{
		System.out.println("Thump-Up= "+bawarchi.dt+"\n"+"Sprite= "+bawarchi.ds+"\n"+"Maaza= "+bawarchi.dm+"\n"+"Mountain-dew= "+bawarchi.dmd+"\n--------------------------------\n");
		System.out.println("Enter 1 for Thump-Up\nEnter 2 for Sprite\nEnter 3 for Maaza\nEnter 4 for Mountain-dew\nEnter 5 for Menu Categories\nEnter 6 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.dt();
				break;
			case 2: items.ds();
				break;
			case 3: items.dm();
				break;
			case 4: items.dmd();
					break;
			case 5: MenuCard.BawarchiMenu();
					break;
			case 6:if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
	static void Brotis()
	{
		System.out.println("Rumali Roti= "+bawarchi.rr+"\n"+"Butter Roti= "+bawarchi.br+"\n"+"Tandoori Roti= "+bawarchi.tr+"\n--------------------------------\n");
		System.out.println("Enter 1 for Rumali Roti\nEnter 2 for Butter Roti\nEnter 3 for Tandoori Roti\nEnter 4 for Menu Categories\nEnter 5 to Pay Bill and Exit\n--------------------------------");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:items.rr();
				break;
			case 2: items.br();
				break;
			case 3: items.tr();
				break;
			case 4: MenuCard.BawarchiMenu();
					break;
			case 5:if(Billing.Btotalbill()!=0)
					{
						Billing.Bbill();
						System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n-------------------------------------------");
						Payment.payment();
					}
					else
					{
						System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
					}
					break;
			default: System.out.println("Hurray!!! Kindly give a Valid Input.\n----------------------------------------");
					break;
		}
	}
}
abstract class Menu extends IC
{
	Scanner sc=new Scanner(System.in);
	abstract void MehfilMenu();
	abstract void ParadiseMenu();
	abstract void BawarchiMenu();
	
}
class MenuCard extends items
{
	static MenuCard obj2=new MenuCard();
	static void Menu()
	{
		System.out.println("Enter 1 for Mehfil Restaurant\nEnter 2 for Paradise Restaurant\nEnter 3 for Bawarchi Restaurant\n-------------------------------");
		int n=sc.nextInt();
		while(true)
		{
			if(n==1)
			{
				obj2.MehfilMenu();
			}
			else if(n==2)
			{
				obj2.ParadiseMenu();
			}
			else if(n==3)
			{
				obj2.BawarchiMenu();
			}
			else
			{
				System.out.println("Sorry! Kindly Check Your Choice\n--------------------------------");
				Swiggy.Menu();
				break;
			}
		}
	}
	static int Mc=0;
	static void MehfilMenu()
	{
		if(Mc==0)
		{
			Mc++;
			System.out.printf("%95s","| WELCOME TO MEHFIL RESTAURANT |");
			System.out.println();
			System.out.printf("%85s","| MEHFIL MENU |"); 
		}
		while(true)
		{
			System.out.println();
			System.out.println("press 1 for VEG Menu Biryanis\nPress 2 for NON-VEG Biryanis\nPress 3 for STARTERS\nPress for 4 for CURRIES\nPress 5 for ROTIS\nPress 6 for COOL DRINKS\nPress 7 to get Bill and Exit\n-------------------------------");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: IC.Mveg();
						break;
				case 2: IC.MnonVeg();
						break;
				case 3: IC.Mstarters();
						break;
				case 4: IC.Mcurries();
						break;
				case 5: IC.Mrotis();
						break;
				case 6: IC.Mcd();
						break;
				case 7: if(Billing.Mtotalbill()!=0)
						{
							Billing.Mbill();
							System.out.print("Total Amount to Pay: "+Billing.Mtotalbill()+"\n----------------------------------------");
							Payment.payment();
						}
						else
						{
							System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
						}
						break;
				default: System.out.println("Ohh! N0.....Please try Again to find your favorites...\n");
						break;
			}
		}
	}

	//***********************************************************************************************************************************MEHFIL MENU END***************
	static int Pc=0;
	static void ParadiseMenu()
	{
		if(Pc==0)
		{
			Pc++;
			System.out.printf("%95s","| WELCOME TO PARADISE RESTAURANT |");
			System.out.println();
			System.out.printf("%85s","| PARADISE MENU |"); 
		}
		while(true)
		{
			System.out.println();
			System.out.println("press 1 for VEG Menu Biryanis\nPress 2 for NON-VEG Biryanis\nPress 3 for STARTERS\nPress 4 for CURRIES\nPress 5 for ROTIS\nPress 6 for COOL DRINKS\nPress 7 to get Bill and Exit\n-------------------------------");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: IC.Pveg();
						break;
				case 2: IC.PnonVeg();
						break;
				case 3: IC.Pstarters();
						break;
				case 4: IC.Pcurries();
						break;
				case 5: IC.Protis();
						break;
				case 6: IC.Pcd();
						break;
				case 7: if(Billing.Ptotalbill()!=0)
						{
							Billing.Pbill();
							System.out.print("Total Amount to Pay: "+Billing.Ptotalbill()+"\n----------------------------------------");
							Payment.payment();
						}
						else
						{
							System.out.println("-------------------------------------------------\nSorry! You'Ve Empty Cart...Push your Favorites!!!\n-------------------------------------------------");
							System.out.println("Enter 1 to Exit\nEnter 2 to continue\n-----------------------------");
							int n1=sc.nextInt();
							if(n1==1)
							{
								System.out.println("Thank You for Visiting us!.....Awaiting for Your Come Back.\n--------------------------------------------------------------------");
								System.exit(0);
							}
						}
						break;
				default: System.out.println("Ohh! N0.....Please try Again to find your favorites...\n");
						break;
			}
		}
	}
	//******************************************************************************************************************************************************************************************************
	
	static int Bc=0;
	static void BawarchiMenu()
	{
		if(Bc==0)
		{
			Bc++;
			System.out.printf("%95s","| WELCOME TO BAWARCHI RESTAURANT |");
			System.out.println();
			System.out.printf("%85s","| BAWARCHI MENU |"); 
		}
		while(true)
		{
			System.out.println();
			System.out.println("Press 1 for VEG Menu Biryanis\nPress 2 for NON-VEG Biryanis\nBress 3 for STARTERS\nPress for 4 for CURRIES\nBress 5 for ROTIS\nPress 6 for COOL DRINKS\nPress 7 to get Bill and Exit\n-------------------------------");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: IC.Bveg();
						break;
				case 2: IC.BnonVeg();
						break;
				case 3: IC.Bstarters();
						break;
				case 4: IC.Bcurries();
						break;
				case 5: IC.Brotis();
						break;
				case 6: IC.Bcd();
						break;
				case 7: if(Billing.Btotalbill()!=0)
						{
							Billing.Bbill();
							System.out.print("Total Amount to Pay: "+Billing.Btotalbill()+"\n----------------------------------------");
							Payment.payment();
						}
						else
						{
							System.out.println("-------------------------------------------------\nSorry! You'Ve EmBty Cart...Bush your Favorites!!!\n-------------------------------------------------");
							System.out.println("Enter 1 to Exit\nEnter 2 to continue\n-----------------------------");
							int n1=sc.nextInt();
							if(n1==1)
							{
								System.out.println("Thank You for Visiting us!.....Awaiting for Your Come Back.\n--------------------------------------------------------------------");
								System.exit(0);
							}
						}
						break;
				default: System.out.println("Ohh! N0.....Blease try Again to find your favorites...\n");
						break;
			}
		}
	}
}
class Swiggy extends MenuCard
{
    static Scanner sc=new Scanner(System.in);
    private static String suname;
    private static String smnum;
    private static String suser;
    private static String spass;
	static int c=0;
	static
	{
		System.out.println("Enter Your Full Name for Swiggy:");
		suname=sc.nextLine();
		while(true)
		{
			System.out.print("Enter Your 10 Digit Mobile Number to link to Swiggy: ");
			smnum=sc.nextLine();
			c=0;
			if(smnum.length()==10)
			{
				for(int i=0;i<smnum.length();i++)
				{
					if(smnum.charAt(i)>='0'&&smnum.charAt(i)<='9')
					{
						c++;
					}
					else
					{
						System.out.print("Please check your Mobile Number: "+smnum+"\n-------------------------------\n");
						break;
					}
				}
				if(c==10)
				{
					System.out.println("Mobile Validation Successfull\n-----------------------------");
					break;
				}
			}
			else
			{
				System.out.print("Please check your Mobile Number: "+smnum+"\n------------------------------\n");
			}
		}
		System.out.print("Please Enter your Email as Swiggy User ID: ");
		suser=sc.nextLine();
		System.out.print("Set Your Swiggy Password: ");
		spass=sc.nextLine();
	}
    void setsuser(String suser)
	{
		this.suser=suser;
	}
	void setspass(String spass)
	{
		this.spass=spass;
	}
	String getsuser()
	
	{
		return suser;
	}
	String getspass()
	{
		return spass;
	}
	
	//****************************************************************************
	static void swiggy()
	{
		Swiggy obj =new Swiggy();
		System.out.println("Enter Your Email to Log-In");
		
		while(true)
		{
			String su=sc.next();
		
			if(su.equals(obj.getsuser()))
			{
				System.out.println("Please Enter your Swiggy password");
				String sp=sc.next();
				if(sp.equals(obj.getspass()))
				{
					System.out.printf("%90s","| WELCOME TO SWIGGY |"); 
					System.out.println();
					MenuCard.Menu();
					
				}			
				else
				{
					System.out.println("Please check your Password");
					if(!sp.equals(obj.getspass()))
					{
						System.out.println("Enter Your new password to reset");
						String pr=sc.next();
						obj.setspass(pr);
						System.out.println("password updated Successfully!!\nYour New Swiggy password is: "+obj.getspass());
		
					}
				}
			}
			else
			{
				System.out.println("Please check your Email Address");
				if(!su.equals(obj.getsuser()))
				{
					System.out.println("Enter Your new email to reset");
					String ur=sc.next();
					obj.setsuser(ur);
					System.out.println("Email updated Successfully!!\nYour Swiggy New UserId is: "+obj.getsuser());
					System.out.println("Please enter Your Email address to login");
				}
			
			}
		}
	}
}
		//*******************************************************************************************************************************
class Zomato extends MenuCard
{
		static Scanner sc=new Scanner(System.in);
		static int c=0;
		private static String zuname;
        private static String zmnum;
        private static String zuser;
        private static String zpass;
		static
		{
			System.out.println("Enter Your Full Name for Zomato");
			zuname=sc.nextLine();
			while(true)
			{
				System.out.print("Enter Your 10-Digit Mobile Number to link to Zomato: ");
				zmnum=sc.nextLine();
				c=0;
				if(zmnum.length()==10)
				{
					for(int i=0;i<zmnum.length();i++)
					{
						if(zmnum.charAt(i)>='0'&&zmnum.charAt(i)<='9')
						{
							c++;
						}
						else
						{
							System.out.print("Please check your Mobile Number: "+zmnum+"\n-------------------------------\n");
							break;
						}
					}
					if(c==10)
					{
						System.out.println("Mobile Validation Successfull\n-----------------------------");
						break;
					}
				}
				else
				{
					System.out.print("Please check your Mobile Number: "+zmnum+"\n------------------------------\n");
				}
			}
			System.out.print("Please Enter your Email as Zomato User ID: ");
			zuser=sc.nextLine();
			System.out.print("Set Your Zomato Password:");
			zpass=sc.nextLine();
		}
        void setzuser(String zuser)
    	{
    		this.zuser=zuser;
    	}
    	void setzpass(String zpass)
    	{
    		this.zpass=zpass;
    	}
    	String getzuser()
    	{
    		return zuser;
    	}
    	String getzpass()
    	{
    		return zpass;
    	}

		static void zomato()
		{
			System.out.println("Enter Your Email to Log-In");
			Zomato obj1=new Zomato();
			while(true)
			{
				String zu=sc.next();
				if(zu.equals(obj1.getzuser()))
				{
					System.out.println("Please Enter your Zomato password");
					String zp=sc.next();
					if(zp.equals(obj1.getzpass()))
					{
						System.out.printf("%90s","| WELCOME TO ZOMATO |"); 
						System.out.println();
						MenuCard.Menu();
					}
					else
					{
						System.out.println("Please check your Password");
						if(!zp.equals(obj1.getzpass()))
						{
							System.out.println("Enter Your new password to reset");
							String pr=sc.next();
							obj1.setzpass(pr);
							System.out.println("password updated Successfully!!\nYour New Zomato password is: "+obj1.getzpass());

						}
					}
				}
				else
				{
					System.out.println("Please check your Email Address");
					if(!zu.equals(obj1.getzuser()))
					{
						System.out.println("Enter Your new email to reset");
						String ur=sc.next();
						obj1.setzuser(ur);
						System.out.println("Email updated Successfully!!\nYour New Zomato UserId is: "+obj1.getzuser());
						System.out.println("Please enter Your Email address to login");
					}
				
				}
			}
		}
}
class User
{
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args)
	{
        
        System.out.print("Enter Your Choice\nEnter 1 to Sign-Up for Swiggy\nEnter 2 to Sign-Up for Zomato.\n");
        int n=sc.nextInt();
        switch(n)
        {
            case 1: System.out.println("Enter Your Following Details in Swiggy\nFull-Name\nMobile Number\nEmail\nPassword\n---------------------------------------\n");
                    Swiggy s=new Swiggy();
                    System.out.println("\n----------------------------------------\nYour Account is Created successfully for Swiggy\n----------------------------------------");
                    Swiggy.swiggy();
                    break;
             case 2: System.out.println("Enter Your Following Details in Zomato\nFull-Name\nMobile Number\nEmail\nPassword\n---------------------------------------\n");
                    Zomato z=new Zomato();
                    System.out.println("\n----------------------------------------\nYour Account is Created successfully for Zomato\n----------------------------------------");
                    Zomato.zomato();
                    break;
			default: System.out.println("Invalid Selection");
					break;
        }
        
    }
}
