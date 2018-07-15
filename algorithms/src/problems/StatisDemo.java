package problems;

public class StatisDemo implements Human{
	static String url = "class";
	
	public static void main(String[] args) {
		
		Human d = new StatisDemo();
		System.out.println(d.url);
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		
	}
}

@FunctionalInterface
interface Human {

	String url = "interface";
	
	default void show() {
		System.out.println("show");
		
	}	
	
	default void show2() {
		System.out.println("show");
		this.show();
		
	}
	static void display() {
		System.out.println("display");
		
	}
	

	void doWork();

}