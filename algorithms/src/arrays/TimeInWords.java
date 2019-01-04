package arrays;

public class TimeInWords {

	static String timeInWords(int h, int m) {
		StringBuilder s = new StringBuilder();
		
		String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		String[] tens = {"ten", "twenty", "half", "forty", "fifty"};
		
		if(m == 0) {
			s.append(ones[(h%10)-1]).append(" o' clock");
		} 
		
		return s.toString();
    }
	
	static String toWords(int n) {
		StringBuilder sb = new StringBuilder();
		String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tens = {"ten", "twenty", "thirty", "forty", "fifty","sixty","seventy","eighty","ninety"};
		String[] teens = {"eleven" , "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		if(n == 0 ) {
			return "zero";
		} else {
			if(n/10 == 0) {		//1-9
				sb.append(ones[(n%10)-1]);
			} else if (n%10 == 0 ) {	//10-20-30....-90
				sb.append(tens[(n/10)-1]);
			} else if (n/10 == 1){
				sb.append(teens[(n%10)-1]);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(toWords(18));
	}
	
}
