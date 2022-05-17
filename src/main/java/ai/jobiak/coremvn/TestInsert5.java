package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert5 {
	public static void main(String[] args) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		Statement stmt=con.createStatement();
		String  insertSql31="insert into germany values(1,'Jurgen','Male','Euro')";
		String 	insertSql32="insert into germany values(2,'Emma','Female','Euro')";
		String insertSql33="insert into germany values(3,'Stefan','Male','Euro')";
		String insertSql34="insert into germany values(4,'Jurgen','Male','Euro')";
		String insertSql35="insert into germany values(5,'Mila','Female','Euro')";
		String insertSql36="insert into germany values(6,'Hans','Male','Euro')";
		String insertSql37="insert into germany values(7,'Sophia','Female','Euro')";
		String insertSql38="insert into germany values(8,'Gunter','Male','Euro')";
		String insertSql39="insert into germany values(9,'Lina','Female','Euro')";
		String insertSql40="insert into germany values(10,'Walter','Male','Euro')";
		long name31=stmt.executeUpdate(insertSql31);
		long name32=stmt.executeUpdate(insertSql32);
		long name33=stmt.executeUpdate(insertSql33);
		long name34=stmt.executeUpdate(insertSql34);
		long name35=stmt.executeUpdate(insertSql35);
		long name36=stmt.executeUpdate(insertSql36);
		long name37=stmt.executeUpdate(insertSql37);
		long name38=stmt.executeUpdate(insertSql38);
		long name39=stmt.executeUpdate(insertSql39);
		long name40=stmt.executeUpdate(insertSql40);
		System.out.println(name31);
		System.out.println(name32);
		System.out.println(name33);
		System.out.println(name34);
		System.out.println(name35);
		System.out.println(name36);
		System.out.println(name37);
		System.out.println(name38);
		System.out.println(name39);
		System.out.println(name40);
	}
}
