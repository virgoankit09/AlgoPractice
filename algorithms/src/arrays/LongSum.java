package arrays;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class LongSum {
	
static void plusMinus(int[] arr) {
        
        double n = arr.length;
        int negative = 0;
        int positive = 0;
        int zero = 0;
        
        for(int i=0;i<n;i++) {
            if(arr[i]<0) {
                negative++;
            } else if(arr[i]>0) {
                positive++;
            } else {
                zero++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        df.setRoundingMode(RoundingMode.CEILING);
        double d = 4/3.0;
        System.out.println(df.format(d));
    }
	
	public static void main(String[] args) {
		
		long[] input = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		
		long sum = 0;
		
		for(long l : input) {
			sum = sum + l;
		}
		
		//System.out.println(sum);
		
		float f = 2/3;
		//System.out.println(f);
		int inp[] = {-4, 3, -9, 0, 4, 1};
		Arrays.sort(inp);
		for(int i:inp) {
			System.out.println(i);
		}
		plusMinus(inp);
	}
	
}
 