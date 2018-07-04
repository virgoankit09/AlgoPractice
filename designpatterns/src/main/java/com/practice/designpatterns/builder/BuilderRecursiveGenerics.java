package com.practice.designpatterns.builder;

class Human {
	private String name;
	private int age;
	
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class HumanBuilder<T extends HumanBuilder<HumanAddressBuilder>> {
	
	Human human = new Human();
	
	public T details(String name) {
		human.setName(name);
		return self();
	}
	
	public T age(int age) {
		human.setAge(age);
		return self();
	}
	
	public Human build() {
		return human;
	}
	
	public T self() {
		return (T) this;
	}
}

class HumanAddressBuilder extends HumanBuilder<HumanAddressBuilder> {
	
	public HumanAddressBuilder address(String address) {
		human.setAddress(address);
		return this;
	}
	
	@Override
	public HumanAddressBuilder self() {
		return this;
	}
	
}

public class BuilderRecursiveGenerics {

	public static void main(String[] args) {
		Human human = new HumanAddressBuilder().details("Ankit garg").age(27).address("Delhi").build();
		System.out.println(human.getName()+ " "  +human.getAge()+" " +human.getAddress());
	}
	
}
