package jdbcBasics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEx {
	
public static void main(String[] args) {
		
		Connection conn = MySqlDbConn.connectMysql();
		try {
			Statement s = conn.createStatement();
			s.execute("Update employee set ename = 'Ravi' where eid = 103");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
