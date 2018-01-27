package com.atuldwivedi.jee.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			PreparedStatement pstmt = con.prepareStatement("DELETE FROM EMP WHERE EMP_ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enter user ID: ");
				int userId = Integer.parseInt(scan.nextLine());

				pstmt.setInt(1, userId);

				int i = pstmt.executeUpdate();

				if (i > 0) {
					System.out.println("Deletion successful.");
				}

				System.out.print("Do you wish to continue?: ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
