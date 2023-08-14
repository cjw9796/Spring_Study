package com.kh.springdi;

public class Calculator {

	public void add(int firstNum, int secondNum) {
		System.out.println("add()");
		int result = firstNum + secondNum;
		System.out.println(firstNum + "+" + secondNum + "=" + result);
	}

	public void sub(int firstNum, int secondNum) {
		System.out.println("sub()");
		int result = firstNum - secondNum;
		System.out.println(firstNum + "-" + secondNum + "=" + result);
	}

	public void multi(int firstNum, int secondNum) {
		System.out.println("multi()");
		int result = firstNum * secondNum;
		System.out.println(firstNum + "*" + secondNum + "=" + result);
	}

	public void div(int firstNum, int secondNum) {
		System.out.println("div()");
		int result = firstNum / secondNum;
		System.out.println(firstNum + "/" + secondNum + "=" + result);
	}

}
