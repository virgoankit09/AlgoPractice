package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] array = list.stream().mapToInt(i->i).toArray();
	}

}
