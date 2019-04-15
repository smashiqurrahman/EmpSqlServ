package db;

import java.sql.*;

public class DbConnection {
	public static void main(String[] args) {
		
		//Create a variable for the connection string
		String connectionUrl = "jdbc:sqlserver://vNTDACWSSQLD002:1433;"
				+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
		
		//Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Establish the connection
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection Established");
			
			//Create and execute an SQL statement that returns some data
			String SQL = "SELECT * FROM Ashiq_employee_table";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			
			//Iterate through the data in the result set and display it.
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		try {
//			
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			String url="jdbc:sqlserver://localhost:1443;databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
//			Connection con = DriverManager.getConnection(url);
//			String sql = "SELECT * FROM Ashiq_employee_table";
//			PreparedStatement pst = con.prepareStatement(sql);
//			ResultSet rs = pst.executeQuery();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	
}
