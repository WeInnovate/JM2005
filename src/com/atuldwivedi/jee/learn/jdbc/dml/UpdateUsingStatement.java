package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingStatement {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("UPDATE EMP SET EMP_NAME = 'Souptik' WHERE EMP_ID = 1002");
			if (i > 0) {
				System.out.println("Update successful.");
			}
			else {
				System.out.println("Nothing to update.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
