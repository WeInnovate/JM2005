package com.atuldwivedi.jee.learn.dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.atuldwivedi.jee.learn.jdbc.user.User;
import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public void inserLogin(String userName, String password) {

		try (Connection con = DbUtil.getConn()) {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2005_LOGIN VALUES(?, ?)");

			pstmt.setString(1, userName);
			pstmt.setString(2, password);

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Login details has been inserted successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User fetchUserLoginDetailByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLoginDetailByUserName(String userName) {
		// TODO Auto-generated method stub

	}

}
