package streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {
//		Sorting a map
		Map<String, Integer> map = new HashMap<>();
		map.put("five", 5);
		map.put("four", 4);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

//		Sorting a map using collections sort method with comparator
//		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

//		for (Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}

//		Sorting a map using stream api
//		map.entrySet().stream().sorted((o1, o2) -> o1.getValue() - o2.getValue()).forEach(System.out::println);
//		This both are same
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//		Custom map sorting
		Map<Employee, Integer> treemap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		treemap.put(new Employee(1, "Bhushan", "A", 35000), 22);
		treemap.put(new Employee(2, "Aniruddha", "A+", 35000), 22);
		treemap.put(new Employee(3, "Sumit", "A++", 40000), 22);
		treemap.put(new Employee(4, "Suyog", "A+", 40000), 22);
		treemap.put(new Employee(5, "Arpit", "A++", 35000), 22);
		treemap.put(new Employee(6, "Rushikesh", "A++", 40000), 22);
		treemap.put(new Employee(7, "Adesh", "A", 35000), 22);
		
		System.out.println(treemap);
		
		treemap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
		.forEach(System.out::println);
	}

}
