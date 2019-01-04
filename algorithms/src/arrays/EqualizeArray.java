package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EqualizeArray {

	
	static int equalizeArray(int[] arr) {
		
		Map<Integer, Integer> map = populateMap(arr);
		
		List<Entry<Integer, Integer>> list  = new ArrayList<>(map.entrySet());
		Collections.sort(list, new ArrayComparator().reversed());
		int max = list.get(0).getValue().intValue();
		int size = arr.length;
		return size - max;
    }
	
	static Map<Integer, Integer> populateMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: arr) {
			if(map.get(i) != null) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		int []arr = {3, 3, 2,2,2,2, 1,1, 3};
		equalizeArray(arr);
		
	}
	
}


class ArrayComparator implements Comparator<Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
	
}