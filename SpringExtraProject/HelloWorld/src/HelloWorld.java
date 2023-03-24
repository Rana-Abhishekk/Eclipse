
import java.util.*;

public class HelloWorld {
	public static long getT(List l,boolean val) {
		if(val==true) l.set(8600,566);
		else l.get(8600);
		return System.nanoTime();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box cuboid = new Box(15,20,25);
		System.out.println(cuboid.breadth);
		System.out.println(cuboid.length);
		System.out.println(cuboid.height);
		
		
		/*
		 * //Arrayl
		 List<Integer> lis = new ArrayList<Integer>();
		 
		for(int i=0;i<10000;i++) {
			lis.add(i+40);
		}
		
		// linked list 
				LinkedList<Integer> ll = new LinkedList<Integer>();
				for(int i=0;i<10000;i++) {
					ll.add(i+40);
				}
		// send true in param for manipulation
	    // lis_man
		long startTime = System.nanoTime();
		System.out.println("Li_man_T is : " + (getT(lis,true)- startTime) + "ns");
		
		// LL man
		startTime = System.nanoTime();
		System.out.println("LL_man_T is : " + (getT(ll,true) - startTime) + "ns");
		
		// lis_ser
		startTime = System.nanoTime();
		System.out.println("Li_ser_T is : " + (getT(lis,false) - startTime) + "ns");
		
		//LL_ser
		startTime = System.nanoTime();
		System.out.println("LL_ser_T is : " + (getT(ll,false) - startTime) + "ns");
		
		*/

				
	}

}

class Box{
	int length;
	int breadth;
	int height;
	Box(){
		System.out.println("This is a box");
	}
	// parameterised
	Box(int length,int breadth,int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		
	}
	Box(int length){
		this.length = length;
	}
}

