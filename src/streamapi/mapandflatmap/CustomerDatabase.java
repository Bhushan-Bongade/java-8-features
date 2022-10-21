package streamapi.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

	public static List<Customer> getCustomer() {
		return Stream
				.of(new Customer(1, "Bhushan", "bhushanxyz@gmail.com", Arrays.asList(96333, 86259)),
						new Customer(2, "Aniruddha", "aniruddha@gmail.com", Arrays.asList(96333, 86259)),
						new Customer(2, "Suyog", "suyog@gmail.com", Arrays.asList(96333, 86259)))
				.collect(Collectors.toList());
	}
}
