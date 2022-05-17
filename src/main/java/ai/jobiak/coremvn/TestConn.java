package ai.jobiak.coremvn;

import java.sql.*;

public class TestConn {

	public static void main(String[] args)  {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to database......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
