package com.atuldwivedi.jee.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Atul Dwivedi
 * 
 * CREATE TABLE EMP(EMP_ID NUMBER, EMP_NAME VARCHAR);
 * INSERT INTO EMP VALUES(1001, 'Atul');
 *
 */
public class JdbcHelloWorld {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// connect to the database
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// create statement
			Statement stmt = con.createStatement();

			// execute the query
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

			// fetch the result
			while (rs.next()) {
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				System.out.println(empId + " " + empName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
