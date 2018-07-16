package com.jm2070618.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class DeleteByTakingValuesFromUser {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2070618_JDBC WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter id who's record you want to delete: ");
				int id = Integer.parseInt(scan.nextLine());

				pstmt.setInt(1, id);

				int i = pstmt.executeUpdate();

				if (i > 0) {
					System.out.println("Records has been deleted successfully!");
				}

				System.out.print("Do you wish to continue...(Y/N) ");
				userChoice = scan.nextLine();

			} while (userChoice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
