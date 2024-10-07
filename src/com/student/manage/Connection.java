package com.student.manage;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connection {
	
   static java.sql.Connection con;
	
	public static java.sql.Connection createConnection() {
	try {
	Class.forName("Driver.mysql.jdbc.Driver");
	String user = "root";
	String password = "root";
	String url = "jdbc:mysql://localhost:3306/student_manage";
	con = DriverManager.getConnection(url, user, password);
	
	
	} catch(Exception e) {
		e.printStackTrace();
	}
	return con;
  }

	public PreparedStatement prepareStatement(String q) {
		// TODO Auto-generated method stub
		return null;
	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}
