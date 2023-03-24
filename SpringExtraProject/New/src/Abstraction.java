interface Print{  
void print();  
}  
interface Show{  
void print();  
}  
class A implements Print,Show{  
	A(){
		System.out.println("---In A");
	}
  public void print(){
	  System.out.println("this is a printStatement");
  }
public void show(){System.out.println("Welcome");}  
}

class B extends A{
	B(){
		System.out.println("This is B");
	}
}

  


public class Abstraction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();  
 	obj.print();  
//		obj.show(); 
		B objB = new B();
		

	}

}
