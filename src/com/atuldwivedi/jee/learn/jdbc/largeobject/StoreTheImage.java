package com.atuldwivedi.jee.learn.jdbc.largeobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CREATE TABLE PROFILE (NAME VARCHAR, PIC BLOB);
 * 
 * @author Atul Dwivedi
 *
 */
public class StoreTheImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			FileInputStream fin = new FileInputStream("C:\\Users\\Anuj Dwivedi\\Pictures\\img.png");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO PROFILE VALUES(?, ?)");
			pstmt.setString(1, "Atul");
			pstmt.setBinaryStream(2, fin, fin.available());
			pstmt.executeUpdate();
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
