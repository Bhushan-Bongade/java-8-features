package comparatorandcomparableinteface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Rushikesh", 22, 58, "A" ));
		list.add(new Student("Bhushan", 22, 20, "A" ));
		list.add(new Student("Aniruddha", 22, 31, "A" ));
		list.add(new Student("Suyog", 22, 32, "A" ));
		list.add(new Student("Sumit", 22, 30, "A" ));
		list.add(new Student("Adesh", 22, 40, "A" ));
		
		Collections.sort(list);
		
		list.stream().forEach(System.out::println);
	}
}
