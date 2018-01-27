package com.atuldwivedi.jee.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getConn() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		return con;
	}
}
