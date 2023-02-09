package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcExample5 {
public static void main(String[] args) {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");// register the driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsoftware", "root",
					"S@ir@m356");
			
			String id ="101";
			
			String name = "Nikhil";

			PreparedStatement stmt=con.prepareStatement("insert into testing123 values(?,?)");  
			stmt.setString(1,id); 
			stmt.setString(2,name);  
	
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
		    
		 
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
