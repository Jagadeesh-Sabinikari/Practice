class MethodParameterAndReturn{
	
	public static int m1(int a){
       a = 20;	
	 System.out.println(a);
       return 45;

	}
      public static void m2(){
		int b = 40;
		int c = b+m1(5);
	System.out.println(m1(5));
       System.out.println(c);
	System.out.println(b);
      System.out.println(c+m1(5));
      }

public static void main(String args[]){

           m2();

	}
}