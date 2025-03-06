class Engine
{
	static String EngineOilCap;
	static String EnginePower;
	static String EngineCompRatio;
}
class Car extends Engine
{
	static String EngineOilCap="10 Lit";
	static String EnginePower="5200 hp";
	static String EngineCompRatio="11.5 CR";
}

class Aeroplane extends Engine
{
	static String EngineOilCap="1000 Lit";
	static String EnginePower="7000 hp";
	static String EngineCompRatio="19 CR";
}

class Boat extends Engine
{
	static String EngineOilCap="500 Lit";
	static String EnginePower="2000 hp";
	static String EngineCompRatio="5.5 CR";
}
class Vehicle
{
	public static void main(String args[])
	{
		System.out.println("Engine Details");
		System.out.println("---------------");
		System.out.println("Car EngineOilCap "+Car.EngineOilCap);
		System.out.println("Car EnginePower "+Car.EnginePower);
		System.out.println("Car EngineCompRatio "+Car.EngineCompRatio);
		System.out.println("---------------");
		System.out.println("Aeroplane EngineOilCap "+Aeroplane.EngineOilCap);
		System.out.println("Aeroplane EnginePower "+Aeroplane.EnginePower);
		System.out.println("Aeroplane EngineCompRatio "+Aeroplane.EngineCompRatio);
		
	}

}