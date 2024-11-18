package proj1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeRunner {

	public static void main(String[] args) {
		List<Employee> l1 = EmployeeService.getAll();
		l1.forEach((ele) -> System.out.println(ele));
		System.out.println("============================");

		// only name
		Consumer<Employee> c1 = (e) -> {
			System.out.println(e.getEname());
		};

		// only age
		Consumer<Employee> c2 = (e) -> {
			System.out.println(e.getAge());
		};

		// only dsgn
		Consumer<Employee> c3 = (e) -> {
			System.out.println(e.getDsgn());
		};

		// all
		Consumer<Employee> c4 = (e) -> {
			System.out.println(e);
		};
		System.out.println("============================");

		l1.forEach(c1);
		System.out.println("============================");

		l1.forEach(c3);
		System.out.println("============================");

		l1.forEach(c1.andThen(c3).andThen(c2));
		System.out.println("============================");

		Predicate<Employee> p1 = (e) -> e.getAge() > 26;

		l1.forEach((ele) -> {
			if (p1.test(ele)) {
				c4.accept(ele);
			}
		});
		
				

	}
}




























