package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	
	static int[] leftRotate(int[] arr, int d) {
		
		for(int i=0;i<d;i++) {
			arr = leftRotateByOne(arr);
		}
		
		List<Integer> nums = new ArrayList<>();
		
		int arrr[] = nums.stream()
				.mapToInt(i->i.intValue()).toArray();
		
		return arr;
	}
	
	static int[] leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		return arr;
	}

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		leftRotate(arr, 4);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
}
