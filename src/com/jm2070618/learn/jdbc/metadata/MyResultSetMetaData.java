package com.jm2070618.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2070618_JDBC");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1) + "(" + rsmd.getColumnTypeName(1) + ")" + " "
					+ rsmd.getColumnName(2) + "(" + rsmd.getColumnTypeName(2) + ")");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
