package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
//		printing value of List data structure
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(21);
		list.add(33);
		
//		Using traditional method
//		for (Integer num : list) {
//			System.out.println(num);
//		}

//		Using stream api
//		list.stream().forEach(System.out::println);
		
//		printing value of map data structure
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
