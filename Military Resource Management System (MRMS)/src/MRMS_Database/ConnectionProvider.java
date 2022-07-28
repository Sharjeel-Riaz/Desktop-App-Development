package MRMS_Database;

//Databse connection provider
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
	public static Connection getConn()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrms", "root", 
					"root");
			return conn;
		}
		
		catch (Exception e)
		{
			return null;
		}
		
	}
}
