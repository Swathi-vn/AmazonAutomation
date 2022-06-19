package com.amazon.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCAmazon {

	public static void main(String[] args)  {
		
	
		
	}
	
	public List<String> fetchDataFromDB() throws SQLException, ClassNotFoundException{
		List<String> records = new ArrayList<String>();
		
		String qry = "select * from delllist";
		Class.forName("com.mysql.jdbc.Driver");
		
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "root");
	    Statement statement = conn.createStatement();
	    ResultSet rs = statement.executeQuery(qry);
	    if (rs.next()) {
			records.add(rs.getString(1));
			System.out.println(rs.getString(1));
	    }
//	    if (rs.next()) {
//	    	records.add(rs.getString(1));
//	    	System.out.println(rs.getString(1));
//	    }
//		
	    return records;
	}
}

	   
	
	
		




