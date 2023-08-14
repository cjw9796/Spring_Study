package com.kh.springdi2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	// ArrayList<String> hobbies = new ArrayList<String>();
	// hobbies.add();
	// hobbies.add();
	// hobbies.add();
	
	// xml파일에서 받아오는 내용으로 빈 객체 가져오기!
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:bmi.xml");
		Myinfo myInfo = ctx.getBean("myInfo", Myinfo.class);
		// System.out.println(myInfo);
		System.out.println(myInfo);
		
		
		
	}
	
	
}
