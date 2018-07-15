package problems;

public class ThreadLocalDemo3 {

	
	public static void main(String[] args) {
		
		MyRunnable4 r1 =  new MyRunnable4();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
	}
}


class MyRunnable4 implements Runnable {
	
	private static ThreadLocal<Integer> num = new ThreadLocal<>().withInitial(()->new Integer(0));
	
	@Override
	public void run() {
		while(num.get() <= 5) {
			num.set(num.get()+1);
			System.out.println(num.get());
			
		}
	}
	
}