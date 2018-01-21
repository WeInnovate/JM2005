package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO EMP VALUES(1002, 'SOUPTIK');");
			if (i > 0) {
				System.out.println("Insertion successful.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
