package ai.jobiak.coremvn;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
public class TestCInsert {

	public static void main(String[] args) throws SQLException, IOException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		
		String FilePath="courseList.csv";
		
		int batchSize=10;
		String sql="insert into courselist(CourseName.StudentName)"+"values(?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		BufferedReader lineReader=new BufferedReader(new FileReader(FilePath));
		String lineText=null;
		int count=0;
		lineReader.readLine();  //skip header line
		while((lineText = lineReader.readLine())!= null) {
			String[] data=lineText.split(",");
			String CourseName=data[0];
			String StudentName=data[1]; 
			pstmt.setString(1,CourseName);
			pstmt.setString(2,StudentName);
			pstmt.addBatch();
			if(count % batchSize==0) {
				pstmt.executeBatch();
			}
		}
		lineReader.close();
		//execute the remaining queries
		pstmt.executeBatch();
		System.out.println("values Inserted");
		//con.commit();
		con.close();
		
	}

}
