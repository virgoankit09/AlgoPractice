package arrays;

public class NumberReverse {
	
	static int beautifulDays(int i, int j, int k) {

		
		
		return 0;
    }
	
	
	static void findReverse(int num) {
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		int i = Integer.parseInt(sb.reverse().toString());
		System.out.println(i);
		
	}
	
	static void isSquareNumber(int n) {
		double d = Math.sqrt(n);
		if(d-Math.floor(d) != 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
	
	public static void main(String[] args) {
		//findReverse(43);
		isSquareNumber(40);
		
	}

}
