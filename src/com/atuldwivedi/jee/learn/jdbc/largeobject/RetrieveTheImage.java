package com.atuldwivedi.jee.learn.jdbc.largeobject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * CREATE TABLE PROFILE (NAME VARCHAR, PIC BLOB);
 * 
 * @author Atul Dwivedi
 *
 */
public class RetrieveTheImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Anuj Dwivedi\\Pictures\\img-out.png");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PROFILE");

			rs.next();

			String name = rs.getString(1);
			Blob b = rs.getBlob(2);
			byte[] byteArr = b.getBytes(1, (int) b.length());
			fout.write(byteArr);
			fout.close();	

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
