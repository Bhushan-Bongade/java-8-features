package functionalintefacedemo;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
	
	@Override
	public String get() {
		return "I am Bhushan";
	}

	public static void main(String[] args) {
//		Using traditional method
//		SupplierDemo sd = new SupplierDemo();
//		System.out.println(sd.get());
		
		
//		Using anonymous object
//		Supplier<String> sup = new Supplier<>() {
//			@Override
//			public String get() {
//				return "I am Bhushan";
//			};
//		};
//		System.out.println(sup.get());
		
//		Using lambda function
//		we don't need to implement a supplier interface to the current class
		Supplier<String> sup = () -> "I am Bhushan";
		System.out.println(sup.get());
	}

}
