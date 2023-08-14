package com.kh.springProperties;

//AdminConnection 클래스의 bean이 생성되는 순간 admin.properties 파일의 내용을 읽어서 필드에 저장한다. 
public class AdminConnection {
	private String adminId; //admin.id 저장
	private String adminPW; //admin.pw 저장 
	
	public AdminConnection() {}
	public AdminConnection(String adminId, String adminPW) {
		super();
		this.adminId = adminId;
		this.adminPW = adminPW;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPW() {
		return adminPW;
	}
	public void setAdminPW(String adminPW) {
		this.adminPW = adminPW;
	}
	@Override
	public String toString() {
		return "AdminConnection [adminId=" + adminId + ", adminPW=" + adminPW + "]";
	}
	
	
	
	
}
