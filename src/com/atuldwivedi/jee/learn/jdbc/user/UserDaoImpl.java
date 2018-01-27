package com.atuldwivedi.jee.learn.jdbc.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

/**
 * 
 * @author Atul Dwivedi
 * CREATE TABLE USER(USER_ID NUMBER, USER_NAME VARCHAR, AGE NUMBER, GENDER VARCHAR);
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void inserUser(User user) {
		try(Connection con = DbUtil.getConn()){
			
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO USER VALUES(?, ?, ?, ?)");
			
			pstmt.setLong(1, user.getUserId());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getAge());
			pstmt.setString(4, user.getGender());
			
			
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public User fetchUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> fetchUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
