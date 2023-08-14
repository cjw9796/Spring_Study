package com.myspring.kurly.item;

public class ItemDTO {
	
	private int item_number;
	private String item_category;
	private String item_name;
	private int item_price;
	private int item_stock;
	private String item_image;
	private String item_info;
	private int discount_rate;
	private String reg_date;
	private int sold;
	
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDTO(int item_number, String item_category, String item_name, int item_price, int item_stock,
			String item_image, String item_info, int discount_rate, String reg_date, int sold) {
		super();
		this.item_number = item_number;
		this.item_category = item_category;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_stock = item_stock;
		this.item_image = item_image;
		this.item_info = item_info;
		this.discount_rate = discount_rate;
		this.reg_date = reg_date;
		this.sold = sold;
	}

	public int getItem_number() {
		return item_number;
	}

	public void setItem_number(int item_number) {
		this.item_number = item_number;
	}

	public String getItem_category() {
		return item_category;
	}

	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public String getItem_image() {
		return item_image;
	}

	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	public String getItem_info() {
		return item_info;
	}

	public void setItem_info(String item_info) {
		this.item_info = item_info;
	}

	public int getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(int discount_rate) {
		this.discount_rate = discount_rate;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "ItemDTO [item_number=" + item_number + ", item_category=" + item_category + ", item_name=" + item_name
				+ ", item_price=" + item_price + ", item_stock=" + item_stock + ", item_image=" + item_image
				+ ", item_info=" + item_info + ", discount_rate=" + discount_rate + ", reg_date=" + reg_date + ", sold="
				+ sold + "]";
	}
	
	
	
	
	

}
