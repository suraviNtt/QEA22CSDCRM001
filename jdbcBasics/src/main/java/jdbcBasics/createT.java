package jdbcBasics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class createT {
	
public static void main(String[] args) {
		
		Connection conn = MySqlDbConn.connectMysql();
		try {
			Statement s = conn.createStatement();
			s.execute("create table collection (id int(20), amount int(30)) ");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
