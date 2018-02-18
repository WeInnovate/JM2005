/**
 * 
 */
package com.amulya.jee.learn.jdbc.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Item fetchItemById(long itemId) {
		try(Connection con = DbUtil.getConn()) {
			
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEM where ?");
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
			
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM ITEM");
		}
		
		
	}

	@Override
	public List<Item> fetchItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
