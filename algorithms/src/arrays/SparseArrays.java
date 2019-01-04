package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SparseArrays {
	
	static int[] matchingStrings(String[] strings, String[] queries) {
		
		List<String> list= Arrays.stream(strings).collect(Collectors.toList());
		
		return Arrays.stream(queries).mapToInt(str-> Collections.frequency(list, str)).toArray();
		
    }
	
	static int[] matchingStrings2(String[] strings, String[] queries) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(String s: queries) {
			map.put(s, 0);
		}
		
		for(String s: strings) {
			if(map.get(s) != null) {
				map.put(s,map.get(s)+1);
			}
		}
		
		return map.values().stream().mapToInt(i->i).toArray();
		
    }
	
	public static void main(String[] args) {
		String[] arr = {"ab","abc","ab"};
		String[] queries = {"ab","abc"};
		int[] a = matchingStrings2(arr, queries);
		for(int i: a) {
			System.out.println(i);
		}
	}

}
