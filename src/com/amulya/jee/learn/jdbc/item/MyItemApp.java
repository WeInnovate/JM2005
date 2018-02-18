package com.amulya.jee.learn.jdbc.item;

public class MyItemApp {

	public static void main(String[] args) {
		Item item = new Item(1002, "Toy", 1, 200);
		ItemDao itemDao = new ItemDaoImpl();
		itemDao.insertItem(item);
		itemDao.fetchItemById(1003);
         
	}

}
