package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");// register the driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsoftware", "root",
					"S@ir@m356");

			Statement stmt = con.createStatement();
		    int executeUpdate = stmt.executeUpdate("update customer set address = 'BhagatSingh road'where customer_id ='1'");
		    
		    System.out.println(executeUpdate);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
