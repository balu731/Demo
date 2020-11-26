package com;

import java.io.ObjectInputStream.GetField;
import java.sql.*;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		//useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		String url = "jdbc:mysql://localhost:3307?serverTimezone=UTC";
		String userName="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			Statement st = con.createStatement();
			String sql = "select * from bala.bn34";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				
			}
		
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
