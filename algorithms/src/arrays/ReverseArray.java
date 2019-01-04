package arrays;

public class ReverseArray {
	
	static int[] reverseArray(int[] a) {
		
		int  loop = a.length/2;
		int size = a.length-1;
		
		for(int i=0; i<loop;i++) {
			a[i] = a[i] + a[size-i];
			a[size-i] = a[i] - a[size-i];
			a[i] = a[i] - a[size-i];
		}
		
		return a;
		
    }
	
	/*public static void reverse(int a, int b) {
		a=a+b;
		System.out.println(a);
		b=a-b;
		System.out.println(b);
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}*/

	public static void main(String[] args) {
		
		int arr[] = {2,4,-5,6,-8,10,-14};
		arr = reverseArray(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		//System.out.println("-------------");
		//reverse(2, -8);
	}
}
