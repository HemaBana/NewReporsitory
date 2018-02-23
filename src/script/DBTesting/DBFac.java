package script.DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public class DBFac 
{
public static void main(String[] args) 

{
	String query="select * from [dbo].[Documents]";
	Connection con=null;
	Statement stmt=null;
	ResultSet set=null;
	
	try{
	
	//Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		
		
		//Creating a connection to the database
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PMSWebTenantUAT_QA2","devlogin","1231!#HOLA!");
		
		System.out.println("Connection Success");
		
		
		//Executing SQL query and fetching the result
		
		stmt = con.createStatement();
		set=stmt.executeQuery(query);
		while(set.next()==true)
		{
			String s1=set.getString("FileName");
			System.out.println(s1);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				con.close();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		}
}