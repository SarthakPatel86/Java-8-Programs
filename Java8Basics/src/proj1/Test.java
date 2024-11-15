package proj1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10, 20, 30, 40, 50);
		List<String> l2 = Arrays.asList("Virat", "Dhoni", "Rohit", "Hardik");

//		for (Integer ele : l1) {
//			System.out.println(ele);
//		}

		System.out.println("==================");
		l1.forEach((ele) -> System.out.println(ele + 10));
		l2.forEach((ele) -> System.out.println(ele));
		System.out.println("==================");

		Consumer<Integer> c1 = (n) -> {
			System.out.println(n + 50);
		};
		l1.forEach(c1);
		System.out.println("==================");

		Consumer<String> c2 = (s) -> {
			System.out.println(s.toUpperCase());
		};
		l2.forEach(c2);
		System.out.println("==================");

		Consumer<String> c3 = (s) -> {
			System.out.println(s.length());
		};
		l2.forEach(c2.andThen(c3));

	}
}
