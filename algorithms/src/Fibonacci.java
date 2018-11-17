
public class Fibonacci {
	
	static int[] fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n];
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i < n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
    
    for(int j : f) System.out.println(j);
    
    return f;
    }
	
	static double fib2 (int n) {
		  double A=(1+Math.sqrt(5))/2;
		   double   B=(1-Math.sqrt(5))/2;
		    double  fib = (Math.pow(A,n) - Math.pow(B,n)) / Math.sqrt(5);
		      return Math.ceil(fib);
		}
      
    public static void main (String args[])
    {
        int n = 1474;
        System.out.println(fib2(n));
        
        int a[] = new int[] {2,3};
        System.out.println(a.length);
    }
	
}
