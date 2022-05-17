package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert3 
{
	public static void main(String[] args) throws SQLException
	{
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url, userName, password);
	
	Statement stmt=con.createStatement();
	String  insertSql11="insert into south korea values ('Dong-Hyun','Male','South Korean Won')";
	String 	insertSql12="insert into south korea values('Seo-yeon','Female','South Korean Won')";
	String insertSql13="insert into south korea values ('Jung-Hoon','Male','South Korean Won')";
	String insertSql14="insert into south korea values('Seo-yun','Female','South Korean Won')";
	String insertSql15="insert into south korea values('Sung-Ho','Male','South Korean Won')";
	String insertSql16="insert into south korea values('Hau-en','Female','South Korean Won')";
	String insertSql17="insert into south korea values('Han-Gyeol','Male','South Korean Won')";
	String insertSql18="insert into south korea values('Yun-seo','Female','South Korean Won')";
	String insertSql19="insert into south korea values('Hyun-Woo','Male','South Korean Won')";
	String insertSql20="insert into south korea values('Ji-min','Female','South Korean Won')";
	long name11=stmt.executeUpdate(insertSql11);
	long name12=stmt.executeUpdate(insertSql12);
	long name13=stmt.executeUpdate(insertSql13);
	long name14=stmt.executeUpdate(insertSql14);
	long name15=stmt.executeUpdate(insertSql15);
	long name16=stmt.executeUpdate(insertSql16);
	long name17=stmt.executeUpdate(insertSql17);
	long name18=stmt.executeUpdate(insertSql18);
	long name19=stmt.executeUpdate(insertSql19);
	long name20=stmt.executeUpdate(insertSql20);
	System.out.println(name11);
	System.out.println(name12);
	System.out.println(name13);
	System.out.println(name14);
	System.out.println(name15);
	System.out.println(name16);
	System.out.println(name17);
	System.out.println(name18);
	System.out.println(name19);
	System.out.println(name20);
}
}