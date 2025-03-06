class MobileSpecs
{	
	static String Brand="Oneplus Nord 2 Series";
	static String RAM="8GB";
	static String ROM="128GB";
	static String OS="Jelly";
	static float OSversion=2.4f;
	static String Cam="64 Pixels";	
	static String Processor="Octa-Core";
	static String Battery="5200mAh";
	static String Display="6 inch";
	static int price=20000;
}
class WholeSale extends MobileSpecs
{
	static int price=25000;
}
class Retail extends WholeSale
{
	static int price=30000;
}
class Customer extends Retail
{
	public static void display()
	{
	System.out.println("Mobile Specifications and Price details");
	System.out.println("---------------------------------------");
	System.out.println("Brand Name: "+Brand);
	System.out.println("RAM: "+RAM);
	System.out.println("ROM: "+ROM);
	System.out.println("OS: "+OS);
	System.out.println("OS-version: "+OSversion);
	System.out.println("Camera: "+Cam);
	System.out.println("Processor: "+Processor);
	System.out.println("Battery: "+Battery);
	System.out.println("Display: "+Display);
	System.out.println("Price: "+price);
	}
}
class ProductSale
{
 	public static void main(String[]args)
	{
		Customer.display();
	}
}