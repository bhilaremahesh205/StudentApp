package com.student.manage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDAO {
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
		java.sql.Connection con = Connection.createConnection();
		String q = "insert into students(sname,sphone,scity) values(?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		pstmt.executeUpdate();
		f=true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
		java.sql.Connection con = Connection.createConnection();
		String q = "delete from students where sid=?";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1, userId);
		
		pstmt.executeUpdate();
		f=true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return f;
	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		
		try {
			java.sql.Connection con = Connection.createConnection();
			String q = "select * from students";
			
			 Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);

			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(3);
				
				System.out.println("ID:" + id);
				System.out.println("Name:"+ name);
				System.out.println("Phone:"+ phone);
				System.out.println("City:" + city);
				System.out.println("********************");			
			}		
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}

