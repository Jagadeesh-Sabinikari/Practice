class MethodParameter{
	
	public static void m1(int a,int b){
       
	 System.out.println(a);
       System.out.println(b);
     a=12;
     b=14;
     System.out.println(a);
     System.out.println(b);

	}
      public void m2(char a){
       System.out.println(a);
      }

public static void main(String args[]){

           m1(10,20);

	}
}