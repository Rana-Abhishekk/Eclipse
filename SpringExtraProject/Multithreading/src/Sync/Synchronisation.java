package Sync;

class Display{
	
   public static synchronized void displayM(String name) { //class lock
	  for (int i = 0; i < 5; i++) {
		System.out.println("good mrng - " + name);
	} 
   }
   public void disp() {
	   System.out.println("This is where lengends are made");
   }
	
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
		
	}
	
	public void run() {
		d.displayM(name);
		d.disp();
	}

			
			
	
	
}

public class Synchronisation {

	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		MyThread t= new MyThread(d,"Ravi");
		
		System.out.println(Thread.currentThread().isDaemon());
		
		MyThread t2 = new MyThread(d2,"Shastri");
		t.start();
		
		
		System.out.println(Thread.currentThread().isDaemon());
		t2.start();
	}

}
