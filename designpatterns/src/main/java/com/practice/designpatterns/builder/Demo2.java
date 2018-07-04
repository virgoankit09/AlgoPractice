package com.practice.designpatterns.builder;

class Student {
	private String name;
	private String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
}

class StudentBuilder {
	
	Student student = new Student();
	
	public StudentNameBuilder studentNameBuilder() {
		return new StudentNameBuilder(student);
	}
	
	public StudentCollegeBuilder studentCollegeBuilder() {
		return new StudentCollegeBuilder(student);
	}
	
	public Student build() {
		return student;
	}
}

class StudentNameBuilder extends StudentBuilder {
	
	StudentNameBuilder(Student student) {
		this.student = student;
	}
	
	public StudentNameBuilder name(String name) {
		student.setName(name);
		return this; 
	}
}

class StudentCollegeBuilder extends StudentBuilder {
	
	public StudentCollegeBuilder(Student student) {
		this.student = student;
	}
	
	public StudentCollegeBuilder college(String college) {
		student.setCollege(college);
		return this;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		Student student = new StudentBuilder().studentNameBuilder()
							.name("Ankit")
							.studentCollegeBuilder()
							.college("Galgotias")
							.build();
		System.out.println(student.getName()+ " "+student.getCollege());				
		
	}
	
}
