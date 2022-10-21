package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
	
	public static void main(String[] args) {
//		List of Integer data type
		List<Integer> list = new ArrayList<>();
		list.add(51);
		list.add(1);
		list.add(5);
		list.add(63);
		list.add(7);
		list.add(21);
		list.add(33);

//		Sort Using traditional method
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
		
//		Sort Using stream api
//		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		
//		List of employee data type
		List<Employee> employees = EmployeeDatabase.getEmployee();
		
		employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);
		
	}
}