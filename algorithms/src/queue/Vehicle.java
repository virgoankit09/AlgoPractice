package queue;

import java.util.ArrayList;

public class Vehicle {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(new Car());
		
		ArrayList b = a;
		ArrayList c = (ArrayList) b;
		
		c.add(new Bus());
		
		for(Object o: b) {
			System.out.println(o);
		}
		
	}
}


class ParentVehicle{

	
	
}



class Bus extends ParentVehicle {
	
}

class Car extends ParentVehicle {
	
}

