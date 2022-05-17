package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert1
{
			public static void main(String[] args) throws SQLException
			{
				String userName="root";
				String password="admin";
				String url="jdbc:mysql://localhost:3306/world";
				Connection con=DriverManager.getConnection(url, userName, password);
				
				Statement stmt=con.createStatement();
				String  insertSql1="insert into china values (123,'Muchen','Ruoxi','China')";
				String 	insertSql2="insert into china values(456,'Haoyu','Yinuo','China')";
				String insertSql3="insert into china values (789,'Yichen','Yihan','China')";
				String insertSql4="insert into china values(567,'Mingze','Zihan','China')";
				String insertSql5="insert into china values(234,'Yuze','Yimo','China')";
				String insertSql6="insert into china values(678,'Muyang','Yuxi','China')";
				String insertSql7="insert into china values(890,'Haoran','Yutong','China')";
				String insertSql8="insert into china values(145,'Yize','Xinyi','China')";
				String insertSql9="insert into china values(267,'Yuxuan','Yihan','China')";
				String insertSql10="insert into china values(467,'Feng','An','China')";
				long name1=stmt.executeUpdate(insertSql1);
				long name2=stmt.executeUpdate(insertSql2);
				long name3=stmt.executeUpdate(insertSql3);
				long name4=stmt.executeUpdate(insertSql4);
				long name5=stmt.executeUpdate(insertSql5);
				long name6=stmt.executeUpdate(insertSql6);
				long name7=stmt.executeUpdate(insertSql7);
				long name8=stmt.executeUpdate(insertSql8);
				long name9=stmt.executeUpdate(insertSql9);
				long name10=stmt.executeUpdate(insertSql10);
				System.out.println(name1);
				System.out.println(name2);
				System.out.println(name3);
				System.out.println(name4);
				System.out.println(name5);
				System.out.println(name6);
				System.out.println(name7);
				System.out.println(name8);
				System.out.println(name9);
				System.out.println(name10);
			}
}