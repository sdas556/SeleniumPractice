package OOPConcepts;

class Parent
{

	void show()
	{
		System.out.println("In class A::show()");
	}
	static void display()
	{
		System.out.println("In class A::display()");
	}
}

class Child extends Parent
{
	
	
	void show()
	{
		
		System.out.println("In class B::show()");
		
	}
	
	//void test() {System.out.println("In class B::test()");}
	
	static void display()
	{
		System.out.println("In class B::display()");
	}
	
}


public class OverridingMethodHiding {

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.show();
		obj.display();
		
		Child o = new Child();
		o.display(); //Method Hiding  https://docs.oracle.com/javase/tutorial/java/IandI/override.html#:~:text=The%20ability%20of%20a%20subclass,the%20method%20that%20it%20overrides.
		//o.show();

	}

}
