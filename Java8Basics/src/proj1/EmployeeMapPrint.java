package proj1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeMapPrint {
	public static void main(String[] args) {
		List<Employee> l1 = EmployeeService.getAll();

		Predicate<Employee> p2 = (obj) -> obj.getAge() > 24;
		Predicate<Employee> p3 = (obj) -> obj.getSal() > 50000;

		Function<List<Employee>, Map<Integer, String>> f1 = (l) -> {
			Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
			l.forEach((obj) -> {
				if (p2.and(p3).test(obj)) {
					m1.put(obj.getEid(), obj.getEname());
				}
			});
			return m1;
		};
		System.out.println(f1.apply(l1));
	}
}
