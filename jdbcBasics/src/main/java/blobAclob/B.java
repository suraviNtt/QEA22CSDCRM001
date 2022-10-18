package blobAclob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B {

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
			FileInputStream f = new FileInputStream("E://avatargirl.jpg");
			s.setBlob(2, f);
			s.execute();

			String queryStatement1 = "Select * from blobex";
			// fetching the query result
			ResultSet rs = s.executeQuery(queryStatement1);

			// printing the result
			while (rs.next()) {
				int ind = rs.getInt(1);
				System.out.print(ind + "	");
				Blob b = rs.getBlob(2);
				byte[] arr = b.getBytes(1, (int) b.length());
				FileOutputStream fo = new FileOutputStream("E://avatargirlb"+ind+".jpg");
				fo.write(arr);
				fo.close();

			}
			// close connection with DB
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
