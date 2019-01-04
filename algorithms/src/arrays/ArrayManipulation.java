package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayManipulation {
	
	static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];

        int length = queries.length;

        for(int i=0;i<length;i++) {
            int[] tmp = queries[i];

            int a = tmp[0];
            int b = tmp[1];
            int k = tmp[2];

            for(int j=a-1;j<b;j++) {
                arr[j] = arr[j]+k;
            }

        }
        return Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
//        return findMax(arr,arr.length-1);

    }
	
	static long findMax(long arr[], int n) {

        if(n==0) return arr[0];
        
        return Math.max(arr[n], findMax(arr,n-1));

    }
	
	public static void main(String[] args) {
		int arr[][] = {{1,3,5},{2,5,6},{2,5,7}};
		arrayManipulation(5,arr);
	}

}
