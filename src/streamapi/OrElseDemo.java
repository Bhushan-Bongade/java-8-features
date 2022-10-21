package streamapi;

import java.util.ArrayList;
import java.util.List;

public class OrElseDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		System.out.println(list.stream().findAny().orElse(null));
	}
}
