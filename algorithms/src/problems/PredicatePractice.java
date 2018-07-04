package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import util.Employee;

public class PredicatePractice {

	public static void doTest(Predicate<Employee> predicate) {
		List<Employee> employees = Employee.getEmployees();
		
		employees.forEach(e->{
			if(predicate.test(e)) {
				System.out.println(e.getEmpName()+" "+e.getEmpSalary());
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		doTest(e->e.getEmpSalary()<40000);
		List<String> list = Arrays.asList("Garg","Ankit","Balloon");
		Collections.sort(list);
		System.out.println(list);
		list.stream();
		Stream<Object> stream = Stream.of(new PredicatePractice(),"",123);
		
		
	}

}
