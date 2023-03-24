interface First{
	public void run();
	public void rest();
}
class Myclass implements First{
	public void run() {
		System.out.println("running");
	}
	public void rest() {
		System.out.println("resting");
	}
}
class Yourclass extends Myclass{
	public void run() {
		System.out.println("running in your class");
	}
}
public class Prac {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass obj = new Yourclass(); // refrence of parent and obj of child will mean the overiding occurs if same methods are there
		// Yourclass obj2 = new Myclass();  //-- doesn't work
		obj.run();
		obj.rest();
		
		
	}

}

//class Base{
//	Base(){
//		System.out.println("This is the base class ");
//	}
//}
//
//class Sub extends Base{
//	// super() --> giving error put it in aconstructor
//	Sub(){
//		super();
//		System.out.println("This is the sub class");
//		
//	}
//	
//}
