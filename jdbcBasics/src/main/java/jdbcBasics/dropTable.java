package jdbcBasics;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class dropTable {

	public static void main(String[] args) {

		Connection conn = MySqlDbConn.connectMysql();
		try {
			Statement s = conn.createStatement();
			s.execute("drop table collection");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
