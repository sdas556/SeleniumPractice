package Day11;

public class TestConstructor {

	public void test() {
		System.out.println("test function");
	}
	
	public static void staticMethod() {
		TestConstructor obj2 = new TestConstructor();
		System.out.println("Inside staticMethod()");
		obj2.test();
		
	}
	
	public static void main(String[] args) {
		
		TestConstructor obj = new TestConstructor();
		obj.test();
		
		TestConstructor.staticMethod();
		
	}

}
