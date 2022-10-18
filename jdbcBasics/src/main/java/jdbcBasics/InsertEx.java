package jdbcBasics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {
	
	public static void main(String[] args) {
		
		Connection conn = MySqlDbConn.connectMysql();
		try {
			Statement s = conn.createStatement();
			s.execute("insert into employee values (104 , 'Rajni', 'Kolkata', 'WB')");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
