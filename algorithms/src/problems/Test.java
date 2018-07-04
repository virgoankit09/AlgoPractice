package problems;

import java.util.Arrays;

interface i2 {
	
	 String str2="ankit";
	
}

class Test {
	
	public static void main(String[] args) {
		Color color1 = null;
		System.out.println(Arrays.asList(Color.values()));
		
		for(Color color: Color.values()) {
			System.out.println(color.name());
			System.out.println(color.getAction());
		}
	}
	
}

enum Color implements i2 {
	RED("rrr")	, GREEN, ORANGE;
	
	private String action;

	Color(String action) {
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}
	Color(){
		System.out.println("enum contructor");
	}
	int i =3;
	
	void show() {
		
		{
			int j = 0;
		}
		
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(show());
	}
}
