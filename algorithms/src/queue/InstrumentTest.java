package queue;

import java.util.ArrayList;
import java.util.List;

public class InstrumentTest {
	
	public static void main(String[] args) {
		
		List<? extends Instrument> list = new ArrayList<Guitar>();
		//list.add(new Guitar());
		//list.add(new Voilin());
		//Object o;
	}
	
}


interface Instrument {
	void play();
	
}


class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Guitar");		
	}
}


class Voilin implements Instrument {

	@Override
	public void play() {
		System.out.println("Voilin");
	}
	
	
}