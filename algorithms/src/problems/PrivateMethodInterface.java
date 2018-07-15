package problems;

public class PrivateMethodInterface {

	public static void main(String[] args) {
		new three().show();
	}
	
}


interface one {
	
	static void show() {
		System.out.println("one");
	}
	
}

interface two {
	
	
}

class three implements one,two {


	void show() {
		
		System.out.println("three");
	}
	void display() {
		show();
	}
	
}