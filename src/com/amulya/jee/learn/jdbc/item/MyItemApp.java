package com.amulya.jee.learn.jdbc.item;

public class MyItemApp {

	public static void main(String[] args) {
		Item item = new Item(1003, "doll", 1, 800);
		ItemDao itemDao = new ItemDaoImpl();
		itemDao.insertItem(item);
		Item i = itemDao.fetchItemById(1003);
		System.out.println(i);
        itemDao.deleteItemById(1003);
        itemDao.fetchItems();
	}

}
