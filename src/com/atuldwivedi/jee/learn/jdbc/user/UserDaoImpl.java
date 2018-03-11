package com.atuldwivedi.jee.learn.jdbc.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

/**
 * 
 * @author Atul Dwivedi CREATE TABLE JM2005_USER(USER_ID NUMBER, USER_NAME VARCHAR, AGE
 *         NUMBER, GENDER VARCHAR);
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void inserUser(User user) {
		try (Connection con = DbUtil.getConn()) {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2005_USER VALUES(?, ?, ?, ?, ?, ?)");
			
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getFirstName());
			pstmt.setString(3, user.getLastName());
			pstmt.setString(4, user.getMobile());
			pstmt.setInt(5, user.getAge());
			pstmt.setString(6, user.getGender());
			
			int i = pstmt.executeUpdate();
			
			if (i > 0) {
				System.out.println("User has been registered successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public User fetchUserById(long userId) {
		User user = null;
		try (Connection con = DbUtil.getConn()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2005_USER WHERE USER_ID = " + userId + "");
			while (rs.next()) {
				long uId = rs.getLong(1);
				String userName = rs.getString(2);
				int age = rs.getInt(3);
				String gender = rs.getString(4);
				user = null;
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return user;
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> fetchUsers() {
		List<User> userList = new ArrayList<>();
		
		try (Connection con = DbUtil.getConn()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2005_USER");
			while (rs.next()) {
				long uId = rs.getLong(1);
				String userName = rs.getString(2);
				int age = rs.getInt(3);
				String gender = rs.getString(4);
				User user = null;
				userList.add(user);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return userList;
	}

}
