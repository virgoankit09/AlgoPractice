package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MinimumDistances {

	
	static int minimumDistances(int[] a) {

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> finalMap = new HashMap<>();
        for(int i = 0; i< a.length; i++) {

            if(map.get(a[i]) == null) {
                map.put(a[i],i);
            } else {
                	finalMap.put(a[i], i-map.get(a[i]));
            }

        }

        List<Entry<Integer,Integer>> list = new ArrayList<>(finalMap.entrySet());
        Collections.sort(list, new ArrayComparator());
        
        return list.size() > 0 ? list.get(0).getValue().intValue():-1;
    }
    
	public static void main(String[] args) {
		int a[] = {7, 1, 3, 4, 1, 7};
		System.out.println(minimumDistances(a));
	}
	
}
