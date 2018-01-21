package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("DELETE FROM EMP WHERE EMP_ID = 1001");
			if (i > 0) {
				System.out.println("Delete successful.");
			}
			else {
				System.out.println("Nothing to delete.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
