package com.kh.springdi;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbies;
	private int age;
	
	public Student() {}
	public Student(String name, double height, double weight, ArrayList<String> hobbies) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.hobbies = hobbies;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", weight=" + weight + ", hobbies=" + hobbies + "]";
	}
	
	public Student(String name, ArrayList<String> hobbies, int age) {
		super();
		this.name = name;
		this.hobbies = hobbies;
		this.age = age;
	}
	
	
	
	
	

}
