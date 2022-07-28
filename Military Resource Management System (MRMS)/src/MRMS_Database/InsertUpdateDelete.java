package MRMS_Database;

import java.sql.*;

import javax.swing.JOptionPane;

//To insert, update or delete the data in the database
public class InsertUpdateDelete 
{
	public static void setData(String Query)
	{
		Connection conn = null;
		Statement st = null;
		try
		{
			conn = ConnectionProvider.getConn();
			st = conn.createStatement();
			st.executeUpdate(Query);
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		finally
		{
			try
			{}
			catch(Exception e)
			{}
		}
	}
}
