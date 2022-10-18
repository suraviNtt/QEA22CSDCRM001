package blobAclob;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C {

	public static Connection connectMysql() {
		String url = "jdbc:mysql://localhost/qae22csdcrm001";
		String username = "root";
		String password = "";
		Connection conn = null;

		// connecting with DB
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
			// connecting with DB
			Connection conn = connectMysql();
			// sql query
			String queryStatement = "insert into blobex value(? , ?)";
			// Statement object
			PreparedStatement s = conn.prepareStatement(queryStatement);
			s.setInt(1, 102);
			FileReader f = new FileReader("E://testing.txt");
			s.setClob(2, f);
			s.execute();

			String queryStatement1 = "Select * from blobex";
			// fetching the query result
			ResultSet rs = s.executeQuery(queryStatement1);

			// printing the result
			while (rs.next()) {
				int ind = rs.getInt(1);
				System.out.print(ind + "	");
				Clob c = rs.getClob(2);
				Reader read = c.getCharacterStream();
				FileWriter fo = new FileWriter("E://testing" + ind + ".txt");
				int i;
				while ((i = read.read()) != -1) {
					fo.write(i);

				}

				fo.close();

			}
			// close connection with DB
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
