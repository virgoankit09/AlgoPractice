package queue;

import java.util.ArrayList;
import java.util.List;

public class ListBoxing {
	
	
	void add(Animal list) {
		
	}
	
	public static void main(String[] args) {
		
		List<Cat> list = new ArrayList<>();
		
		list.add(new Cat());
		
		new ListBoxing().add(new Cat());
		
	}
	

}


class Animal {
}

class Cat extends Animal {
}