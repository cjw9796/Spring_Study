package com.myspring.kurly.board;

public class BoardDTO {
	
	private int num;
	private String writer;
	private String title;
	private String pw;
	private String reg_date;
	private int ref;
	private int re_step;
	private int re_level;
	private int readcount;
	private String content;
	
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDTO(int num, String writer, String title, String pw, String reg_date, int ref, int re_step,
			int re_level, int readcount, String content) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.pw = pw;
		this.reg_date = reg_date;
		this.ref = ref;
		this.re_step = re_step;
		this.re_level = re_level;
		this.readcount = readcount;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

	public int getRe_level() {
		return re_level;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", writer=" + writer + ", title=" + title + ", pw=" + pw + ", reg_date="
				+ reg_date + ", ref=" + ref + ", re_step=" + re_step + ", re_level=" + re_level + ", readcount="
				+ readcount + ", content=" + content + "]";
	}
	
	
	
	

}
