package MRMS_Database;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Tables 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement st = null;
		
		try 
		{
			conn = ConnectionProvider.getConn();
			st = conn.createStatement();
			st.executeUpdate("create table users (userName varchar(200)"
					+ ",password varchar(50),securityQuestion varchar(500)"
					+ ",answer varchar(200),status varchar(20))");
			JOptionPane.showMessageDialog(null, "Table created successfully");
		}
		
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		finally 
		{
			try 
			{
				conn.close();
				st.close();
			}
			
			catch (Exception e)
			{}
		}
	}
}
