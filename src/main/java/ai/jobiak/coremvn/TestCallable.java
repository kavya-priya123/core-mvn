package ai.jobiak.coremvn;
import java.sql.*;
public class TestCallable {
	
	public static void main(String[] args) throws Exception {
		//1.load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Connect with Driver Manager
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);  //OLTP-backup-warehouse
		System.out.println("Connected to database......");
		//callable statement->functions,procedures and REF cursors db objects
			//procedure called updateBalance(custId,amount)and updates the balance of the customer
		
			CallableStatement cs=con.prepareCall("{call updateBalance(?,?)}");
			cs.setInt(1,408);
			cs.setDouble(2,2225);
			
			boolean result=cs.execute();
			System.out.println(result);
		}
}