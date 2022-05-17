package ai.jobiak.coremvn;
import java.sql.*;
public class TestJdbc1 {

	public static void main(String[] args) throws SQLException {
		//Connect with Driver Manager
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to database......");
			Statement st=con.createStatement();			//wire copper or plastic 3 plastic wires are wrapped one more plastic
			//statement is generic->common or wider or super
			String selectSQL="select * from customer where custid=101";//SEQUEL OR SQL syntax
			
			ResultSet rs=st.executeQuery(selectSQL);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			System.out.println(rsmd.getTableName(1));
			//System.out.println(rsmd.getSchemaName(0));
			System.out.println(rsmd.getCatalogName(1));
			
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnName(3));

			System.out.println(rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnTypeName(2));
			System.out.println(rsmd.getColumnTypeName(3));
			
			System.out.println(rsmd.isNullable(1)); //it returns int
			
			System.out.println(rsmd.getPrecision(3));
			System.out.println(rsmd.getPrecision(2));
			System.out.println(rsmd.getScale(3));
			System.out.println(rsmd.getScale(2));

			/*while(rs.next()) //next() returns true when a record is found
			{
				System.out.println("data found");
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				
			}*/
	}

}
