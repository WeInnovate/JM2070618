package com.jm2070618.learn.jdbc.blob;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class RetreiveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2070618_JDBC_IMG WHERE NAME = 'Prateek'");
			rs.next();
			String name = rs.getString(1);
			Blob b = rs.getBlob(2);
			byte[] bArr = b.getBytes(1, (int) b.length());
			FileOutputStream fos = new FileOutputStream("images/output.jpg");
			fos.write(bArr);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
