package com.kh.springdi2;

import java.util.ArrayList;

public class Myinfo {

	private String name;
	private double height;
	private double weight;
	private BMICalculator bmiCalculator;
	private ArrayList<String> hobbies;

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
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

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	@Override
	public String toString() {
		return "MyInfo [name=" + name + ", height=" + height + ", weight=" + weight + ", bmiCalculator=" + bmiCalculator
				+ ", hobbies=" + hobbies + "]";
	}

	// 개인 정보를 출력하는 메소드
	public void getMyInfo() {
		System.out.println(hobbies);
	}
}
