package ai.jobiak.coremvn;
import java.sql.*;
public class TestCallable1 {
	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connected to database......");
		/*
		//callable procedure
		CallableStatement cs=con.prepareCall("{call updateBalance(?,?)}");
		cs.setInt(1,411); cs.setDouble(2,2000);
		
		boolean result=cs.execute();
		System.out.println(result);*/
		
		//callable function
		CallableStatement cs2=con.prepareCall("{?=call addbalance(?,?)}");
		cs2.registerOutParameter(1,Types.DOUBLE);
		cs2.setInt(2,111);cs2.setDouble(3,2000);
		
		cs2.execute();
		System.out.println(cs2.getBoolean(1));
	}
}
