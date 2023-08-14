package com.myspring.kurly.cart;

public class CartDTO {
	
	private int cart_number; 
	private String buyer;
	private String item_name; 
	private int buy_price; 
	private int buy_count; 
	private String item_image;
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CartDTO(int cart_number, String buyer, String item_name, int buy_price, int buy_count, String item_image) {
		super();
		this.cart_number = cart_number;
		this.buyer = buyer;
		this.item_name = item_name;
		this.buy_price = buy_price;
		this.buy_count = buy_count;
		this.item_image = item_image;
	}
	
	public int getCart_number() {
		return cart_number;
	}
	public void setCart_number(int cart_number) {
		this.cart_number = cart_number;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
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
	
	@Override
	public String toString() {
		return "CartDTO [cart_number=" + cart_number + ", buyer=" + buyer + ", item_name=" + item_name + ", buy_price="
				+ buy_price + ", buy_count=" + buy_count + ", item_image=" + item_image + "]";
	}
	
	
	
	
	

	
	
}
