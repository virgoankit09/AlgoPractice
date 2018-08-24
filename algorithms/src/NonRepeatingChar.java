import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class CountIndex {
	
	int index;
	int count;
	public CountIndex(int index) {
		super();
		this.index = index;
		this.count = 1;
	}
	
	void incCount() {
		this.count++;
	}
	
	int getCount() {
		return this.count;
	}
	
}

public class NonRepeatingChar {
	
	static char findNonRepeatingCharInArray(List<Character> chars) {
		
		HashSet<Character> charSet = new HashSet<>();
		
		chars.stream()
			.filter(c-> !charSet.add(c))
			.forEach(System.out::println);
		
		return 'a';
	}
	
	static void findNonRepeatingCharInArray2(List<Character> chars) {
		
		HashMap<Character, CountIndex> hm = new HashMap<>();
		
		for(int i = 0; i< chars.size(); i++) {
			
			if(hm.containsKey(chars.get(i))) {
				hm.get(chars.get(i)).incCount();
			} else {
				hm.put(chars.get(i), new CountIndex(i));
			}
		}
		int result = Integer.MAX_VALUE;
		for(int i = 0; i< chars.size(); i++) {
			
			if(hm.get(chars.get(i)).getCount() == 1 && result > hm.get(chars.get(i)).index) {
				result = hm.get(chars.get(i)).index;
			}
			
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		findNonRepeatingCharInArray2(List.of('a','a','b','f','r','d','b','d','r','g'));		
		
	}
	
}
