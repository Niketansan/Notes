package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample4 {
public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");// register the driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsoftware", "root",
					"S@ir@m356");

			Statement stmt = con.createStatement();
		    stmt.execute("INSERT INTO testing123 (id, name) values ('1','sai'); ");
		    
		    System.out.println("inserted");
		    
		 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
