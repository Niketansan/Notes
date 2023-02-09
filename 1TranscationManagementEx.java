package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscationManagementEx {
	public static void main(String args[]) throws SQLException {
		
		
		Date dt = new Date();
		
		System.out.println(dt.getDate());
		System.out.println(dt.getDay());
		
		

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_coaching", "root", "S@ir@m356");
			con.setAutoCommit(false);
			String id = "1011191";

			String name = "Nikhil";

			PreparedStatement stmt = con.prepareStatement("insert into testing123 values(?,?)");
			stmt.setString(1, id);
			stmt.setString(2, name);
		

			con.commit();
			con.close();
		} catch (Exception e) {
            con.rollback();
			e.printStackTrace();
		}
	}
}
