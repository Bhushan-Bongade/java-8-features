package functionalintefacedemo;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
	
	@Override
	public boolean test(Integer t) {
		return false;
	}
	
	public static void main(String[] args) {
//		Using traditional method
//		PredicateDemo pd = new PredicateDemo();
//		System.out.println(pd.test(5));
		
//		Using anonymous object
//		Predicate<Integer> pd = new Predicate<>() {
//			public boolean test(Integer num) {
//				return true;
//			};
//		};
//		System.out.println(pd.test(5));
		
//		Using lambda function 
//		we don't need to implement a predicate interface to the current class
		Predicate<Integer> pd = (num) -> num % 2 == 0;
		System.out.println(pd.test(5));
	}
}

	
