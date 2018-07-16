package com.jm2070618.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) {
//1. Create connection
//		2. Create statement
//		3. Execute the query
//		4. Process the result

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO JM2070618_JDBC VALUES(1002, 'Saching')");
			if (i > 0) {
				System.out.println("Records has been inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
