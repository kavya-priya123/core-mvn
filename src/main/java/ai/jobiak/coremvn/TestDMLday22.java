package ai.jobiak.coremvn;
import java.sql.*;
public class TestDMLday22 {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password);
		//System.out.println(con);
		//statement is a generic and an interface and it has no object//synonym of generic is wider/common/super
		Statement stmt=con.createStatement();
		String insertSql="insert into customer values(132,'Zyang Xui',600)";//single quotes must for char,varchar,text and date column types
		long count=stmt.executeUpdate(insertSql);
		String insertSql1="insert into customer values(102,'Chen',400)";
		long count1=stmt.executeUpdate(insertSql1);
		String insertSql2="insert into customer values(103,'Zhang',900)";
		long count2=stmt.executeUpdate(insertSql2);
		String insertSql3="insert into customer values(104,'Zhi Ruo',300)";
		long count3=stmt.executeUpdate(insertSql3);
		String insertSql4="insert into customer values(105,'Wang Shu',6000)";
		long count4=stmt.executeUpdate(insertSql4);
		String insertSql5="insert into customer values(106,'Fei Hong',7900)";
		long count5=stmt.executeUpdate(insertSql5);
		String insertSql6="insert into customer values(107,'Ru Shi',8030)";
		long count6=stmt.executeUpdate(insertSql6);
		String insertSql7="insert into customer values(108,'Mo Chou',4650)";
		long count7=stmt.executeUpdate(insertSql7);
		String insertSql8="insert into customer values(109,'Kai',650)";
		long count8=stmt.executeUpdate(insertSql8);
		String insertSql9="insert into customer values(110,'Bing Wen',2050)";
		long count9=stmt.executeUpdate(insertSql9);
		String insertSql10="insert into customer values(111,'Yan Hao',250)";
		long count10=stmt.executeUpdate(insertSql10);
		String insertSql11="insert into customer values(112,'Souta',950)";
		long count11=stmt.executeUpdate(insertSql11);
		String insertSql12="insert into customer values(113,'Hayato',7870)";
		long count12=stmt.executeUpdate(insertSql12);
		String insertSql13="insert into customer values(114,'Liu Wei',3460)";
		long count13=stmt.executeUpdate(insertSql13);
		String insertSql14="insert into customer values(115,'Wang Jing',1870)";
		long count14=stmt.executeUpdate(insertSql14);
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
		System.out.println(count10);
		System.out.println(count11);
		System.out.println(count12);
		System.out.println(count13);
		System.out.println(count14);
	}

}
