
public class CountDigitsInNumber {

	static void countDigits(int number) {

		int n = number;
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}

		System.out.println(count);

	}

	static int countDigitsRecursive(int n) {
		
		if(n==0) return 0;
		
		//System.out.println(n);

		return 1+ countDigitsRecursive(n/10);
	}
	
	static int countDigit(long n)
    {
        return (int)Math.ceil(Math.log10(n));
    }

	public static void main(String[] args) {
		System.out.println(countDigit(00450));
	}

}
