package com.jm2070618.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertByTakingValuesFromUser {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

//			take values from user in console
			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter id ");
				int id = Integer.parseInt(scan.nextLine());
//				int id = scan.nextInt();

				System.out.print("Please enter name ");
				String name = scan.nextLine();

				int i = stmt.executeUpdate("INSERT INTO JM2070618_JDBC VALUES(" + id + ", '" + name + "')");
				if (i > 0) {
					System.out.println("Records has been inserted successfully!");
				}

				System.out.print("Do you wish to continue...(Y/N) ");
				userChoice = scan.nextLine();

			} while (userChoice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
