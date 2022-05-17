package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert4 {
	public static void main(String[] args) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String  insertSql21="insert into japan values('Himari','Female','Japanese yen')";
		String 	insertSql22="insert into japan values('Yuto','Male','Japanese yen')";
		String insertSql23="insert into japan values('Ayumu','Male','Japanese yen')";
		String insertSql24="insert into japan values('Arata','Male','Japanese yen')";
		String insertSql25="insert into japan values('Hina','Female','Japanese yen')";
		String insertSql26="insert into japan values('Ren','Male','Japanese yen')";
		String insertSql27="insert into japan values('Akari','Female','Japanese yen')";
		String insertSql28="insert into japan values('Sara','Female','Japanese yen')";
		String insertSql29="insert into japan values('Haruki','Male','Japanese yen')";
		String insertSql30="insert into japan values('Sakura','Female','Japanese yen')";
		long name21=stmt.executeUpdate(insertSql21);
		long name22=stmt.executeUpdate(insertSql22);
		long name23=stmt.executeUpdate(insertSql23);
		long name24=stmt.executeUpdate(insertSql24);
		long name25=stmt.executeUpdate(insertSql25);
		long name26=stmt.executeUpdate(insertSql26);
		long name27=stmt.executeUpdate(insertSql27);
		long name28=stmt.executeUpdate(insertSql28);
		long name29=stmt.executeUpdate(insertSql29);
		long name30=stmt.executeUpdate(insertSql30);
		System.out.println(name21);
		System.out.println(name22);
		System.out.println(name23);
		System.out.println(name24);
		System.out.println(name25);
		System.out.println(name26);
		System.out.println(name27);
		System.out.println(name28);
		System.out.println(name29);
		System.out.println(name30);
	}
}
		
