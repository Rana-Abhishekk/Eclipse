package stream;

import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(new Integer[] {1,2,3,5,6,7});
		s.forEach(p-> System.out.println(p));
	}

}
