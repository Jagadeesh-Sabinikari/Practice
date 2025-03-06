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
	void setid(String id)
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
	void setid(String id)
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
		int max=20000;
		int random=(int)Math.random();
		return random;
	}
}
class Encap
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter I for Instagram\nEnter F for Facebook\nEnter G for Gmail");
			char ch = sc.next().charAt(0);
			switch(ch)
			{	
					case 'I' :
						System.out.println("Enter Your UserId and Password");
						Insta obj1 = new Insta();
						System.out.println("Enter Your User ID");
						String id = sc.next();
						if(id.equals(obj1.getId())
						{
							System.out.println(random());
						}
						else
						{	
							System.out.print("Invalid userid or password");
							boolean b = sc.nextBoolean();
							if(b)
							{
								if(!id.equals(obj1.getId()) && pwd.equals(obj1.getpwd()))
								{
									obj1.setId(sc.next());
									System.out.println("updated succesfully \n your id is"+obj1.getId());	
								}
								else if(id.equals(obj1.getId()) && !pwd.equals(obj1.getpwd()))
								{
									obj1.setpwd(sc.next());
									System.out.println("updated succesfully \n your pwd is"+obj1.getpwd());	
								}
					
							}
						}
						break;
					case 'F' :
					case 'G' :
			}
	}
}