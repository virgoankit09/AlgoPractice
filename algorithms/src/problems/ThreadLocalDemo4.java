package problems;

public class ThreadLocalDemo4 {

	
	public static void main(String[] args) {
		MyRunnable5 r1 =  new MyRunnable5();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
	}
}


class MyRunnable5 implements Runnable {
	
	//private static ThreadLocal<Integer> num = new ThreadLocal<>().withInitial(()->new Integer(0));
	
	private Friend2 friend = new Friend2();
	
	@Override
	public void run() {
		friend.show();
	}
	
}

class Friend2 {
	
private static ThreadLocal<Integer> num = new ThreadLocal<>().withInitial(()->new Integer(0));
	
	public void show() {
		while(num.get() <= 5) {
			num.set(num.get()+1);
			System.out.println(num.get());
			//num.remove();
		}
	}
	
}
