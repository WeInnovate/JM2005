package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class DeleteUsingStatement {
	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("DELETE FROM EMP WHERE EMP_ID = 1012");
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
