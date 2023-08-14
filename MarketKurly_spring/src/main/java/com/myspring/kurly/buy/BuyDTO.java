package com.myspring.kurly.buy;

public class BuyDTO {
	
	private String customer_id; 
	private String customer_name; 
	private int cart_number; 
	private String item_name; 
	private int buy_price; 
	private int buy_count; 
	private String item_image; 
	private String buy_date; 
	private String howpay; 
	private String address;
	
	
	public BuyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BuyDTO(String customer_id, String customer_name, int cart_number, String item_name, int buy_price,
			int buy_count, String item_image, String buy_date, String howpay, String address) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.cart_number = cart_number;
		this.item_name = item_name;
		this.buy_price = buy_price;
		this.buy_count = buy_count;
		this.item_image = item_image;
		this.buy_date = buy_date;
		this.howpay = howpay;
		this.address = address;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public int getCart_number() {
		return cart_number;
	}


	public void setCart_number(int cart_number) {
		this.cart_number = cart_number;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public int getBuy_price() {
		return buy_price;
	}


	public void setBuy_price(int buy_price) {
		this.buy_price = buy_price;
	}


	public int getBuy_count() {
		return buy_count;
	}


	public void setBuy_count(int buy_count) {
		this.buy_count = buy_count;
	}


	public String getItem_image() {
		return item_image;
	}


	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}


	public String getBuy_date() {
		return buy_date;
	}


	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}


	public String getHowpay() {
		return howpay;
	}


	public void setHowpay(String howpay) {
		this.howpay = howpay;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "BuyDTO [customer_id=" + customer_id + ", customer_name=" + customer_name + ", cart_number="
				+ cart_number + ", item_name=" + item_name + ", buy_price=" + buy_price + ", buy_count=" + buy_count
				+ ", item_image=" + item_image + ", buy_date=" + buy_date + ", howpay=" + howpay + ", address="
				+ address + "]";
	}
	
	
	
	
	

}
