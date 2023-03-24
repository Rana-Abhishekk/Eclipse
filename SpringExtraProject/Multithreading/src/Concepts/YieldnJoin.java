package Concepts;

class MyThreadYJ extends Thread{
	public void run(){
		//Thread.yield();  // if we comment this line both thread prints simultanoudly but in case of yield everytime it give control to main thread
/*		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	*/
	    for (int i = 0; i < 8; i++) {
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("This must be the child thread  --> " + Thread.currentThread().getName());
		}
		
		
	    
		
	}
}

public class YieldnJoin {
	public static void main(String[] args) throws InterruptedException {
		MyThreadYJ t = new MyThreadYJ();
		MyThreadYJ t2 = new MyThreadYJ();
		t.start();
		t2.start();
		for (int i = 0; i <5; i++) {
			System.out.println(Thread.currentThread().getName());
			t.join(3000);
			System.out.println("This is the main Thread");
		}
	}
}
