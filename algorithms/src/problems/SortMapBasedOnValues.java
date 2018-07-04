package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import util.Employee;

public class SortMapBasedOnValues {
	
	//Map<Integer, Employee> employees = new LinkedHashMap<>();
	Map<Integer, Employee> employees = new HashMap<>();
	
	public void sort() {
		displayMap(employees.entrySet());
		
		Set<Entry<Integer, Employee>> entrySet = employees.entrySet();
		
		List<Entry<Integer, Employee>> entryList = new ArrayList<>(entrySet);
		//Collections.sort(list);
		
		System.out.println("---------------------------------------------------");
		System.out.println(entryList);
		System.out.println("---------------------------------------------------");
		Collections.sort(entryList, new EmployeeComparator());
		System.out.println(entryList);
	}
	
	public SortMapBasedOnValues() {
		populateEmployees();
	}
	
	public static void main(String[] args) {
		SortMapBasedOnValues s = new SortMapBasedOnValues();
		s.sort();
	}
	
	public void populateEmployees() {
		Employee e1 = new Employee();
		e1.setEmpId(1015);
		e1.setEmpName("Ankit Garg");
		e1.setEmpSalary(40000);
		
		Employee e2 = new Employee();
		e2.setEmpId(1007);
		e2.setEmpName("Ankit Garg");
		e2.setEmpSalary(20000);
		
		Employee e3 = new Employee();
		e3.setEmpId(1011);
		e3.setEmpName("Ankit Garg");
		e3.setEmpSalary(50000);
		
		Employee e4 = new Employee();
		e4.setEmpId(1008);
		e4.setEmpName("Ankit Garg");
		e4.setEmpSalary(30000);
	
		employees.put(e1.getEmpId(), e1);
		employees.put(e2.getEmpId(), e2);
		employees.put(e3.getEmpId(), e3);
		employees.put(e4.getEmpId(), e4);
	}
	
	public void  displayMap(Set<Entry<Integer, Employee>> entrySet) {
		for(Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey() +"  "+entry.getValue().getEmpSalary());
		}
	}
}

class EmployeeComparator implements Comparator<Entry<Integer, Employee>> {

	@Override
	public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
		if(o1.getValue().getEmpSalary() > o2.getValue().getEmpSalary()) {
			return 1;
		} else if(o1.getValue().getEmpSalary() < o2.getValue().getEmpSalary()) {
			return -1;
		}
		return 0;
	}

	
}
