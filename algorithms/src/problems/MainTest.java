package problems;

public class MainTest {

	
	public static void main(String[] args) {
		A a = new A();
		I.fun();
		a.fun();
		B.fun();
		
	}
	
}

interface I {
	
	static void fun() {
		System.out.println("printing in interface");
	}
}

class A implements I {
	static void fun() {
		System.out.println("printing in A");
	}
}

class B implements I {
	static void fun() {
		System.out.println("printing in B");
	}
}
