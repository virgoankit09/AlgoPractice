package arrays;

public class BinarySearch {
	static int counter = 0;
	static int binarySearch(int arr[], int search) {
		
		int length = arr.length;
		int low = 0;
		int high = length - 1;
		
		while(low <= high) {
			counter++;
			int mid = (low+high)/2;
			
			if(arr[mid] == search) {
				return mid;
			}
				
			if(arr[mid] < search) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,9,10};
		System.out.println(binarySearch(arr, 8));
		System.out.println(counter);
	}
	
}
