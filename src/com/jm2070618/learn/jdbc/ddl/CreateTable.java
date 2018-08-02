package com.jm2070618.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			// Optional
			// Class.forName("org.h2.Driver");

			// 1. Establish the connection with the database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command

			Statement stmt = con.createStatement();
			// 3. execute the statement

//			boolean val = stmt.execute("CREATE TABLE JM2070618_JDBC(ID NUMBER, NAME VARCHAR)");
			boolean val = stmt.execute("CREATE TABLE JM2070618_JDBC_IMG(NAME VARCHAR, IMAGE BLOB)");
			if (!val) {
				System.out.println("Table is created successfully!");
			}

		} catch (SQLException /* | ClassNotFoundException */ e) {
			e.printStackTrace();
		}
	}

}
