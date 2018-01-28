package com.atuldwivedi.jee.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class CreateUserTable {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE USER(USER_ID NUMBER, USER_NAME VARCHAR, AGE NUMBER, GENDER VARCHAR);");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
