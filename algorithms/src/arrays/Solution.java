package arrays;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
    	 String arr[] = s.split(":");
         int hour = Integer.parseInt(arr[0]);
         String min = arr[1];
         String sec = arr[2].substring(0,2);

         if(s.contains("PM") && hour < 12) {
             hour = hour+12;
         } else if(s.contains("AM") && hour == 12) {
             hour = 0;
         }
         System.out.println(String.format("%02d" , hour)+" "+min+" "+sec);
         return hour+":"+min+":"+sec;
       
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        timeConversion("07:05:45AM");
    }
}
