/**
 * 
 */
package com.amulya.jee.learn.jdbc.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atuldwivedi.jee.learn.jdbc.user.User;
import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

/**
 * @author AMULYA
 * CREATE TABLE ITEM(ITEM_ID NUMBER, ITEM_NAME VARCHAR, QUANTITY NUMBER, AMOUNT NUMBER);
 *
 */
public class ItemDaoImpl implements ItemDao {

	@Override
	public void insertItem(Item item) {
		try(Connection con = DbUtil.getConn()) {
			
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO ITEM VALUES(?, ?, ?, ?)");
			pstmt.setLong(1, item.getItemId());
			pstmt.setString(2, item.getItemName());
			pstmt.setInt(3, item.getQuantity());
			pstmt.setDouble(4, item.getAmount());
			
			
			int i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println("item inserted succesfully");
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Item fetchItemById(long itemId) {
		try(Connection con = DbUtil.getConn()) {
			
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEM where item_id = ?");
			pstmt.setLong(1, itemId);
			pstmt.executeQuery();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteItemById(long itemId) {
		try(Connection con = DbUtil.getConn()) {
			
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM ITEM where item_id = ?" );
			pstmt.setLong(1, itemId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Item> fetchItems() {
		List<Item> itemList = new ArrayList<>();
		
		try(Connection con = DbUtil.getConn()){
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ITEM");
			while(rs.next()) {
				long itemId= rs.getLong(1);
				String itemName = rs.getString(2);
				int quantity = rs.getInt(3);
				double amount = rs.getDouble(4);
				Item item = new Item(itemId, itemName, quantity, amount);
				itemList.add(item);
			}
		} catch (SQLException e) {
		  e.printStackTrace();
		}
		
		return null;
	}

}
