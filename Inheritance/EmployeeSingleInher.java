
import java.util.*;
class SoftwareCompany
{
	static Scanner sc = new Scanner(System.in);
	void details()
	{
		int EmpID = sc.nextInt();
		String EmpDesignation = sc.next();
		double EmpSalary = sc.nextDouble();
		String EmpWorkLocation= sc.next();
		System.out.println(EmpID);
		System.out.println(EmpDesignation);
		System.out.println(EmpSalary);
		System.out.println(EmpWorkLocation);
	}
}
class EmployeeSingleInher extends SoftwareCompany
{
	public static void main(String []args)
	{
	System.out.println("Kindly Enter the Employee ID, Designation, Salary, Work Location to print the details.");
	Employee emp=new Employee();
	emp.details();
	}
}