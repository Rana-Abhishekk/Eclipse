import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Trial {
public static void main(String[] args) {
	int i= (int) Math.pow(10,10);
	int k =1000000000;
	List<Integer> aL = new ArrayList<>();
	List<Integer> lL = new LinkedList<>();
	List<Integer> vL = new Vector<>();
	 Stack<Integer> stack = new Stack<Integer>();
//	try {
//	for(int j = 0;j<i;j++) {
//		aL.add(j);
//	}
////	
////	for(int j = 0;j<i;j++) {
////		System.out.print(aL.get(i));
////		
////	}
//	}catch(OutOfMemoryError e) {
//		System.out.println(" AL couldn't handle the data ");
//	}
	 
//	 System.out.println("starting");
//	
//	
//		for(int j = 0;j<i;j++) {
//			if(j==10) {
//				System.out.println("level 1 start");
//			}
//			lL.add(j);
//			if(j==10000) {
//				System.out.println("level 1 complete");
//			}
//			if(j==1000000) {
//				System.out.println("level 2 complete");
//			}
//			if(j==100000000) {
//				System.out.println("level 13 complete");
//			}
//		}
//		System.out.println("ll done");
		
		
		
		
		
		//vl
//		 System.out.println("starting");
//			
//			
//			for(int j = 0;j<i;j++) {
//				if(j==10) {
//					System.out.println("level 1 start");
//				}
//				vL.add(j);
//				if(j==10000) {
//					System.out.println("level 1 complete");
//				}
//				if(j==1000000) {
//					System.out.println("level 2 complete");
//				}
//				if(j==100000000) {
//					System.out.println("level 13 complete");
//				}
//			}
//			System.out.println("ll done");
			
			//stack
			
			 System.out.println("starting");
				
				
				for(int j = 0;j<i;j++) {
					if(j==10) {
						System.out.println("level 1 start");
					}
					stack.add(j);
					if(j==10000) {
						System.out.println("level 1 complete");
					}
					if(j==1000000) {
						System.out.println("level 2 complete");
					}
					if(j==100000000) {
						System.out.println("level 13 complete");
					}
				}
				System.out.println("ll done");
//		for(int j = 0;j<i;j++) {
//			System.out.print(lL.get(i));
//			
//		}
		
	
//	try {
//		for(int j = 0;j<i;j++) {
//			vL.add(i);
//		}
//		System.out.println("vl done");
//
////		for(int j = 0;j<i;j++) {
////			System.out.print(vL.get(i));
////			
////		}
//		}catch(OutOfMemoryError e) {
//			System.out.println("Vectors couldn't handle the data ");
//		}
	
//	try {
//		for(int j = 0;j<i;j++) {
//			stack.add(i);
//		}
//		
////		for(int j = 0;j<i;j++) {
////			System.out.print(stack.get(i));
////			
////		}
//		System.out.println("stack done");
//
//		}catch(OutOfMemoryError e) {
//			System.out.println("stack couldn't handle the data ");
//		}
}
}
