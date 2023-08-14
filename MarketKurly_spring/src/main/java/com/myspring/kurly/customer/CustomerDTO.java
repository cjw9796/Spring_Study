package com.myspring.kurly.customer;

public class CustomerDTO {
	
	private String id;
	private String pw;
	private String name;
	private String reg_date;
	private String tel;
	private String address;
	private String email;
	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(String id, String pw, String name, String reg_date, String tel, String address, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.reg_date = reg_date;
		this.tel = tel;
		this.address = address;
		this.email = email;
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

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", reg_date=" + reg_date + ", tel=" + tel
				+ ", address=" + address + ", email=" + email + "]";
	}
	
	
	
	
	
	

	
	
}
