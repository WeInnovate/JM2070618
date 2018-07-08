package com.jm2070618.learn.jdbc.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		// 1. Create connection
//		2. Create statement
//		3. Execute the query
//		4. Process the result
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2070618_JDBC");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}

		} catch (SQLException e) {
		}
	}

}
