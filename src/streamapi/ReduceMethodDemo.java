package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
		
//		sum of list elements using stream api and maptoInt, sum method
		int sum = list.stream().mapToInt(num -> num).sum();
		System.out.println(sum);
		
//		alternate way of sum
		int sum2 = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum2);
		
//		using method referance
		int sum3 = list.stream().reduce(Integer::sum).get();
		System.out.println(sum3);
		
//		max
		int max = list.stream().reduce(Integer::max).get();
		System.out.println(max);
		
//		Few More Example of reduce method
		List<String> frameworks = Arrays.asList("spring", "springboot", "hibernate");
		
		String longestString = frameworks.stream()
				.reduce((s1, s2) -> (s1.length() > s2.length()) ? s1 : s2)
				.get();
		System.out.println(longestString);
	}

}
