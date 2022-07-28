package MRMS;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends Login 
{
	public static void main(String[] args) 
	{
		//Look & Feel for UI/UX
		 try {
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			 } catch (ClassNotFoundException ex) {
		            Logger.getLogger(Login.class.getName())
		                .log(Level.SEVERE, null, ex);
		     } catch (InstantiationException ex) {
		            Logger.getLogger(Login.class.getName())
		                .log(Level.SEVERE, null, ex);
		     } catch (IllegalAccessException ex) {
		            Logger.getLogger(Login.class.getName())
		                .log(Level.SEVERE, null, ex);
		     } catch (UnsupportedLookAndFeelException ex) {
		            Logger.getLogger(Login.class.getName())
		                .log(Level.SEVERE, null, ex);
		     }
		
		new Login();

	}
}


