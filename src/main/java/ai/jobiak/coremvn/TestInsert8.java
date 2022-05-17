package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert8 {
	public static void main(String[] args) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String  insertSql61="insert into kuwait values(1,'Aarmaan','Male','Kuwaiti Dinar')";
		String 	insertSql62="insert into kuwait values(2,'Aasaal','Male','Kuwaiti Dinar')";
		String insertSql63="insert into kuwait values(3,'Pabel','Male','Kuwaiti Dinar')";
		String insertSql64="insert into kuwait values(4,'Kaami','Male','Kuwaiti Dinar')";
		String insertSql65="insert into kuwait values(5,'Haajeeth','Male','Kuwaiti Dinar')";
		String insertSql66="insert into kuwait values(6,'Ahlam','Female','Kuwaiti Dinar')";
		String insertSql67="insert into kuwait values(7,'Amira','Female','Kuwaiti Dinar')";
		String insertSql68="insert into kuwait values(8,'Faiqa','Female','Kuwaiti Dinar')";
		String insertSql69="insert into kuwait values(9,'Husna','Female','Kuwaiti Dinar')";
		String insertSql70="insert into kuwait values(10,'Makarim','Female','Kuwaiti Dinar')";
		long name61=stmt.executeUpdate(insertSql61);
		long name62=stmt.executeUpdate(insertSql62);
		long name63=stmt.executeUpdate(insertSql63);
		long name64=stmt.executeUpdate(insertSql64);
		long name65=stmt.executeUpdate(insertSql65);
		long name66=stmt.executeUpdate(insertSql66);
		long name67=stmt.executeUpdate(insertSql67);
		long name68=stmt.executeUpdate(insertSql68);
		long name69=stmt.executeUpdate(insertSql69);
		long name70=stmt.executeUpdate(insertSql70);
		System.out.println(name61);
		System.out.println(name62);
		System.out.println(name63);
		System.out.println(name64);
		System.out.println(name65);
		System.out.println(name66);
		System.out.println(name67);
		System.out.println(name68);
		System.out.println(name69);
		System.out.println(name70);
	}
}
