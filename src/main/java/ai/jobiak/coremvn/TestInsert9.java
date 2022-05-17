package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert9 {
	public static void main(String[] args) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String  insertSql71="insert into australia values(1,'Charlotte','Smith','Female',28,'Australian Dollar')";
		String 	insertSql72="insert into australia values(12,'Oliver','Jones','Male',34,'Australian Dollar')";
		String insertSql73="insert into australia values(13,'Leo','Williams','Male',56,'Australian Dollar')";
		String insertSql74="insert into australia values(14,'Olivia','Brown','Female',47,'Australian Dollar')";
		String insertSql75="insert into australia values(15,'Isla','Wilson','Female',37,'Australian Dollar')";
		String insertSql76="insert into australia values(16,'Noah','White','Male',29,'Australian Dollar')";
		String insertSql77="insert into australia values(17,'Henry','Kelly','Male',59,'Australian Dollar')";
		String insertSql78="insert into australia values(18,'Grace','Ryan','Female',68,'Australian Dollar')";
		String insertSql79="insert into australia values(19,'Mia','Hill','Female',52,'Australian Dollar')";
		String insertSql80="insert into australia values(20,'Thomas','Moore','Male',16,'Australian Dollar')";
		long name71=stmt.executeUpdate(insertSql71);
		long name72=stmt.executeUpdate(insertSql72);
		long name73=stmt.executeUpdate(insertSql73);
		long name74=stmt.executeUpdate(insertSql74);
		long name75=stmt.executeUpdate(insertSql75);
		long name76=stmt.executeUpdate(insertSql76);
		long name77=stmt.executeUpdate(insertSql77);
		long name78=stmt.executeUpdate(insertSql78);
		long name79=stmt.executeUpdate(insertSql79);
		long name80=stmt.executeUpdate(insertSql80);
		System.out.println(name71);
		System.out.println(name72);
		System.out.println(name73);
		System.out.println(name74);
		System.out.println(name75);
		System.out.println(name76);
		System.out.println(name77);
		System.out.println(name78);
		System.out.println(name79);
		System.out.println(name80);
		
	}
}
