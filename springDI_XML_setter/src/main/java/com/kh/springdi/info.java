package com.kh.springdi;

public class info {
	
	String id;
	String pw; 
	String name;
	
	public info() {};
	
	
	public info(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "info [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	public void printInfo() {
		System.out.println("info [id=\" + id + \", pw=\" + pw + \", name=\" + name + \"]\"");
	}
	
	//스프링에서 의존성 주입 DI 
	// 객체간 의존성을 개발자가 객체 내부에서 직접 new 연산자 대신해서 
	// 스프링 컨테이너에서 객체를 생성해서 넣어주는 방식이다. 
	

}
