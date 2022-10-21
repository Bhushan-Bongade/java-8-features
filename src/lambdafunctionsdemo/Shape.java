package lambdafunctionsdemo;

public interface Shape {
	
	public void draw();
	
	default void name() {
		System.out.println("Calling default method");
	}
	
	public static int perimeter(int ... a) {
		int sum = 0;
		
		for (int num : a) {
			sum += num;
		}
		
		return sum;
	}
}
