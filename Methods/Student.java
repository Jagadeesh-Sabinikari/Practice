import java.util.*;
class Student
{
	public static void main(String []args)
	{
		System.out.println("Enter Number of Students to get details");
		Scanner sc = new Scanner(System.in);
		Student obj=new Student();
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{	
			if(i==1)
			{
			System.out.println("Enter "+i+"st Student-ID, Enter Student-Name, Enter Student-Marks");
			obj.displayDetails(sc.nextInt(),sc.next(),sc.nextInt());
			System.out.println();
			
			}
			else if(i==2)
			{
			System.out.println("Enter "+i+"nd Student-ID, Enter Student-Name, Enter Student-Marks ");
			obj.displayDetails(sc.nextInt(),sc.next(),sc.nextInt());		
			System.out.println();	
			}
			else if(i==3)
			{
			System.out.println("Enter "+i+"rd Student-ID, Enter Student-Name, Enter Student-Marks ");
			obj.displayDetails(sc.nextInt(),sc.next(),sc.nextInt());	
			System.out.println();		
			}
			else
			{
			System.out.println("Enter "+i+"th Student-ID, Enter Student-Name, Enter Student-Marks ");
			obj.displayDetails(sc.nextInt(),sc.next(),sc.nextInt());
			System.out.println();
			}
		}
	}
			public void displayDetails(int StudID, String StudName, int StudMarks)
			{
				System.out.println("Student ID: "+StudID);
				System.out.println("Student Name "+StudName);
				System.out.println("Student Marks: "+StudMarks);
				System.out.println();

			}
}