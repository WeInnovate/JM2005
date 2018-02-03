package com.atuldwivedi.jee.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
public class LearnResultSetMetaData {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// connect to the database
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// create statement
			Statement stmt = con.createStatement();

			// execute the query
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Table: "+rsmd.getTableName(1));
			System.out.print(rsmd.getColumnName(1)+" ("+rsmd.getColumnTypeName(1)+")  ");

			System.out.println(rsmd.getColumnName(2)+" ("+rsmd.getColumnTypeName(2)+")");

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
