package lambdafunctionsdemo;

public class Main {

	public static void main(String[] args) {
		Calculator calci = (a, b) -> System.out.print("Sum of two numbers is: " + (a + b));
		calci.sum(55, 55);
	}
}
