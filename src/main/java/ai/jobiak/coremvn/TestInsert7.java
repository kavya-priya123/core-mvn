package ai.jobiak.coremvn;
import java.sql.*;
public class TestInsert7 {
	public static void main(String[] args) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		Statement stmt=con.createStatement();
		String  insertSql51="insert into brazil values(1,'Jose','Male','Brazilian real')";
		String 	insertSql52="insert into brazil values(2,'Lucas','Male','Brazilian real')";
		String insertSql53="insert into brazil values(3,'Paulo','Male','Brazilian real')";
		String insertSql54="insert into brazil values(4,'Carlos','Male','Brazilian real')";
		String insertSql55="insert into brazil values(5,'Joao','Male','Brazilian real')";
		String insertSql56="insert into brazil values(6,'Ana','Female','Brazilian real')";
		String insertSql57="insert into brazil values(7,'Juliana','Female','Brazilian real')";
		String insertSql58="insert into brazil values(8,'Marcia','Female','Brazilian real')";
		String insertSql59="insert into brazil values(9,'Francisca','Female','Brazilian real')";
		String insertSql60="insert into brazil values(10,'Antonia','Female','Brazilian real')";
		long name51=stmt.executeUpdate(insertSql51);
		long name52=stmt.executeUpdate(insertSql52);
		long name53=stmt.executeUpdate(insertSql53);
		long name54=stmt.executeUpdate(insertSql54);
		long name55=stmt.executeUpdate(insertSql55);
		long name56=stmt.executeUpdate(insertSql56);
		long name57=stmt.executeUpdate(insertSql57);
		long name58=stmt.executeUpdate(insertSql58);
		long name59=stmt.executeUpdate(insertSql59);
		long name60=stmt.executeUpdate(insertSql60);
		System.out.println(name51);
		System.out.println(name52);
		System.out.println(name53);
		System.out.println(name54);
		System.out.println(name55);
		System.out.println(name56);
		System.out.println(name57);
		System.out.println(name58);
		System.out.println(name59);
		System.out.println(name60);
	}
}
