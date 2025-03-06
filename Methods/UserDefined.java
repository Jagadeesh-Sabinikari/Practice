class UserDefined
{
	
	public static UserDefined m1()
	{
		System.out.println("Method with User Defined Datatype");
		return new UserDefined("jagadeesh");

	}
       UserDefined()
	{
          System.out.println("No arguement constructor");
       }

	UserDefined(String name){
		System.out.println("Parameterised constructor");
          System.out.println(name);
		
       }
	
	public static void main(String []args)
	{
		System.out.println(new UserDefined("Jagadeesh"));
		m1();
	}
}