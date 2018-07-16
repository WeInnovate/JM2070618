package com.jm2070618.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class InsertByTakingValuesFromUser {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2070618_JDBC VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter id ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter name ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				int i = pstmt.executeUpdate();

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
