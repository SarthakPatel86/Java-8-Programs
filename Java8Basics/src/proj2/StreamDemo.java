package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(12, 3, 4, 56, 78, 89);

		List<Integer> l2 = l1.stream().map((n) -> n + 3).collect(Collectors.toList());
		System.out.println(l2);
	}
}
