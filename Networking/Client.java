import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("localhost",9999);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String s1="",s2="";
		while(!(s1.equals("stop")))
		{
			System.out.println("Please Enter your data to send from client to Server");
			s1=sc.nextLine();
			dos.writeUTF(s1);
			dos.flush();
			s2=dis.readUTF();
			System.out.print(s2);
		}
		dos.flush();
		dis.close();
	}


}