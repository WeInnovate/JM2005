package com.atuldwivedi.jee.learn.jdbc.Order;

import java.util.List;

public interface OrderDao {

	public void CreateOrder(Order order);

	public Order fetchOrderById(String OrderId);

	public void deleteOrderById(Order order1);

	public List<Order> fetchOrders();

}
