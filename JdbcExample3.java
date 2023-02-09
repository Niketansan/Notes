package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample3 {
	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");// register the driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsoftware", "root",
					"S@ir@m356");

			Statement stmt = con.createStatement();
		    stmt.execute("create table testing123 (id varchar(24), name varchar(40)); ");
		    
		    System.out.println("created");
		    
		 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
