import java.util.Scanner;
class Insta
{
	static Scanner sc = new Scanner(System.in);
	private String id = sc.next();
	private String pwd = sc.next();
	void setId(String id)
	{	
		this.id = id;
	}
	String getId()
	{	
		return id;
	}
	void setpwd(String pwd)
	{
		this.pwd = pwd;
	}
	String getpwd()
	{
		return pwd;
	}
}
class Fbook
{
	static Scanner sc = new Scanner(System.in);
	private String id = sc.next();
	private String pwd = sc.next();
	void setId(String id)
	{	
		this.id = id;
	}
	String getId()
	{	
		return id;
	}
	void setpwd(String pwd)
	{
		this.pwd = pwd;
	}
	String getpwd()
	{
		return pwd;
	}

}
class Gmail
{
	static Scanner sc = new Scanner(System.in);
	private String id = sc.next();
	private String pwd = sc.next();
	void setId(String id)
	{	
		this.id = id;
	}
	String getId()
	{	
		return id;
	}
	void setpwd(String pwd)
	{
		this.pwd = pwd;
	}
	String getpwd()
	{
		return pwd;
	}
}
class RandomNumbers
{
	static int random()
	{
		int min=10000;
		int max=99999;
		int range = (max-min)+1;
		int random=(int)(Math.random()*range)+min;
		return random;
	}
}
class IFGapplication
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter I for Instagram\nEnter F for Facebook\nEnter G for Gmail");
			char ch = sc.next().charAt(0);
			switch(ch)
			{	
					case 'I' :
						System.out.println("Enter Your UserId and Password to create Account");
						Insta obj1 = new Insta();
						System.out.println("Enter Your User ID");
						String id = sc.next();
						if(id.equals(obj1.getId()))
						{	
							int c=1;
							while(c<=3)
							{
							int otp=RandomNumbers.random();
							System.out.println("Your OTP is: "+otp);
							System.out.println("Enter Your OTP");
							
							int uotp=sc.nextInt();
							
							if(uotp==otp)
							{	
								System.out.println("OTP verification Successful");
								System.out.println("Enter Your Password");
								String pwd=sc.next();
								if(pwd.equals(obj1.getpwd()))
								{
									System.out.println("You have Logged in Successfully\n\nWelcome to INSTAGRAM");
								}
								else
								{
									System.out.println("Please check your Password\n");
									System.out.println("Enter 1 to Reset your Password");
									int num=sc.nextInt();
									switch(num)
									{
										case 1: System.out.println("Enter true to update Password");
											   boolean b = sc.nextBoolean();
											   if(b)
											   {
												 if(!pwd.equals(obj1.getpwd()))
												 {
													System.out.println("Enter Your new User Password");
													System.out.println();
													obj1.setpwd(sc.next());
													System.out.println("Password updated Successfully\nYour New Password is: "+obj1.getpwd());
												 }

								       		  }	
			

									}
								}
								break;
								
							}
							else
							{
								System.out.println("Incorrect OTP");
								c++;
								if(c>3)
								{
									System.out.println("You've exceeded the Limit...Account is Temporarily Blocked");
								}
							}
							}
						}
						else
						{
							System.out.println("Please check your UserID\n");
							System.out.println("Enter 1 to Reset your User ID");
							int num=sc.nextInt();
							switch(num)
							{
								case 1: System.out.println("Enter true to update UserID");
									   boolean b = sc.nextBoolean();
									   if(b)
									   {
										 if(!id.equals(obj1.getId()))
										 {
											System.out.println("Enter Your new User ID");
											System.out.println();
											obj1.setId(sc.next());
											System.out.println("UserID updated Successfully\nYour New UserId is: "+obj1.getId());
										 }

								         }	
			

							}
		

						}
						break;

					case 'F' :System.out.println("Enter Your UserId and Password to create Account");
						Fbook obj2 = new Fbook();
						System.out.println("Enter Your User ID");
						String id1 = sc.next();
						if(id1.equals(obj2.getId()))
						{	
							int c=1;
							while(c<=3)
							{
							int otp=RandomNumbers.random();
							System.out.println("Your OTP is: "+otp);
							System.out.println("Enter Your OTP");
							int uotp=sc.nextInt();
						
							if(uotp==otp)
							{
								System.out.println("OTP verification Successful");
								System.out.println("Enter Your Password");
								String pwd=sc.next();
								if(pwd.equals(obj2.getpwd()))
								{
									System.out.println("You have Logged in Successfully\n\nWelcome to FACEBOOK");
								}
								else
								{
									System.out.println("Please check your Password\n");
									System.out.println("Enter 1 to Reset your Password");
									int num=sc.nextInt();
									switch(num)
									{
										case 1: System.out.println("Enter true to update Password");
											   boolean b = sc.nextBoolean();
											   if(b)
											   {
												 if(!pwd.equals(obj2.getpwd()))
												 {
													System.out.println("Enter Your new User Password");
													System.out.println();
													obj2.setpwd(sc.next());
													System.out.println("Password updated Successfully\nYour New Password is: "+obj2.getpwd());
												 }

								       		  }	
			

									}
								}
								break;

							}
							else
							{
								System.out.println("Incorrect OTP");
								c++;
								if(c>3)
								{
									System.out.println("You've exceeded the Limit...Account is Temporarily Blocked");
								}
							}
							}
						}
						else
						{
							System.out.println("Please check your UserID\n");
							System.out.println("Enter 1 to Reset your User ID");
							int num=sc.nextInt();
							switch(num)
							{
								case 1: System.out.println("Enter true to update UserID");
									   boolean b = sc.nextBoolean();
									   if(b)
									   {
										 if(!id1.equals(obj2.getId()))
										 {
											System.out.println("Enter Your new User ID");
											System.out.println();
											obj2.setId(sc.next());
											System.out.println("UserID updated Successfully\nYour New UserId is: "+obj2.getId());
										 }

								         }	
			

							}
		

						}
						break;

					case 'G' :System.out.println("Enter Your UserId and Password to create Account");
						Gmail obj3 = new Gmail();
						System.out.println("Enter Your User ID");
						String id2 = sc.next();
						if(id2.equals(obj3.getId()))
						{
							int c=1;
							while(c<=3)
							{
							int otp=RandomNumbers.random();
							System.out.println("Your OTP is: "+otp);
							System.out.println("Enter Your OTP");
							int uotp=sc.nextInt();
						
							if(uotp==otp)
							{
								System.out.println("OTP verification Successful");
								System.out.println("Enter Your Password");
								String pwd=sc.next();
								if(pwd.equals(obj3.getpwd()))
								{
									System.out.println("You have Logged in Successfully\n\nWelcome to GMAIL");
								}
								else
								{
									System.out.println("Please check your Password\n");
									System.out.println("Enter 1 to Reset your Password");
									int num=sc.nextInt();
									switch(num)
									{
										case 1: System.out.println("Enter true to update Password");
											   boolean b = sc.nextBoolean();
											   if(b)
											   {
												 if(!pwd.equals(obj3.getpwd()))
												 {
													System.out.println("Enter Your new User Password");
													System.out.println();
													obj3.setpwd(sc.next());
													System.out.println("Password updated Successfully\nYour New Password is: "+obj3.getpwd());
												 }

								       		  }	
			

									}
								}
								break;

							}
							else
							{
								System.out.println("Incorrect OTP");
								c++;
								if(c>3)
								{
									System.out.println("You've exceeded the Limit...Account is Temporarily Blocked");
								}
							}
							}
						}
						else
						{
							System.out.println("Please check your UserID\n");
							System.out.println("Enter 1 to Reset your User ID");
							int num=sc.nextInt();
							switch(num)
							{
								case 1: System.out.println("Enter true to update UserID");
									   boolean b = sc.nextBoolean();
									   if(b)
									   {
										 if(!id2.equals(obj3.getId()))
										 {
											System.out.println("Enter Your new User ID");
											System.out.println();
											obj3.setId(sc.next());
											System.out.println("UserID updated Successfully\nYour New UserId is: "+obj3.getId());
										 }

								         }	
			

							}
		

						}
						break;
					
						default: System.out.println("Please Select Correct Option");
						break;
			}
	}
}