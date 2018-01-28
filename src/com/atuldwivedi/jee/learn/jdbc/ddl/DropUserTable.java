package com.atuldwivedi.jee.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class DropUserTable {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			Statement stmt = con.createStatement();
			stmt.execute("DROP TABLE USER");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
