package com.jm2070618.learn.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2070618.learn.jdbc.util.DbUtil;

public class InsertBatchUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2070618_JDBC VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter Id: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				pstmt.addBatch();

				System.out.print("Do you wish to continue... ");
				userChoice = scan.nextLine();

			} while (userChoice.equalsIgnoreCase("y"));

			int[] arr = pstmt.executeBatch();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (SQLException e) {
		}
	}

}
