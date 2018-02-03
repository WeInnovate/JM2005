package com.atuldwivedi.jee.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LearnDatabaseMetaData {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverMinorVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
