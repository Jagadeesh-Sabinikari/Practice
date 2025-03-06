import java.util.*;
class K
{
	private String user="sabinkar";
	private String password="Jagadeesh";
	void set1(String user,String password)
	{
		this.user=user;
		this.password=password;
	}
	String get1()
	{
		return user;
	}
	String get2()
	{
		return password;
	}
}
class Encapsulation3
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your user name");
		String user=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		if(new K().get1().equals(user) && new K().get2().equals(password))
		{
			System.out.println("Log in Successful");
		}
		else 
		{
			if(new K().!get1().equals(user))
			{
				System.out.println("Invalid user name");
			}	
			else
			{	
				System.out.println("Invalid password");
			}
			
		}
		
 	
	}

}