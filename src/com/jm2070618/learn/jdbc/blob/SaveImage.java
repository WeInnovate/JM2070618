package com.jm2070618.learn.jdbc.blob;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class SaveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2070618_JDBC_IMG VALUES(?, ?)");
			pstmt.setString(1, "Prateek");

			FileInputStream fis = new FileInputStream("images/tech-word-cloud.jpg");
			pstmt.setBinaryStream(2, fis, fis.available());

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Image inserted successfully!");
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
