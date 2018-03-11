package com.atuldwivedi.jee.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbUtil {

	public static Connection getConn() throws SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("com//atuldwivedi//jee//learn//jdbc//util//db", Locale.US);
		String url = rb.getString("url");
		String userName = rb.getString("userName");
		String password = rb.getString("password");
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(url, userName, password);
		return con;
	}
}
