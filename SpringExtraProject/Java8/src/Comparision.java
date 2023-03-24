import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Comparision {

	public Comparision() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0;i<=50;i++) {
			total += i;
			
		}
		System.out.println("Total:" + total);

		
		// java 8
		int t= IntStream.rangeClosed(1, 50)
				.map(Integer :: new).sum();
		
		System.out.println(t);
		
List<String> names = Arrays.asList("Sam","Peter","Billings","Sam");
		
		//Before
		List<String> uniqueList = new ArrayList<>();
		for(String name : names) {
			if(!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		System.out.println("Unique List 1 :"+uniqueList);
		
		//After
		List<String> unique = names.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Unique in java 8 :"+unique);
	}

}
