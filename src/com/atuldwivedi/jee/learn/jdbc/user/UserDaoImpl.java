package com.atuldwivedi.jee.learn.jdbc.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

/**
 * 
 * @author Atul Dwivedi CREATE TABLE USER(USER_ID NUMBER, USER_NAME VARCHAR, AGE
 *         NUMBER, GENDER VARCHAR);
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void inserUser(User user) {

		long userId = user.getUserId();
		String userName = user.getUserName();
		int age = user.getAge();
		String gender = user.getGender();

		try (Connection con = DbUtil.getConn()) {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(
					"INSERT INTO USER VALUES(" + userId + ", '" + userName + "', " + age + ", '" + gender + "')");
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM USER WHERE USER_ID = " + userId + "");
			while (rs.next()) {
				long uId = rs.getLong(1);
				String userName = rs.getString(2);
				int age = rs.getInt(3);
				String gender = rs.getString(4);
				user = new User(uId, userName, age, gender);
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM USER");
			while (rs.next()) {
				long uId = rs.getLong(1);
				String userName = rs.getString(2);
				int age = rs.getInt(3);
				String gender = rs.getString(4);
				User user = new User(uId, userName, age, gender);
				userList.add(user);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return userList;
	}

}
