package MRMS;


//Libraries
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import MRMS_Database.Select;

class Login extends LoginGUI 
{
	//Constructor
	public Login()
	{
		//Object creation
		LoginGUI myGUI = new LoginGUI();
		myGUI.callButton();
		myGUI.callTextField();
		myGUI.callPassField();
		myGUI.callCheckBox();
		myGUI.callFrame();
		myGUI.callPanel();
		myGUI.callLabel();
		myGUI.callImageIcon();
		myGUI.callComboBox();
	}
	
}

class LoginGUI implements ActionListener	//ActionListener is an interface to get actions via methods
{
	//Fields
	public static String str;		//Static String field
	String userName, password;
	int check = 0;
	
	//Creating objects 
	//JFrame
	JFrame myFrame = new JFrame();
	JFrame myFrame2 = new JFrame();
	
	//JPanel
	JPanel myPanel = new JPanel();
	
	//JLabel
	JLabel myLabel = new JLabel();
	JLabel myLabel2 = new JLabel();
	JLabel myLabel3 = new JLabel();
	JLabel myLabel4 = new JLabel();
	JLabel myLabel5 = new JLabel();
	JLabel myLabel7 = new JLabel();
	JLabel myLabel8 = new JLabel();
	JLabel myLabel9 = new JLabel();
	JLabel myLabel10 = new JLabel();
	JLabel myLabel11 = new JLabel();

