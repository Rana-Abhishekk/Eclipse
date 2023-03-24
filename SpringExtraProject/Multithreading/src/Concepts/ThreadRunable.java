package Concepts;
class MyThreadRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is the child thread");
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class ThreadRunable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRun tR = new MyThreadRun();
		Thread t = new Thread(tR);
		t.run();
		t.start();
		tR.run(); // no new thread is created
		System.out.println("--> Main Thread");
		System.out.println(Thread.currentThread().getName());
	}

}
