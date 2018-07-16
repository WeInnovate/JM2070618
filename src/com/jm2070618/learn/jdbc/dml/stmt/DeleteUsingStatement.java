package com.jm2070618.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) {
//1. Create connection
//		2. Create statement
//		3. Execute the query
//		4. Process the result

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("DELETE FROM JM2070618_JDBC WHERE ID = 1002");
			if (i > 0) {
				System.out.println("Records has been deleted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
