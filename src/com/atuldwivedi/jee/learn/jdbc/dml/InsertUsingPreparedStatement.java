package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO EMP VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enter user ID: ");
				int userId = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter user name: ");
				String userName = scan.nextLine();

				pstmt.setInt(1, userId);
				pstmt.setString(2, userName);

				int i = pstmt.executeUpdate();

				if (i > 0) {
					System.out.println("Insertion successful.");
				}

				System.out.print("Do you wish to continue?: ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
