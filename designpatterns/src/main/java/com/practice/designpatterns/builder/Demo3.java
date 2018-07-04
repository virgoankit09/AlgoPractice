package com.practice.designpatterns.builder;

class Employee {
	private String name;
	private String compnay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompnay() {
		return compnay;
	}
	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}
}

class EmployeeBuilder<T extends EmployeeBuilder<T>> {
	Employee e = new Employee();
	
	public T name(String name) {
		e.setName(name);
		return self();
	}
	
	Employee build() {
		return e;
	}
	
	T self() {
		return (T) this;
	}
}

class EmployeeCompanyBuilder extends EmployeeBuilder<EmployeeCompanyBuilder>{
	
	public EmployeeCompanyBuilder company(String company) {
		e.setCompnay(company);
		return this;
	}
	
}

public class Demo3 {
	public static void main(String[] args) {
		Employee e =new EmployeeCompanyBuilder().name("ankit").company("Infosys").build();
		System.out.println(e.getName()+" " +e.getCompnay() );
	}
}
