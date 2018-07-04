package problems;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPractice {

	void display( ) {
		Animal a = () -> {
			System.out.println(getClass().getSimpleName());
			System.out.println("Hey");
		};
		a.show();
	}
	
	public static void main(String[] args) {
		
		//new LambdaPractice().display();
		//final int i = 0;
		Animal a = new Animal() {
			
			@Override
			public void show() {
				System.out.println(getClass().getSimpleName());
				// TODO Auto-generated method stub
				
			}
		};
		a.show();
		int j=2;
		Animal a1 = ()->System.out.println(j);
		List list = null;
		Consumer c=null;
		Predicate p;
		list.forEach(c);
	}
	
}

interface Animal {
	
	 void show();
	
}