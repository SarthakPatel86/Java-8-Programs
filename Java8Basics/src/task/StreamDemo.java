package task;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> l = EmployeeRunner.getAll();
		l.forEach(ele -> System.out.println(ele));
		System.out.println();

		// converting ename int upper case and returning as list
		List<Employee> l1 = l.stream().map((obj) -> {
			obj.setName(obj.getName().toUpperCase());
			return obj;
		}).collect(Collectors.toList());
		l1.forEach(ele -> System.out.println(ele));

		System.out.println();
		// name as upper case and increase sal by 10000 .Return map of eid and sal
		Map<Integer, Double> m1 = l.stream().map((obj) -> {
			obj.setName(obj.getName().toUpperCase());
			obj.setSal(obj.getSal() + 10000);
			return obj;
		}).collect(Collectors.toMap(obj -> obj.getEid(), obj -> obj.getSal()));
		System.out.println(m1);

		System.out.println();
		// print only employee who has age >25
		l.stream().filter((e) -> e.getAge() > 25).forEach(ele -> System.out.println(ele));

		System.out.println();
		// filter only employees who's age greater than 24 and increase their sal by
		// 5000 then store their data as list
		List<Employee> l2 = l.stream().filter((e) -> e.getAge() > 24).map((obj) -> {
			obj.setSal(obj.getSal() + 5000);
			return obj;
		}).collect(Collectors.toList());
		l2.forEach(ele -> System.out.println(ele));
		
		System.out.println();
		
	}
}





















