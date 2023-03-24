package Concepts;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Inside the Child Thread");
		}
		Thread.currentThread().getPriority();
		System.out.println(Thread.currentThread().getName());
	
	}
}


public class MultiThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		t.run() ;// no thread is created as run in t.start() do some internal functions like registration in thread schedulder
		
		Thread.currentThread().setName("Ho Ho hO");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().getPriority();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		Thread.currentThread().getPriority();
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("This is the main fn");
		}
		
		
		
		

	}

}
