package ai.jobiak.coremvn;
import java.sql.*;
public class ResultSet1 {
	
	public static void main(String[] args) throws Exception {
		//1.load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Connect with Driver Manager
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);  //OLTP-backup-warehouse
			System.out.println("Connected to database......");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//Statement st=con.createStatement();			//wire copper or plastic 3 plastic wires are wrapped one more plastic
			//statement is generic->common or wider or super
			String selectSQL="select * from customer";   //SEQUEL OR SQL syntax
			
			ResultSet rs=st.executeQuery(selectSQL);
			if(rs.next())
			{
				rs.moveToInsertRow();
				
				rs.updateInt(1,410);
				rs.updateString(2,"Mitchel Lee");
				rs.updateDouble(3,3420);
				rs.insertRow();
				rs.last();
			}
				System.out.println(rs.getInt(1)+"::"+rs.getString(2)+"::"+rs.getDouble(3));	//String is mother of all types
		}		
}