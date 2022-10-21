package streamapi;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 5).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Time taken in miliseconds :" + (end - start));
	}

}
