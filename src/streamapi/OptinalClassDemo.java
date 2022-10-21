package streamapi;

import java.util.Arrays;
import java.util.Optional;

import streamapi.mapandflatmap.Customer;
import streamapi.mapandflatmap.CustomerDatabase;

public class OptinalClassDemo {
	
	public static Customer getCustomerEmail(String email) {
		return CustomerDatabase.getCustomer()
				.stream()
				.filter((obj) -> obj.getEmail().equals(email))
				.findAny()
				.orElse(new Customer());
	}

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(1, "Bhushan", null, Arrays.asList(333, 444));
		
//		empty
//		of
//		ofNullable
		
//		empty demo
		Optional<String> option = Optional.empty();
		System.out.println(option);

//		of demo
//		it will throw an exception if the value is null
//		Optional<String> optionalOf = Optional.of(customer.getEmail());
//		System.out.print(optionalOf);
		
//		ofNullable 
		Optional<String> optionalOfNullable = Optional.ofNullable(customer.getEmail());
//		Using if-else statement
//		if (optionalOfNullable.isPresent())
//			System.out.println(optionalOfNullable);
//		else 
//			System.out.println("Null object found");
//		shorthand of if-else
		System.out.println(optionalOfNullable.orElse("Null object found"));
//		throw custom exceptions
//		System.out.println(optionalOfNullable.orElseThrow(() -> new Exception("Not found email")));
//		orElse show default value
		System.out.println(optionalOfNullable.map(String::toUpperCase).orElseGet(() -> "default email..."));
		
//		finding email in our database
		System.out.println(getCustomerEmail("bhushanxyz@gmail.com"));
	}

}
