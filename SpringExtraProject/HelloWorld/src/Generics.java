import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
	public static void fun(List<? extends Number> li) {
		Double sum =0.0;
		for(Number i : li) {
			sum += i.doubleValue();
		}
		System.out.println(sum);
		
		
	}
	public static void fun2(List<Object> li) {
		Double sum =0.0;
		for(Object i : li) {
			sum += ((Number) i).doubleValue();
		}
		System.out.println(sum);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> li = Arrays.asList(4, 5, 6, 7);
		 List<Double> li2 = Arrays.asList(4.5,5.6, 6.3, 7.9);
		
		fun(li);
		fun(li2);
		
		fun2(li);  // not working
		fun2(li2);  

	}

}
