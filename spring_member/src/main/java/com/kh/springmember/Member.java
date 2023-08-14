package com.kh.springmember;

public class Member {
	
	private int num;
	private String id;
	private String pw;
	private String name;
	private String Email;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Member(int num, String id, String pw, String name, String email) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		Email = email;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
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


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", Email=" + Email + "]";
	}
	
	
	
	
	
	
	

}
