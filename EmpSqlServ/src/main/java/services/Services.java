package services;

import model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


import dao.*;

public class Services implements Dao{
	
	//String id,String name,String age,String salary,String email,String address
	public String connectionUrl = "jdbc:sqlserver://vNTDACWSSQLD002:1433;"
			+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
	
	@Override
	public int addemp(Employee E) {
		int a=0;
		String empID = E.getId();
		String empName = E.getName();
		String empAge = E.getAge();
		String empSalary = E.getSalary();
		String empEmail = E.getEmail();
		String empAddress = E.getAddress();
		
		String sql = "insert into Ashiq_employee_table(id,name,age,salary,email,address) values('"+empID+"','"+empName+"','"+empAge+"','"+empSalary+"','"+empEmail+"','"+empAddress+"')";
		
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			java.sql.Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Employee "+ empID +"  Added...!");
			return ++a;
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			return a;
		}		
		
	}
	@Override
	public int delemp(int id) {
		int a=0;
		String empID=String.valueOf(id);
		String sql="delete from Ashiq_employee_table where id='"+empID+"'";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			java.sql.Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Employee "+ empID +" Deleted...!");
			return ++a;
		} catch (Exception e4) {
			System.out.println(e4.getMessage());
			return a;
		}	
	}
	@Override
	public int serachemp(int id) {
		int a=0;
		String empID=String.valueOf(id);
		String sql="select * from Ashiq_employee_table where id='"+empID+"'";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			java.sql.Statement statement = connection.createStatement();
			ResultSet result= statement.executeQuery(sql);
			ResultSetMetaData r1 = result.getMetaData();
			int c = r1.getColumnCount();
			while(result.next())
			{
				for(int i=1; i<c; i++)
				{
					System.out.println(result.getString(i));
				}
			}
			connection.close();
			System.out.println("Employee "+ empID +" Found...!");
			return ++a;
	}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
			return a;
			}
		}
	@Override
	public int upemp(String id,String name,String age,String salary,String email,String address) {
		int a=0;
		String empID = id;
		String empName = name;
		String empAge = age;
		String empSalary = salary;
		String empEmail = email;
		String empAddress = address;
		String sql="update Ashiq_employee_table set name='"+empName+"',age='"+empAge+"',salary='"+empSalary+"',email='"+empEmail+"',address='"+empAddress+"' where id='"+empID+"'";
		
		try {
			Connection connection=DriverManager.getConnection(connectionUrl);
			java.sql.Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("Employee "+ empID +" Updated...!");
			return ++a;
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			return a;
		}
		
		
	}
	
	

}
