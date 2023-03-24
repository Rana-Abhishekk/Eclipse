
public class Functional {
	@FunctionalInterface
	interface Func{
		void run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if the interface is not functional then we will have to make a class that implements interface Func and define the run method in that class the we will make a object of 
		// the class and invoke run() this can be easily done with annonymous inner class and lamda function
		
		Func obj = () ->{
			// this is the defined method
			System.out.println("Something in the dark");
			
		};
		obj.run();
		

	}

}
