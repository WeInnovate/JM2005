package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO EMP VALUES(1222, 'Moto');");

			if (i > 0) {
				System.out.println("Insertion successful.");
			}
//			con.commit();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
			while (rs.next()) {
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				System.out.println(empId + " " + empName);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
