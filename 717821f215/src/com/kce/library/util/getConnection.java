package com.kce.library.util;
import java.sql.*;
public class getConnection {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","gugan","admin");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
public static void main(String[] args) {
	getConnection();
	System.out.println("connected");
}
}
