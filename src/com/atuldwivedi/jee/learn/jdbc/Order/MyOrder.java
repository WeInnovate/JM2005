package com.atuldwivedi.jee.learn.jdbc.Order;


public class MyOrder {

	public static void main(String[] args) {
		Order order = new Order(1000, "Ram","Book" , 25);
		//Order order1=new Order(1000);
		
		OrderDao orderDao = new OrderDaoImpl();
		orderDao.CreateOrder(order);
		//orderDao.deleteOrderById(order1);
	}
}
