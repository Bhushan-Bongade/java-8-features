package streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	public static List<Employee> getEmployee() {
		return Stream.of(
                new Employee(1, "Bhushan", "A", 35000),
                new Employee(2, "Aniruddha", "A+", 35000),
                new Employee(3, "Sumit", "A++", 40000),
                new Employee(4, "Suyog", "A+", 40000),
                new Employee(5, "Arpit", "A++", 35000)
        ).collect(Collectors.toList());

	}
}
