import java.net.*;
import java.io.*;
import java.util.*;
class Server
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc=new Scanner(System.in);
		ServerSocket ss= new ServerSocket(9999);	
		Socket s=ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String s1="",s2="";
		while(!(s1.equals("stop")))		
		{
			s1=dis.readUTF();
			System.out.println(s1);
			System.out.println("Please Enter your data to send from server to client");
			s2=sc.nextLine();
			dos.writeUTF(s2);
			dos.flush();

		}
		dos.close();
		dis.close();
		
	}


}