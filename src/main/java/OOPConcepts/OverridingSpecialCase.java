package OOPConcepts;

class A
{
	/*
	 * A(int i) { System.out.println("In class A constructor "+i); }
	 */
	
	
	void show()
	{
		System.out.println("In class A::show()");
	}
}

class B extends A
{
	/*
	 * B(int n) { super(n); n++; System.out.println("In class B constructor "+n);
	 * 
	 * }
	 */
	
	void show(int a)
	{
		super.show();
		System.out.println("In class B::show()");
		
	}
	void test() {System.out.println("In class B::test()");}
}

public class OverridingSpecialCase {

	
	public static void main(String[] args) {
		
		//A obj = new B(6);
		
		A obj = new B();
		obj.show();
		//obj.show(8);
		//obj.test();
		B o = new B();
		o.test();
	}

}
