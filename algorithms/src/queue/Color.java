package queue;

enum Test 
{ 
    RED, GREEN, BLUE; 
	
	private Test() {
		System.out.println("COns");
	}
	
	
} 

class Color {
	public static void main(String[] args) {
		System.out.println(Test.RED);
	}
}