package com.rn.SpringProj;

public class Alien {
		
	private String name;
	private Integer age;
	private String address;
	
	public String getName() {
		return name;
	}
	
	private	Computer com;
	

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void setName(String name) {
		System.out.println("Alien.setName()");
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("Alien.setAge()");
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Alien() {
	System.out.println("Aliean 0-param costructor");
	}
	
	public void code() {
		System.out.println(" I am Coading");
		com.compile();
	}

	@Override
	public String toString() {
		return "Alien [address=" + address + ", age=" + age + ", name=" + name + "]";
	}
	
}
