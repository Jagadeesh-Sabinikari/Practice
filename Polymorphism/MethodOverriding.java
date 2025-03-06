 import java.util.*;
class A
{
	String Whatsapp(int a)	
	{
		return "Welcome to WhatsApp!";
	}
}
class B extends A
{
	String Snapchat(int a)
	{
		return "Welcome to Snapchat!";
	}

}
class MethodOverriding extends B
{
	String Tiktok(int a)
	{
		return "Welcome to Tiktok!";
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		C obj =new C();
		System.out.println("Enter 1 for WhatsApp\nEnter 2 for Snapchat\nEnter 3 for Tiktok");
		int n=sc.nextInt();
		if(n==1)
			System.out.println(obj.Whatsapp(10));
		else if(n==2)
			System.out.println(obj.Snapchat(10));		
		else if(n==3)
			System.out.println(obj.Tiktok(10));
		else
			System.out.println("please select valid option");
	}
}