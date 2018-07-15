
public class PrivateTest {

	
	
}


interface Test {
	
	default void show() {
		System.out.println("show");
		privateMethod();
	}
	
	private void privateMethod() {
		System.out.println("private");
	}
	
}

class TestChild implements Test {
	
	
	
	
}