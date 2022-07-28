package MRMS_Database;

import java.sql.*;

import javax.swing.JOptionPane;

//For Login page database functionality
public class Select 
{
	//Primitive static Java sql library method
	public static ResultSet getData(String query)
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try 
		{
			conn = ConnectionProvider.getConn();
			st = conn.createStatement();
			rs = st.executeQuery(query);
			return rs;
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
}
