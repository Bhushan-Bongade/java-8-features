package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
//		Filter is used for if-else condition in stream api
//		For list data structure
		List<String> list = new ArrayList<>();
		
		list.add("Arpit");
		list.add("Bhushan");
		list.add("Aniruddha");
		list.add("Sumit");
		list.add("Suyog");
		list.add("Adesh");
		list.add("Rushikesh");
		
//		Using traditional method
//		for (String name: list) {
//			if (name.startsWith("A")) {
//				System.out.println(name);
//			}
//		}
		
//		Using filter method of stream api
//		list.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
		
//		For map data structure
		Map<String, Integer> map = new HashMap<>();
		map.put("Bhushan", 20);
		map.put("Sumit", 30);
		map.put("Aniruddha", 31);
		map.put("Suyog", 32);
		
		
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		
		map.entrySet().stream().forEach(key -> System.out.println(key.getKey()));
	}

}
