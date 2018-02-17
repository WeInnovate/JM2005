package com.atuldwivedi.jee.learn.jdbc.Order;

public class Order {

	private long OrderId;

	private String userName;

	private String Product;

	private int Price;

	public Order(long OrderId, String userName, String Product,int Price) {
		super();
		this.OrderId = OrderId;
		this.userName = userName;
		this.Product = Product;
		this.Price = Price;
	}
	public Order(long OrderId) {
		super();
		this.OrderId = OrderId;
		
	}
	public long getOrderId() {
		return OrderId;
	}

	public void setOrderId(long OrderId) {
		this.OrderId = OrderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String Product) {
		this.Product = Product;
	}
	
	

}
