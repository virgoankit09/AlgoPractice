package problems;

public class ThreadLocalDemo2 {

	
	public static void main(String[] args) {
		
		MyRunnable2 r1 =  new MyRunnable2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
	}
}


class MyRunnable2 implements Runnable {
	
	//private static ThreadLocal<Integer> num = new ThreadLocal<>().withInitial(()->new Integer(0));
	
	private Friend friend = new Friend();
	
	@Override
	public void run() {
		friend.show();
	}
	
}

class Friend {
	
	private int num;
	
	void show() {
		while(num <= 5) {
			++num;
			System.out.println(num);
			
		}
	}
	
}
