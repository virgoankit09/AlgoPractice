package problems;

import java.util.Arrays;

public class CheckSameStringJumbled {
	
	public static void main(String[] args) {
		String s1 = "ankit";
		String s2 = "knita";
		
		checkEqualStrings(s1,s2);
	}

	private static void checkEqualStrings(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		
		System.out.println(new String(c1).equals(new String(c2)));
	}
}
