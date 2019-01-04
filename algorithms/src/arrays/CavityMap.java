package arrays;

import java.util.Arrays;

public class CavityMap {

	static String[] cavityMap(String[] grid) {
        
		StringBuilder[] result = Arrays.stream(grid).map(str->new StringBuilder(str)).toArray(StringBuilder[]::new);
		
		for(int i=0;i<grid.length;i++) {
			result[i] = new StringBuilder(grid[i]);
		}
		
        for(int i = 0; i <result.length; i ++) {
             if(i==0 || i==result.length-1) {
                    continue;
                }
            for(int j = 0; j < grid.length;j++) {
                if( j==0 || j == grid.length-1) {
                    continue;
                } else if(
                    Integer.parseInt(Character.toString(grid[i-1].charAt(j))) < Integer.parseInt(Character.toString(grid[i].charAt(j))) &&
                    Integer.parseInt(Character.toString(grid[i].charAt(j-1))) < Integer.parseInt(Character.toString(grid[i].charAt(j))) &&
                    Integer.parseInt(Character.toString(grid[i+1].charAt(j))) < Integer.parseInt(Character.toString(grid[i].charAt(j))) &&
                    Integer.parseInt(Character.toString(grid[i].charAt(j+1))) < Integer.parseInt(Character.toString(grid[i].charAt(j))) &&
                    grid[i-1].charAt(j) != 'X' &&
                    grid[i].charAt(j-1) != 'X' &&
                    grid[i+1].charAt(j) != 'X' &&
                    grid[i].charAt(j+1) != 'X' 
                ) {
                    result[i].replace(j, j+1, "X");
                } else {
                    continue;
                }
            }
        }
        
        grid = Arrays.stream(result).map(str->str.toString()).toArray(String[]::new);
        
        return grid;
    }
	
	public static void main(String[] args) {
		
		String[] str = {"1112","1912","1892","1234"};
		
		StringBuilder[] sbb = Arrays.stream(str).map(s->new StringBuilder(s)).toArray(StringBuilder[]::new);
		
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println();
		
		str = cavityMap(str);
		for(String s : str) {
			System.out.println(s);
		}
	}
	
}
