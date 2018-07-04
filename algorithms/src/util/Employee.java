package util;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private static List<Employee> employees = new ArrayList<>();
	
	private int empId;
	private String empName;
	private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public static List<Employee> getEmployees() {
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
		
			employees.add(e1);
			employees.add(e2);
			employees.add(e3);
			employees.add(e4);
			return employees;
		
	}
}
