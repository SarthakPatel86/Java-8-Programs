package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo {
	public static void main(String[] args) {
		List<List<Integer>> l1 = Arrays.asList(Arrays.asList(1, 2, 5), Arrays.asList(8, 9, 6),
				Arrays.asList(1, 6, 8, 5));
		List<Integer> ans = l1.stream().flatMap(ele -> ele.stream()).collect(Collectors.toList());
		System.out.println(ans);
	}
}
