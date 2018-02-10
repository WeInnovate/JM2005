package com.atuldwivedi.jee.learn.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class InsertUsingPstmt {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO EMP VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enete user ID: ");
				int userId = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter user name: ");
				String userName = scan.nextLine();
				
				pstmt.setInt(1, userId);
				pstmt.setString(2, userName);
				
				pstmt.executeUpdate();
				
				System.out.print("Do you wish to cont...(Y/N): ");
				userChoice = scan.nextLine();
			}

			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
