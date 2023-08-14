package com.kh.springdi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// 의존적 주입 
		
		/*
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setFirstNum(8);
		myCalculator.setSecondNum(5);
		
		Calculator calculator = new Calculator();
		myCalculator.setCalculator(calculator); //의존성 주입
		myCalculator.setCalculator(new Calculator());  

		calculator.add(100, 200);
		*/
		
		//  **자바가 직접 객체를 생성(MainClass)하는게 아니라 스프링이 객체를 생성하게(applicationCTX.xml) 해서 의존성을 줄인다. 
		
		

		
		//xml파일에서 설정한 bean설정 정보를 읽어들인다.
		//How? : bean에 대해서 얻어온다.
		//applicationCTX.xml이 위치한 경로 src/main/resources를 claspath라고 부른다. 
		
//		GenericXmlApplicationContext 클래스는 생성자의 인수로 bean을 설정한 xml파일의 
//		경로와 이름을 넘겨주면 xml파일의 내용을 읽어서 java객체로 변환한 후 부모클래스인 
//		AbstractApplicationContext 클래스의 객체에 저장한다.
		
//		spring ioc 컨테이너가 관리하는 자바 객체
//		1. 어노테이션을 이용하는 방법
//		2. xml파일을 이용해서 등록하는 방법
		
		String configLocation = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		//getBean() 메서드로 AbstractApplicationContext 클래스 타입의 객체 ctx에 저장된 bean을 얻어온다.
		//getBean("얻어올 bean id", bean을 생성한 클래스의 이름.class)
		
		
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		System.out.println(myCalculator);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		
	}

}

//class B {
//	
//	public void info() {
//	}
//	
//}
//
////A라는 객체를 생성할 때 B를 무조건 생성을 해야된다. 
////이런 문장을 보고 의존적으로 
////B에 대한 객체의 내용이 변경되면 A안에 있는 메서드 호출 내용도 변경을 해야된다. 
//
//class A {
//	
//	B b = new B();
//	
//	public void show() {
//		b.info();
//	}
//	
//}