package arrays;

public class ArraySum {
	
	static int findSum(int arr[]) {
		
		int n = arr.length;
		
		return findArrSum(arr,n-1);
		
	}
	
	static int findArrSum(int []arr, int n) {
		
		if(n<0) return 0;
		
		return arr[n]+findArrSum(arr, n-1);
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,6,7,9,2};
		
		int sum = findSum(arr);
		System.out.println(sum);
	}

}
