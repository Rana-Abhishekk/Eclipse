
public class StringBufBuil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "meet";
		str = str + " me";
		System.out.println(str);
		StringBuffer strB = new StringBuffer("What if ");
		strB = strB.append("something");
		strB.append(" is happening");
		System.out.println(strB);
		
		// string builder
		
		StringBuilder strBl = new StringBuilder("strringBuilder");
		strBl.append(" is coming");
		System.out.println(strBl);
		System.out.println("Checking time for string Buffer");
		long startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			strB.append(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Time for string buffer:" + (endTime-startTime) + "ns");
		
		// check for string builder -- Takes less time than buffer 
		System.out.println("Checking time for string Builder");
       startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			strBl.append(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time for string builder:" + (endTime-startTime) + "ns");
		
		// check for string
		System.out.println("Checking time for string");
		 startTime = System.nanoTime();
			
			for(int i=0;i<10000;i++) {
				str = str + i;
			}
			endTime = System.nanoTime();
			System.out.println("Time for string :" + (endTime-startTime) + "ns");
		
		

	}

}