	//Image Icon
	ImageIcon myIcon = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));
	ImageIcon myIcon2 = new ImageIcon(getClass().getClassLoader().getResource("LogoBR.png"));
	
	//JButton
	JButton myButton = new JButton("Log In");
	JButton myButton2 = new JButton("Sign Up Now");
	JButton myButton3 = new JButton("  OK  ");
	JButton myButton4 = new JButton("  OK  ");
	JButton myButton5 = new JButton("Forgot Password?");

	//JTextField
	JTextField myTextField = new JTextField(30);
	
	//JPasswordField
	JPasswordField myPassField = new JPasswordField(30);
	
	//JCheckBox
	JCheckBox myCheckBox = new JCheckBox();
	
	//JComboBox
	String[] profileTypes = {"Administrator", "Personnel", "Staff"};
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox myComboBox = new JComboBox(profileTypes);
	
	//Methods
	public void callFrame()
	{
		//JFrame methods
		myFrame.setVisible(true);
		myFrame.setResizable(false);
		myFrame.setLayout(null);
		myFrame.getContentPane().setBackground(Color.white);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(620, 800);
		myFrame.setTitle("Military Resource Management System");	
		myFrame.add(myPanel);
		myFrame.add(myLabel2);
		myFrame.add(myLabel3);
		myFrame.add(myLabel4);
		myFrame.add(myLabel7);
		myFrame.add(myButton);
		myFrame.add(myButton2);
		myFrame.add(myButton5);
		myFrame.add(myTextField);
		myFrame.add(myPassField);
		myFrame.add(myCheckBox);
		myFrame.add(myComboBox);
		myFrame.setLocationRelativeTo(null);
		myFrame2.setResizable(false);
		myFrame2.setLayout(null);
		myFrame2.setLocationRelativeTo(null);

		
	}
	
	public void callPanel()
	{
		myPanel.setLayout(null);
		myPanel.setBounds(0, 0, 600, 200);
		myPanel.setBackground(new Color(0, 34, 102));
		myPanel.add(myLabel);
		myPanel.add(myLabel5);

	}
	
	public void callImageIcon()
	{	
		myFrame.setIconImage(myIcon.getImage());	
		myLabel.setIcon(myIcon2);
	}
	
	public void callLabel()
	{
		myLabel.setText("(Military Resource Management System)");
		myLabel.setHorizontalTextPosition(JLabel.CENTER);
		myLabel.setVerticalTextPosition(JLabel.TOP);
		myLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		myLabel.setForeground(Color.white);
		myLabel.setIconTextGap(-240);
		myLabel.setVerticalAlignment(JLabel.TOP);
		myLabel.setBounds(60, -80, 480, 700);
		myLabel2.setText("Username:");
		myLabel2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel2.setForeground(new Color(0, 34, 102));
		myLabel2.setBounds(130, 370, 190, 20);
		myLabel3.setText("Password:");
		myLabel3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel3.setForeground(new Color(0, 34, 102));
		myLabel3.setBounds(130, 480, 190, 20);
		myLabel4.setText("Profile type:");
		myLabel4.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel4.setForeground(new Color(0, 34, 102));
		myLabel4.setBounds(130, 210, 190, 30);
		myLabel5.setText("Login Form");
		myLabel5.setFont(new Font("Segoe UI", Font.BOLD, 30));
		myLabel5.setForeground(Color.white);
		myLabel5.setBounds(210, 125, 200, 100);
		myLabel7.setText("Don't have an account?");
		myLabel7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		myLabel7.setForeground(new Color(0, 100, 0));
		myLabel7.setBounds(330, 660, 240, 35);
		myLabel7.setVisible(false);
		myLabel8.setText("Login Successful!");
		myLabel8.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel9.setText("Every field is required!");
		myLabel9.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setText("Incorrect username or password!");
		myLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setForeground(Color.red);
		myLabel11.setText("Wait for admin approval");
		myLabel11.setFont(new Font("Segoe UI", Font.PLAIN, 24));
	}
	
	public void callButton()
	{
		myButton2.setVisible(false);
		myButton.setFocusable(false);
		myButton2.setFocusable(false);
		myButton5.setFocusable(false);
		myButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton2.setFont(new Font("Segoe UI", Font.BOLD, 21));
		myButton3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		myButton.setBounds(140, 615, 300, 35);
		myButton2.setBounds(330, 695, 220, 35);
		myButton5.setBounds(270, 580, 180, 35);
		myButton.setBackground(new Color(0, 34, 102));
		myButton2.setBackground(new Color(0, 34, 102));
		myButton3.setBackground(Color.lightGray);
		myButton4.setBackground(Color.lightGray);
		myButton5.setBackground(Color.white);
		myButton.setForeground(Color.white);
		myButton2.setForeground(Color.white);
		myButton5.setForeground(new Color(0, 100, 0));
		myButton5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		myButton5.setContentAreaFilled(false);
		myButton.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		myButton4.addActionListener(this);
		myButton5.addActionListener(this);

	}

	public void callTextField()
	{
		myTextField.setBounds(130, 395, 320, 35);
		myTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		
	}
	
	public void callPassField()
	{
		myPassField.setBounds(130, 505, 320, 35);
		myPassField.setFont(new Font("Arial", Font.PLAIN, 22));
		myPassField.setEchoChar('\u25CF');		//Unicode for char Black Dot

	}
	
	public void callCheckBox()
	{
		myCheckBox.setBounds(130, 540, 180, 35);
		myCheckBox.setFocusable(false);
		myCheckBox.setBackground(null);
		myCheckBox.setForeground(new Color(0, 34, 102));
		myCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		myCheckBox.setText("Show Password");
		myCheckBox.addActionListener(this);

	}
	
	public void callComboBox()
	{
		myComboBox.setBounds(130, 245, 320, 35);
		myComboBox.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		myComboBox.setBackground(Color.white);
		myComboBox.addActionListener(this);
	}
	
	public void callMessageDialog()
	{
		JOptionPane.showOptionDialog(myFrame, myLabel8, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
				new Object[]{myButton3} ,null);
	}
	
	public void callMessageDialog2()
	{
		JOptionPane.showOptionDialog(myFrame2, myLabel11, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
				new Object[]{myButton4} ,null);
	}
	
	public void callWarningDialog()
	{
		JOptionPane.showOptionDialog(myFrame2, myLabel9, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
				new Object[]{myButton4} ,null);
	}
	
	public void callErrorDialog()
	{
		JOptionPane.showOptionDialog(myFrame2, myLabel10, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, 
				new Object[]{myButton4} ,null);
	}
	
	public void callDatabase()
	{
		//Sql Query
		ResultSet rs = Select.getData("select *from users where userName='"+userName+"' and password='"+password+"'");
		try
		{
			if(rs.next())
			{
				check = 1;
				if(rs.getString(5).equals("true"))
				{
					str = myTextField.getText();
					callMessageDialog();
					myFrame.dispose();
					new Personnel();
				}
				else
				{
					callMessageDialog2();
				}
			}
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		if (check == 0)
		{
			callErrorDialog();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		//Storing input
		userName = myTextField.getText();
		password = myPassField.getText();
		
		//ComboBox
		if (e.getSource() == myComboBox)
		{
			if(myComboBox.getSelectedIndex() == 0)
			{
				myLabel7.setVisible(false);
				myButton2.setVisible(false);
				
			}
			
			else 
			{
				myLabel7.setVisible(true);
				myButton2.setVisible(true);

			}
		}
		
		//CheckBox
		else if(e.getSource() == myCheckBox)
		{
			if (myCheckBox.isSelected())
			{
				myPassField.setEchoChar((char)0);

			}
			
			else
			{
				myPassField.setEchoChar('\u25CF');

			}
		}
		
		//LogIn
		else if (e.getSource() == myButton)
		{
			if (userName.equals("") || password.equals(""))
			{
				callWarningDialog();
			}
				
			else
			{
				//JComboBox Admin
				if(myComboBox.getSelectedIndex() == 0 && userName.equals("MRMS") && password.equals("admin"))
				{
					str = myTextField.getText();
					callMessageDialog();
					myFrame.dispose();
					new Admin();
				}
				
				//JJComboBox personnel 
				else if (myComboBox.getSelectedIndex() == 1)
				{
					//Connecting Database to the portal
					callDatabase();
					
				}
				
				//JJComboBox Staff
				else if (myComboBox.getSelectedIndex() == 2)
				{
					str = myTextField.getText();
					callMessageDialog();
					myFrame.dispose();
					new Staff();
				}
				
				else
				{
					callErrorDialog();
				}
				
			 }
		 }
		
		//SignUp Now
		else if (e.getSource() == myButton2)
		{
			myFrame.dispose();
			new Signup();
		}
		
		//Forgot Password
		else if (e.getSource() == myButton5)
		{
			myFrame.dispose();
			new ForgotPassword();
		}
		
		//InformationMessage DialogBox Button
		else if (e.getSource() == myButton3)
		{
			myFrame.dispose();
		}
		
		//WarningMessage DialogBox Button
		else if (e.getSource() == myButton4)
		{
			myFrame2.dispose();
		}
		
		
		
	}
}


