package jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDbConn {
	
	public static Connection connectMysql() {
		String url = "jdbc:mysql://localhost/qae22csdcrm001";
		String username = "root";
		String password = "";
		Connection conn = null;
		
			//connecting with DB
			try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
	}

	public static void main(String[] args) {
		
		try {
			//connecting with DB
			Connection conn =connectMysql();			//Statement object 
			Statement s = conn.createStatement();
			//sql query
			String queryStatement = "Select * from employee";
			//fetching the query result
			ResultSet rs = s.executeQuery(queryStatement);
			
			//printing the result
			while (rs.next()) {
			System.out.print(rs.getInt(1)+ "	");
			System.out.print(rs.getString(2)+ "	");
			System.out.print(rs.getString(3)+ "	");
			System.out.print(rs.getString(4)+ "	");
				System.out.println("");
			}
			//close connection with DB
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
