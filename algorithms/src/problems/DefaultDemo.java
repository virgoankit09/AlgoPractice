package problems;

public interface DefaultDemo {

	public static void main(String[] args) {
		Mammal m = new Mammal() {
		};
		
		m.show();
	}
	
}

interface Mammal {

	default void show() {
		System.out.println("default");
	}
	
	
}