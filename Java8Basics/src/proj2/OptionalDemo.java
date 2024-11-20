package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] arr = new String[4];

		arr[0] = "Sarthak";
//		Optional<String> op=Optional.ofNullable(arr[0]);
//		if(op.isPresent()) {
//			System.out.println("It Contains..>!!!");
//			System.out.println(op);
//			System.out.println(op.get());
//		}
//		else {
//			System.out.println("Its Empty...!!!");
//		}

		arr[2] = "Patel";
		Supplier<String> s1 = () -> "-1";
		for (String ele : arr) {
			Optional<String> op = Optional.ofNullable(ele);
			System.out.println(op.orElse("dummy"));
		}

		System.out.println("===============================");
		for (String ele : arr) {
			Optional<String> op = Optional.ofNullable(ele);
			System.out.println(op.orElseGet(s1));
		}

		// reduce input b number of data it will give 1 data
		System.out.println("===============================");
		List<Integer> l1 = Arrays.asList(12, 34, 56, 1, 8, 65, 45);
		Optional<Integer> ans = l1.stream().reduce((a, b) -> a > b ? a : b);
		System.out.println(ans.get());

		System.out.println("===============================");
		//
		List<String> l2 = Arrays.asList("Sarthak", "Patel", "Rahul", "Jenish", "Hardik");
		Optional<String> ans2 = l2.stream().reduce((x, y) -> x.length() > y.length() ? x : y);
		Optional<String> ans3 = l2.stream().reduce((x, y) -> x + " " + y);
		System.out.println(ans2.get());
		System.out.println(ans3.get());
	}
}
