import java.util.*;
class Batch114
{
	static Scanner sc=new Scanner(System.in);
	static Batch114 obj=new Batch114();
	String s="";
	String s1="";
	int stud_id;
	String stud_Name;
	int stud_marks;
	int i=0;

	void boys(int n)
	{
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter Boys No."+i+" Student ID, Name, Marks");
			stud_id=sc.nextInt();
			stud_Name=sc.next();
			stud_marks=sc.nextInt();
			s=s+"Details of Boys Student No."+i+" are:"+"\n"+"Student ID: "+stud_id+"\n"+"Student Name: "+stud_Name+"\n"+"Student Marks: "+stud_marks+"\n";
		}
		
	}
	void boysDetails()
	{
		System.out.println(s);
	}
	
	void girls(int n)
	{
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter Girls No."+i+" Student ID, Name, Marks");
			stud_id=sc.nextInt();
			stud_Name=sc.next();
			stud_marks=sc.nextInt();
			s1=s1+"Details of Girls Student No."+i+" are:"+"\n"+"Student ID: "+stud_id+"\n"+"Student Name: "+stud_Name+"\n"+"Student Marks: "+stud_marks+"\n";
		}
		
	}
	void girlsDetails()
	{
		System.out.println(s1);
	}
	
	void StudentDetails()
	{
		System.out.println(s);
		System.out.println(s1);
	}

	public static void main(String[]args)
	{
		System.out.println("Enter Number of Student Details:");
		int n=sc.nextInt();
		obj.boys(n);
		obj.girls(n);
		do{
		System.out.println("Enter B for Boys student Details: \n"+"Enter G for Girls student Details: \n"+"Enter S for Boys & Girls student Details: ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'B': obj.boysDetails();
			break;
			case 'G': obj.girlsDetails();
			break;
			case 'S': obj.StudentDetails();
			break;
			default : System.out.println("Invalid Input"); 
		}
		}while(true);
	}
}