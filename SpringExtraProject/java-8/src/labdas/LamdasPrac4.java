package labdas;

public class LamdasPrac4 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			System.out.println("inside runnable");
		};
		Thread t = 	new Thread(r);
	t.start();
	for(int i=0;i<20;i++) {
	System.out.println(t.currentThread().getName());
	}
	
	    
	}
}
