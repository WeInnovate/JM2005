package com.atuldwivedi.jee.learn.jdbc.dml.batch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.atuldwivedi.jee.learn.jdbc.util.DbUtil;

public class BatchInsertUsingStmt {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConn()) {

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			Statement stmt = con.createStatement();

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.println("Enter user details(userId, userName, age, gender): ");

				long id = Long.parseLong(scan.nextLine());
				String name = scan.nextLine();
				int age = Integer.parseInt(scan.nextLine());
				String gender = scan.nextLine();

				stmt.addBatch("INSERT INTO USER VALUES(" + id + ", '" + name + "', " + age + ", '" + gender + "')");

				System.out.print("Do you wish to cont... (Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] arr = stmt.executeBatch();
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
