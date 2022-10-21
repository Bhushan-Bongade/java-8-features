package functionalintefacedemo;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
	
	@Override
	public void accept(Integer number) {
		System.out.print(number % 2);
	}
	
	public static void main(String[] args) {
//		Using traditional method
//		 ConsumerDemo cd = new ConsumerDemo(); 
//		 cd.accept(55);
		 
		
//		Using anonymous object
//		Consumer<Integer> consumer = new Consumer<>() {
//			@Override
//			public void accept(Integer num) {
//				System.out.println(num);
//			};
//		};
//		
//		consumer.accept(55);
		
//		Using lambda function
//		we don't need to implement a consumer interface to the current class
		Consumer<Integer> consumer = (num) -> System.out.println(num);
		consumer.accept(55);
	}
}
