package com.practice.designpatterns.builder;


class Person {
	
	private String name;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	final static class PersonBuilder {
		
		Person person = new Person();
		
		public PersonBuilder() {
		}
		
		public PersonBuilder name(String name) {
			person.setName(name);
			return this;
		}
		
		public Person build() {
			return person;
		}
	}
}


public class Demo {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder().name("Ankit").build();
		
		System.out.println(person.getName());
	}
	
}
