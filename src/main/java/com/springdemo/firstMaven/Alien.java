package com.springdemo.firstMaven;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	
	
	public Alien() {
		System.out.println("its me .../");
	}
	public void code() {
		System.out.println("iam shivasai");
		laptop.Complier();
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("hi");
		this.age = age;
	}

}
