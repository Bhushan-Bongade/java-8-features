package streamapi.mapandflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers = CustomerDatabase.getCustomer();
		
//		converting List<Customer> to List<String> i.e email's it is called data transformation
//		mapping : customer -> customer.getEmail() one to one mapping as one customer has one email
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
//		mapping : customer -> customer.getPhoneNumber() one to many mapping as one customer more than one number
		List<List<Integer>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
//		converting List<Customer> to List<Integer>
//		mapping : customer -> customer.getPhoneNumber() one to many mapping with flattering
		List<Integer> phones = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(phones);
	}

}
