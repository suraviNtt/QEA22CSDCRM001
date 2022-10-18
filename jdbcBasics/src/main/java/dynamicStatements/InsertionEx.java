package dynamicStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionEx {

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
			Connection conn =connectMysql();	
			//sql query
			String queryStatement = "insert into collection value(? , ?)";
			//Statement object 
			PreparedStatement s = conn.prepareStatement(queryStatement);
			s.setInt(1, 101);
			s.setInt(2, 2000);
			s.executeUpdate();
			s.setInt(1, 103);
			s.setInt(2, 2000);
			s.executeUpdate();
			s.setInt(1, 104);
			s.setInt(2, 2000);
			s.executeUpdate();
			
		
			//close connection with DB
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
