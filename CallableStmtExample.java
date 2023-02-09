package com.pratice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;



public class CallableStmtExample {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");// register the driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_coaching", "root",
				"S@ir@m356");
		

		CallableStatement stmt = con.prepareCall("{call test123(?,?)}");
		stmt.setString(1, "10112");
		stmt.setString(2, "goodevening");
		stmt.execute();

		System.out.println("success");
	}
}
