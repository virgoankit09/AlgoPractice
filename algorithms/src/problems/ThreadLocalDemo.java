package problems;

public class ThreadLocalDemo {

	
	public static void main(String[] args) {
		
		MyRunnable r1 =  new MyRunnable();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
	}
}


class MyRunnable implements Runnable {
	
	private int num;
	
	@Override
	public void run() {
		while(num <= 5) {
			++num;
			System.out.println(num);
			
		}
	}
	
}