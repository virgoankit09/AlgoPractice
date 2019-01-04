package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {
	
	 static int[] cutTheSticks(int[] arr) {

	        int[] result = new int[findUniqueCount(arr)];
	        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	        for(int i=0; i<result.length; i++) {
	            result[i] = list.size();
	            int min = findMinimum(list.stream().mapToInt(z->z).toArray(), list.size()-1);
	            list = list.stream().filter(num->num!=min).map(num->num-min).collect(Collectors.toList());
	        }
	        return result;
	    }

	    static int findMinimum(int[] arr, int n) {
	        if (n == 0) return arr[0];

	        return Math.min(arr[n], findMinimum(arr, n-1));
	    }

	    static int findUniqueCount(int[] arr) {
	        return Arrays.stream(arr).boxed().collect(Collectors.toSet()).size();
	    }
	
	public static void main(String[] args) {
		int[] num = {5, 4, 4, 2, 2, 8};
		int arr[] = cutTheSticks(num);
		
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
