class This{
    static int a = 100;
    int b = 50;
    public void m1(){
      int a = 200;
      int b = 50;
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(b);
    System.out.println(this.b);
    }
    public static void main(String []args){
         A obj = new A();
          obj.m1();
    }
}