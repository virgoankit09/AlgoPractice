package algorithms.recursive;

public class Algorithm {

	static int sum(int n) {
		
		if(n==1) return 1;
		
		return n+sum(n-1);
	}
	
	
	static int factorial(int n) {
		
		if(n==1) return 1;
		
		return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(4));
		System.out.println(factorial(6));
	}
	
}
