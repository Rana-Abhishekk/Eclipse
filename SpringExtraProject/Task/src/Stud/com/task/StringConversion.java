package Stud.com.task;

import java.util.Arrays;
import java.util.List;

public class StringConversion {
     
   public static void main(String[] args) {
//	   String[] s = new String[] {"Abhishek","rahul","kartikhey"};
//	      List<String> li  = Arrays.asList(s);
//	      StringBuilder str = new StringBuilder();      
//	      for(String st : li) {
//	    	  str.append(st);
//	    	  str.append(",");
//	      }
//	      String res = str.toString();
//	      System.out.println(str);
//	      String[] conv = res.split(",");
//	      List<String> strL = Arrays.asList(conv);
//	      System.out.println(strL);
//	      System.out.println(strL.get(2));
	
	 List<Integer> li = Arrays.asList(1,2,2,3,3,4,4);
	 for(int i=li.size()-1;i>=0;i++) {
		 if(li.get(i)==li.get(i-1)) {
			 li.remove(i);
		 }
	 }
	 System.out.println(li.get(3));
}

}
