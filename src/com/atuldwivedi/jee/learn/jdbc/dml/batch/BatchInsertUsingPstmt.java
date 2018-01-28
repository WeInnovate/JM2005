package com.atuldwivedi.jee.learn.jdbc.dml.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class BatchInsertUsingPstmt {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO USER VALUES(?, ?, ?, ?)");

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.println("Enter user details(userId, userName, age, gender): ");

				long id = Long.parseLong(scan.nextLine());
				String name = scan.nextLine();
				int age = Integer.parseInt(scan.nextLine());
				String gender = scan.nextLine();

				
				pstmt.setLong(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setString(4, gender);
				
				
				pstmt.addBatch();

				System.out.print("Do you wish to cont... (Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] arr = pstmt.executeBatch();
			for (int j = 0; j < arr.length; j++) {
				if (j != arr.length - 1) {
					System.out.print(arr[j] + ", ");
				} else {
					System.out.print(arr[j]);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
