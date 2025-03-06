import java.util.*;
class Instagram
{	static Scanner sc=new Scanner(System.in);
	private static String user="jagadeesh";
	private static String password="sabinkar";
	
	Instagram()
	{
		this(sc.next(),sc.next());
	}
	Instagram(String user,String password)
	{
		this.user=user;
		this.password=password;
	}
	String getUser()
	{
	    return user;
	}
	String getPass()
	{
	    return password;
	}
}
class check extends Instagram
{
	static void insta()
	{
		System.out.println("Enter User Id and Password to sign up");
		check obj=new check();
		System.out.println("Enter User Id to log in");
		String u=sc.next();
		if(u.equals(obj.getUser()))
		{
			System.out.println("Enter your Password");
			String p=sc.next();
			if(p.equals(obj.getPass()))
			{
				System.out.println("Login Successfull");
			}
			else
			{
				System.out.println("Incorrect Password");
				System.out.println("Enter new Password to reset");
				new Instagram();
				System.out.println("Password updated Successfully!"+obj.getPass());

			}
			
		}
		else
		{
			System.out.println("Incorrect User ID");
			System.out.println("Enter new User ID to reset");
			
			new Instagram();
			System.out.println("User Id updated Successfully!"+obj.getUser());
		}
	
	}
}
class User extends check
{
	public static void main(String args[])
	{
		check.insta();
	}

}