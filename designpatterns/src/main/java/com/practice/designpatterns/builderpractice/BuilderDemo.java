package com.practice.designpatterns.builderpractice;

class Employee {
	
	private String name;
	private String address;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}

class EmployeeBuilder {
	Employee e = new Employee();
	
	public EmployeeNameBuilder employeeNameBuilder() {
		return new EmployeeNameBuilder(e);
	}
	
	public EmployeeCompanyBuilder employeeCompanyBuilder() {
		return new EmployeeCompanyBuilder(e);
	}
	
	public EmployeeAddressBuilder employeeAddressBuilder() {
		return new EmployeeAddressBuilder(e);
	}
	
	public Employee build() {
		return e;
	}
}

class EmployeeNameBuilder extends EmployeeBuilder {

	public EmployeeNameBuilder(Employee e) {
		this.e = e;
	}
	
	public EmployeeNameBuilder name(String name) {
		e.setName(name);
		return this;
	}
	
}

class EmployeeAddressBuilder extends EmployeeBuilder {

	public EmployeeAddressBuilder(Employee e) {
		this.e=e;
	}
	public EmployeeAddressBuilder address(String address) {
		e.setAddress(address);
		return this;
	}
	
}

class EmployeeCompanyBuilder extends EmployeeBuilder {

	public EmployeeCompanyBuilder(Employee e) {
		this.e=e;
	}
	public EmployeeCompanyBuilder company(String company) {
		e.setCompany(company);
		return this;
	}
	
}

public class BuilderDemo {
	public static void main(String[] args) {
		Employee e = new EmployeeBuilder().employeeNameBuilder().name("Ankit")
		.employeeAddressBuilder().address("Delhi")
		.employeeCompanyBuilder().company("Sapient")
		.build();
		
		System.out.println(e.getName()+" "+e.getCompany()+" "+e.getAddress());
	}
}
