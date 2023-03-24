
public class UseStatic { // top level class can't be nested
	public void fn(int val) {
		System.out.println("This is a function with value:" + val);
	}
	static int age; // static variable can work as a global variable
	static public void fnS(int val) {
		System.out.println("This is a function with value:" + val);
	}
	static int n =30;
	 public static class NewClass{
		static final int id = 35;
		int id1 = 63;
		 NewClass(){
			 //System.out.println(n);
			 System.out.println(id);
		 }
	 }

	public static void main(String[] args) { // by removing static in mai function the file doesn't run
		// TODO Auto-generated method stub
	//	fn(5); // will give an error if it calls a non-static fn
	//	fnS(5); // will work as fn is static
	//	System.out.println(n); // can't make a non static reference from static class
	//	n=34; // changing static variable
		//System.out.println(n);
		NewClass obj = new NewClass();
		NewClass obj1 = new NewClass();
		// obj.id = 50;
		obj1.id1=60;
		System.out.println(obj.id);
		System.out.println(obj1.id);
		System.out.println(obj1.id1);
		System.out.println(obj.id1);
		
	}

}
