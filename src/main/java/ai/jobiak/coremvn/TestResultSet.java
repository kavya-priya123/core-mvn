package ai.jobiak.coremvn;
import java.sql.*;
public class TestResultSet {
	
	public static void main(String[] args) throws Exception {
		//1.load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Connect with Driver Manager
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
			
			Connection con=DriverManager.getConnection(url,userName,password);  //OLTP-backup-warehouse
			System.out.println("Connected to database......");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			//Statement st=con.createStatement();			//wire copper or plastic 3 plastic wires are wrapped one more plastic
			//statement is generic->common or wider or super
			String selectSQL="select * from customer";   //SEQUEL OR SQL syntax
			
			ResultSet rs=st.executeQuery(selectSQL);
			//Read only and forward only-scrolls forward
			//pagination--email box
			//while(rs.next())
			//{
				rs.afterLast();	//	ENTER which record to see 4 go to fourth record first goto first record
				rs.previous();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.first();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.next();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.absolute(10);	//with reference to first record from the begining
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				//}
			
	}

}
