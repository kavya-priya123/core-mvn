package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert2 
{
	public static void main(String[] args) throws SQLException
	{
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url, userName, password);
	
	Statement stmt=con.createStatement();
	String insertSql11="insert values into saudi arabian values('Fatima','Female','Saudi arabian','Saudi Riyal')";
	String insertSql22="insert values into saudi arabian values('Amir','Male','Saudi arabian','Saudi Riyal')";
	String insertSql33="insert values into saudi arabian values('Aisha','Female','Saudi arabian','Saudi Riyal')";
	String insertSql44="insert values into saudi arabian values('Hadi','Male','Saudi arabian','Saudi Riyal')";
	String insertSql55="insert values into saudi arabian values('Amal','Female','Saudi arabian','Saudi Riyal')";
	String insertSql66="insert values into saudi arabian values('Sami','Male','Saudi arabian','Saudi Riyal')";
	String insertSql77="insert values into saudi arabian values('Maha','Female','Saudi arabian','Saudi Riyal')";
	String insertSql88="insert values into saudi arabian values('Abdul','Male','Saudi arabian','Saudi Riyal')";
	String insertSql99="insert values into saudi arabian values('Layla','Female','Saudi arabian','Saudi Riyal')";
	String insertSql100="insert values into saudi arabian values('Karim','Male','Saudi arabian','Saudi Riyal')";

	long name11=stmt.executeUpdate(insertSql11);
	long name22=stmt.executeUpdate(insertSql22);
	long name33=stmt.executeUpdate(insertSql33);
	long name44=stmt.executeUpdate(insertSql44);
	long name55=stmt.executeUpdate(insertSql55);
	long name66=stmt.executeUpdate(insertSql66);
	long name77=stmt.executeUpdate(insertSql77);
	long name88=stmt.executeUpdate(insertSql88);
	long name99=stmt.executeUpdate(insertSql99);
	long name100=stmt.executeUpdate(insertSql100);
	System.out.println(name11);
	System.out.println(name22);
	System.out.println(name33);
	System.out.println(name44);
	System.out.println(name55);
	System.out.println(name66);
	System.out.println(name77);
	System.out.println(name88);
	System.out.println(name99);
	System.out.println(name100);
}
}


