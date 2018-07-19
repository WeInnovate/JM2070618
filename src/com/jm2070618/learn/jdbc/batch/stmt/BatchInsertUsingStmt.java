package com.jm2070618.learn.jdbc.batch.stmt;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class BatchInsertUsingStmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			Statement stmt = con.createStatement();
			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter Id: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				stmt.addBatch("INSERT INTO JM2070618_JDBC VALUES(" + id + ", '" + name + "')");

				System.out.print("Do you wish to continue... ");
				userChoice = scan.nextLine();

			} while (userChoice.equalsIgnoreCase("y"));

			int[] arr = stmt.executeBatch();

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (SQLException e) {
		}
	}

}
