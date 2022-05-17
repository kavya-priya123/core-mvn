package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert6 {
	public static void main(String[] args) throws SQLException
	{
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url, userName, password);
	
	Statement stmt=con.createStatement();
	String  insertSql41="insert into mexico values(1,'Romina','Female','Mexican Peso')";
	String 	insertSql42="insert into mexico values(2,'Santiago','Male','Mexican Peso')";
	String insertSql43="insert into mexico values(3,'Mariana','Female','Mexican Peso')";
	String insertSql44="insert into mexico values(4,'Daniel','Male','Mexican Peso')";
	String insertSql45="insert into mexico values(5,'Camila','Female','Mexican Peso')";
	String insertSql46="insert into mexico values(6,'Matias','Male','Mexican Peso')";
	String insertSql47="insert into mexico values(7,'Victoria','Female','Mexican Peso')";
	String insertSql48="insert into mexico values(8,'Leonardo','Male','Mexican Peso')";
	String insertSql49="insert into mexico values(9,'Regina','Female','Mexican Peso')";
	String insertSql50="insert into mexico values(10,'Sebastian','Male','Mexican Peso')";
	long name41=stmt.executeUpdate(insertSql41);
	long name42=stmt.executeUpdate(insertSql42);
	long name43=stmt.executeUpdate(insertSql43);
	long name44=stmt.executeUpdate(insertSql44);
	long name45=stmt.executeUpdate(insertSql45);
	long name46=stmt.executeUpdate(insertSql46);
	long name47=stmt.executeUpdate(insertSql47);
	long name48=stmt.executeUpdate(insertSql48);
	long name49=stmt.executeUpdate(insertSql49);
	long name50=stmt.executeUpdate(insertSql50);
	System.out.println(name41);
	System.out.println(name42);
	System.out.println(name43);
	System.out.println(name44);
	System.out.println(name45);
	System.out.println(name46);
	System.out.println(name47);
	System.out.println(name48);
	System.out.println(name49);
	System.out.println(name50);
}
}
