class AllMethodsExample{

	static AllMethods obj = new AllMethods();
	public static void m1(){
		int a = 50;
		System.out.println(a);
		obj.m2();
	}
	public void m2(){
       	int b= 20;
		System.out.println(b);
		m3(10);
 	}
	public static void m3(int c){
		System.out.println(c);
		obj.m4(15);
	}
	public void m4(int d){
		System.out.println(d+m5());
	}
	public static int m5(){
		System.out.println(obj.m6());
		return 55;
	
	}
	public char m6(){
		char e = 'a';
	       return e;
	}
public static void main(String args[]){

           m1();
	     
		
		
	


	}
}