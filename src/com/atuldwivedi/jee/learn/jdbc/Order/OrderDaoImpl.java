package com.atuldwivedi.jee.learn.jdbc.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;
//CREATE TABLE ORDER(ORDER_ID NUMBER, USER_NAME VARCHAR, PRODUCT VARCHAR,PRICE NUMBER);

public class OrderDaoImpl implements OrderDao {

	@Override
	public void CreateOrder(Order order) {
		try(Connection con = DbUtil.getConn()){
			
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO ORDER1 VALUES(?, ?, ?, ?)");
			
			pstmt.setLong(1, order.getOrderId());
			pstmt.setString(2, order.getUserName());
			pstmt.setString(3, order.getProduct());
			pstmt.setInt(4, order.getPrice());
			
			
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Order fetchOrderById(String OrderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrderById(Order order1) {
		try(Connection con = DbUtil.getConn()){
			
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM ORDER1 WHERE ORDER_ID=?");
			
			pstmt.setLong(1, order1.getOrderId());
			
			
			
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Order> fetchOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
