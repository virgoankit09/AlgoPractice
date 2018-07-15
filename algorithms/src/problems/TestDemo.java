package problems;

interface TestInterface {

	default void testMethod() {
		System.out.println("interface");
	}
	
}




public class TestDemo implements TestInterface {
	
	@Override
	public void testMethod() {
		show();
		System.out.println("child");
	}
	
	
	 void show() {
		// TestInterface.super.testMethod();
	}
	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		t.testMethod();
	}
}