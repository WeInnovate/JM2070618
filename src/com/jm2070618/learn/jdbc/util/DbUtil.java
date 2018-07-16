package com.jm2070618.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbUtil {

	static Connection con;

	public static Connection getConnection() throws SQLException {
		if (con == null) {
			
			ResourceBundle rb = ResourceBundle.getBundle("db", Locale.US);
			String jdbcUrl = rb.getString("url");
			String jdbcUserName = rb.getString("userName");
			String jdbcPassword = rb.getString("password");
			
			con = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
		}
		return con;
	}
}
