package arrays;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {
	
	public static List<String> missingWords(String s, String t) {
	    // Write your code here
	    String [] words1 = s.split(" ");
	    String[] words2 = t.split(" ");
	    List<String> response = new ArrayList<>();
	    for(int i=0; i<words1.length; i++){
	        int flag =0;
	        for(int j=0; j<words2.length; j++){
	            if(words1[i].equals(words2[j]) && j<=i){
	                flag =1;
	                words2[j] = "";
	                break;
	            }
	        }
	            if(flag == 0){
	                response.add(words1[i]);
	            }
	        
	    }
	    return response;

}

	
	
	public static void main(String[] args) {
		List<String> output = missingWords("i like cheese i","cheese i");
		for(String s : output) {
			System.out.println(s);
		}
	}
	

}
