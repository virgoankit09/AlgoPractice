package queue;

public class ColorTest {
	
	
	public static void main(String[] args) {
		Colors red = Colors.RED;
		
		System.out.println(red);
	}
	
}


enum Colors {
	
	RED("Red COlor"),
	GREEN("Green color"),
	BLUE("Blue Color");
	
	private String displayName;

	private Colors(String s) {
		this.displayName = s;
	}
	
	public String toString() {
		return displayName;
	}
	
}
