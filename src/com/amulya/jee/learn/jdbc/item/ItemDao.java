package com.amulya.jee.learn.jdbc.item;

import java.util.List;

public interface ItemDao {
	
	public void insertItem(Item item);
	
	public Item fetchItemById(long itemId);
	
	public void deleteItemById(long itemId);
	
	public List<Item> fetchItems();
	

}
