package ai.jobiak.coremvn;
import java.sql.*;
public class TestPreapredStatement {
	public static void main(String args[]) throws SQLException
	{
		
		String url="jdbc:mysql://localhost:3306/world";
		String userName="root";
		String password="admin";
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		/*PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?)");
		pstmt.setInt(1,401);
		pstmt.setString(2,"Loo");
		pstmt.setDouble(3,1000);
		
		int count =pstmt.executeUpdate();
		System.out.println(count+"record inserted");
	
		String names[]={"Li","Xi","Xing","Lee","Pie","Poo","Woo","Wan","Zan","Chifu"};
		double deposits[]= {200,320,340,232,2324,454,542,24,65,784,201};
				for(int i=1;i<names.length;i++) {
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?)");
			pstmt.setInt(1,i+401);
			pstmt.setString(2,names[i]);
			pstmt.setDouble(3,deposits[i]);//trade oil->software engineers raw drugs--medicines
			int count =pstmt.executeUpdate();
			System.out.println(count+"record inserted");
		
		//update with Prepared Statement
		 /* PreparedStatement pstmt=con.prepareStatement("update customer set balance=balance+?");
		pstmt.setInt(1,0);
		int count=pstmt.executeUpdate();
		System.out.println(count+"records updated");
		
		
		
		//particular update with Prepared Statement
		PreparedStatement pstmt=con.prepareStatement("update customer set balance=balance+? where custid=?");
		pstmt.setDouble(1,222);
		pstmt.setInt(2,401);
		int count=pstmt.executeUpdate();
		System.out.println(count+"records updated");
	*/
		//Delete with Prepared statement
		PreparedStatement pstmt=con.prepareStatement("delete from customer where custid=?");
		pstmt.setInt(1,410);     //mapping java types to sql/all databases
		int count=pstmt.executeUpdate();
		System.out.println(count+"record deleted");
	}
}

