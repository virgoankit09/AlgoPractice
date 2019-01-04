package arrays;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TaumBDay {
	
	static BigDecimal taumBday(int b, int w, int bc, int wc, int z) {

		String s = "hello";
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		Integer.parseInt(Character.toString(s.charAt(0)));
		
        if(bc+z<wc) {
        	return new BigDecimal(b).multiply(new BigDecimal(bc)).add(
        			new BigDecimal(bc).add(new BigDecimal(z)).multiply(new BigDecimal(w)));
        } else if(wc+z<bc) {
        	return new BigDecimal(wc).add(new BigDecimal(z)).multiply(new BigDecimal(b)).add(new BigDecimal(w).multiply(new BigDecimal(wc)));
        } else {
        	return new BigDecimal(b).multiply(new BigDecimal(bc)).add(new BigDecimal(w).multiply(new BigDecimal(wc)));
        }

      
      
    }
	
	/*static String[] cavityMap(String[] grid) {
        String result[] = new String[grid.length];

        for(int i = 0; i <grid.length; i ++) {
             if(i==0 || i==grid.length-1) {
                    result[i] = grid[i];
                    continue;
                }
            StringBuilder sb = new StringBuilder();
            sb.re
            for(int j = 0; j < grid.length;j++) {
                if( j==0 || j == grid.length-1) {
                    sb.append(grid[i].charAt(j));
                } else if(
                    Integer.parseInt(Character.toString(grid[i-1].charAt(j))) < grid[i].charAt(j) &&
                    Integer.parseInt(Character.toString(grid[i].charAt(j-1))) < grid[i].charAt(j) &&
                    Integer.parseInt(Character.toString(grid[i+1].charAt(j))) < grid[i].charAt(j) &&
                    Integer.parseInt(Character.toString(grid[i].charAt(j+1))) < grid[i].charAt(j) 
                ) {
                    sb.append("X");
                    continue;
                } else {
                    sb.append(grid[i].charAt(j));
                }
            }
            result[i] = sb;
        }
        return result;
    }
    */
	
	public static void main(String[] args) {
		//System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
		//StringBuilder[] s = Arrays.stream(args).map(str->new StringBuilder(str)).collect(Collectors.toList()).toArray();
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.replace(1, 2, "a"));
	}

}
