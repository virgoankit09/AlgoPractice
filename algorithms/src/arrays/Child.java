package arrays;

public class Child extends Parent {
	
	static int findDigits(int n) {
        int count = 0;
        int rem = n;
        while(rem != 0) {
            int digit = n%10;
            if(digit!=0) {
                if(n%digit ==0) {
                    count++;
                }
            }
            rem = rem/10;
        }

        return count;
    }
	
	public static void main(String[] args) {
		findDigits(1012);
	}
}

class GoodStudent {
	
	int id;
	public GoodStudent(int id) {
		this.id = id;
	}
	
}
