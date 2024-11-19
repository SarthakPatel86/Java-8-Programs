package task;

import java.util.Arrays;
import java.util.List;

import proj1.Employee;

public class EmployeeRunner {

	static List<task.Employee> getAll(){
		task.Employee e1=new task.Employee(1, "Virat", 30, 20000.0);
		task.Employee e2=new task.Employee(2, "Rahul", 35, 80000.0);
		task.Employee e3=new task.Employee(3, "Dhoni", 36, 50000.0);
		task.Employee e4=new task.Employee(4, "Rohit", 40, 40000.0);
		task.Employee e5=new task.Employee(5, "Hardik",50, 30000.0);
		List<task.Employee> l1=Arrays.asList(e1,e2,e3,e4,e5);
		return l1;
				
	}
	
}
