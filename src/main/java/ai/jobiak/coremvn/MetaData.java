package ai.jobiak.coremvn;
import java.sql.*;
public class MetaData {
//to know information of databases independently,we use metadata
	
	public static void main(String[] args) throws SQLException {
		
		String userName ="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		 
		Connection con=DriverManager.getConnection(url, userName, password);
		System.out.println("Connected to Database..");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDriverVersion());
		System.out.println(dbmd.getDriverMajorVersion());
		System.out.println(dbmd.getDriverMinorVersion());
		System.out.println(dbmd.getDriverName());
		

	}

}
