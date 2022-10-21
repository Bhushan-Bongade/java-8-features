package streamapi;

import java.util.List;

public class FilterMapReduceInOneDemo {
	public static void main(String[] args) {
		List<Employee> list = EmployeeDatabase.getEmployee();
		double average = list.stream()
				.filter(employee -> employee.getSalary() > 3.5)
				.mapToDouble(employee -> employee.getSalary())
				.average()
				.getAsDouble();
		System.out.println(average);
	}
}
