package Day16;

interface Shape
{
	int length = 10;
	int width = 20;
	
	void circle();
	
	default void square()
	{
		System.out.println("This is square function from default square()");
	}
	
	
	static void rectangle()
	{
		System.out.println("static method rectangle");
	}
}




public class interfacedemo implements Shape  
{
	
	public void circle()
	{
		System.out.println("function Cicle implemented from class interfaceDemo");
	}
	public void square()
	{
		System.out.println("This is square function from interfacedemo class");
	}
	
	
	public static void main(String[] args) {
		
		Shape.rectangle();
		System.out.println(length);
		System.out.println(Shape.width);
		
		interfacedemo obj = new interfacedemo();
		obj.square();
		obj.circle();

	}

	public static void rectangle() {
		System.out.println("static method rectangle from main()");
		
	}

}
