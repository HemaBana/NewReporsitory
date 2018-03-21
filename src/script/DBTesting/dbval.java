package script.DBTesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class dbval {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:sqlserver://pmswebdatabasedev.database.windows.net;databaseName=PMSWebTenantDB_UAT_QA1;user=qalogin;password=1231!#HOLA!";
		
		 String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		 Class.forName(driver);

		 Connection conn = DriverManager.getConnection(url);
		 Statement statement = conn.createStatement();
		 System.out.println("pass");
		 ResultSet resultSet = statement.executeQuery("select * from [dbo].[Claims] where ClaimId='ACF622C0-8B70-4FFE-8DD6-02C3DCDB069A';");		 
		 while (resultSet .next()) {
				System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
				+ resultSet.getString(4) + "  " + resultSet.getString(5));
			}
			
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
				}
			}
			
			if (statement != null) {
				try {
					statement.close();
				} catch (Exception e) {
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}



		}
	





	