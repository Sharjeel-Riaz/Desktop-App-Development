package MRMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import MRMS_Database.*;

class ForgotPassword extends ForgotPasswordGUI 
{
	public ForgotPassword()
	{
		//Object creation
		ForgotPasswordGUI myGUI = new ForgotPasswordGUI();
		myGUI.callFrame();
		myGUI.callButton();
		myGUI.callTextField();
		myGUI.callPassField();
		myGUI.callCheckBox();
		myGUI.callLabel();
		myGUI.callImageIcon();
		myGUI.callPanel();
		
	}
}

class ForgotPasswordGUI implements ActionListener
{
	//Fields
	String userName, newPassword, cPassword, securityQuestion, answer;
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
	JLabel myLabel5 = new JLabel();
	JLabel myLabel6 = new JLabel();
	JLabel myLabel7 = new JLabel();
	JLabel myLabel8 = new JLabel();
	JLabel myLabel9 = new JLabel();
	JLabel myLabel10 = new JLabel();
	JLabel myLabel11 = new JLabel();
	JLabel myLabel12 = new JLabel();
	JLabel myLabel13 = new JLabel();
	JLabel myLabel14 = new JLabel();

	//Image Icon
	ImageIcon myIcon = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));
	ImageIcon myIcon2 = new ImageIcon(getClass().getClassLoader().getResource("LogoBR.png"));
	ImageIcon myIcon3 = new ImageIcon(getClass().getClassLoader().getResource("Go_Back.png"));

	//JButton
	JButton myButton = new JButton();
	JButton myButton2 = new JButton("Save");
	JButton myButton3 = new JButton("  OK  ");
	JButton myButton4 = new JButton("  OK  ");
	JButton myButton5 = new JButton("Search");

	//JTextField
	JTextField myTextField3 = new JTextField(25);
	JTextField myTextField4 = new JTextField(25);
	JTextField myTextField5 = new JTextField(25);

	//JPasswordField
	JPasswordField myPassField = new JPasswordField(25);
	JPasswordField myPassField2 = new JPasswordField(25);

	//JCheckBox
	JCheckBox myCheckBox = new JCheckBox();
	JCheckBox myCheckBox2 = new JCheckBox();

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
		myFrame.add(myLabel5);
		myFrame.add(myLabel6);
		myFrame.add(myLabel7);
		myFrame.add(myLabel11);
		myFrame.add(myLabel12);
		myFrame.add(myButton2);
		myFrame.add(myButton5);
		myFrame.add(myTextField3);
		myFrame.add(myTextField4);
		myFrame.add(myTextField5);
		myFrame.add(myPassField);
		myFrame.add(myPassField2);
		myFrame.add(myCheckBox);
		myFrame.add(myCheckBox2);
		myFrame.setLocationRelativeTo(null);
		myFrame2.setResizable(false);
		myFrame2.setLayout(null);
		myFrame2.setLocationRelativeTo(null);	

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
		myLabel2.setText("Password Set Successfully!");
		myLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel5.setText("Username:");
		myLabel5.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel5.setForeground(new Color(0, 34, 102));
		myLabel5.setBounds(70, 220, 350, 20);
		myLabel6.setText("New Password:");
		myLabel6.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel6.setForeground(new Color(0, 34, 102));
		myLabel6.setBounds(70, 535, 180, 30);
		myLabel7.setText("Confirm password:");
		myLabel7.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel7.setForeground(new Color(0, 34, 102));
		myLabel7.setBounds(330, 535, 250, 30);
		myLabel8.setText("Forgot Password?");
		myLabel8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		myLabel8.setForeground(new Color(0, 34, 102));
		myLabel8.setForeground(Color.white);
		myLabel8.setBounds(170, 125, 250, 100);
		myLabel9.setText("Every field is required!");
		myLabel9.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setText("Passwords must be same!");
		myLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setForeground(Color.red);
		myLabel11.setText("Security Question:");
		myLabel11.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel11.setForeground(new Color(0, 34, 102));
		myLabel11.setBounds(70, 335, 220, 30);
		myLabel12.setText("Answer:");
		myLabel12.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel12.setForeground(new Color(0, 34, 102));
		myLabel12.setBounds(70, 430, 180, 35);
		myLabel13.setText("Incorrect username!");
		myLabel13.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel13.setForeground(Color.red);
		myLabel14.setText("Incorrect answer!");
		myLabel14.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel14.setForeground(Color.red);

	}

	public void callPanel()
	{
		myPanel.setLayout(null);
		myPanel.setBounds(0, 0, 600, 200);
		myPanel.setBackground(new Color(0, 34, 102));
		myPanel.add(myLabel);
		myPanel.add(myLabel8);
		myPanel.add(myButton);
	}

	public void callButton()
	{
		myButton.setFocusable(false);
		myButton2.setFocusable(false);
		myButton5.setFocusable(false);
		myButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton5.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton.setBackground(Color.white);
		myButton2.setBackground(new Color(0, 34, 102));
		myButton3.setBackground(Color.lightGray);
		myButton4.setBackground(Color.lightGray);
		myButton5.setBackground(new Color(0, 34, 102));
		myButton.setForeground(Color.white);
		myButton2.setForeground(Color.white);
		myButton5.setForeground(Color.white);
		myButton.setBounds(20, 40, 60, 35);
		myButton2.setBounds(140, 660, 300, 35);
		myButton5.setBounds(380, 290, 150, 35);
		myButton.setIcon(myIcon3);
		myButton.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		myButton4.addActionListener(this);
		myButton5.addActionListener(this);

	}

	public void callTextField()
	{
		myTextField3.setBounds(70, 245, 460, 35);		//Username
		myTextField3.setFont(new Font("Arial", Font.PLAIN, 20));
		myTextField4.setBounds(70, 465, 460, 35);		//Answer
		myTextField4.setFont(new Font("Arial", Font.PLAIN, 20));
		myTextField5.setBounds(70, 365, 460, 35);		//Security Question
		myTextField5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

	}

	public void callPassField()
	{
		myPassField.setBounds(70, 565, 180, 35);		//Password
		myPassField.setFont(new Font("Arial", Font.PLAIN, 20));
		myPassField.setEchoChar('\u25CF');		//Unicode for char Black Dot
		myPassField2.setBounds(330, 565, 200, 35);		//Confirm password
		myPassField2.setFont(new Font("Arial", Font.PLAIN, 20));
		myPassField2.setEchoChar('\u25CF');		//Unicode for char Black Dot

	}

	public void callCheckBox()
	{
		myCheckBox.setBounds(70, 600, 180, 35);
		myCheckBox.setFocusable(false);
		myCheckBox.setBackground(Color.white);
		myCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		myCheckBox.setForeground(new Color(0, 34, 102));
		myCheckBox.setText("Show Password");
		myCheckBox.addActionListener(this);
		myCheckBox2.setBounds(330, 600, 240, 35);
		myCheckBox2.setFocusable(false);
		myCheckBox2.setBackground(Color.white);
		myCheckBox2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		myCheckBox2.setForeground(new Color(0, 34, 102));
		myCheckBox2.setText("Show Confirm Password");
		myCheckBox2.addActionListener(this);

	}

	//Customized Dialog box pop-ups
	public void callMessageDialog()
	{
		JOptionPane.showOptionDialog(myFrame, myLabel2, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
				new Object[]{myButton3} ,null);
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
	
	public void callErrorDialog2()
	{
		JOptionPane.showOptionDialog(myFrame2, myLabel13, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, 
				new Object[]{myButton4} ,null);
	}
	
	public void callErrorDialog3()
	{
		JOptionPane.showOptionDialog(myFrame2, myLabel14, "Message"
				,JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, 
				new Object[]{myButton4} ,null);
	}
	
	public void callDatabase()
	{
		ResultSet rs = Select.getData("select *from users where userName='"+userName+"' and securityQuestion='"+securityQuestion+"' and answer='"+answer+"'");
		try
		{
			if(rs.next())
			{
				check = 1;
				InsertUpdateDelete.setData("update users set password='"+newPassword+"' where userName='"+userName+"'");
				myButton2.setEnabled(false);
				myPassField.setEditable(false);
				myPassField2.setEditable(false);
				callMessageDialog();
			}
		}
		
		catch (Exception a)
		{
			JOptionPane.showMessageDialog(null, a);
		}
		
		if (check == 0)
		{
			callErrorDialog3();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Storing Values
		userName = myTextField3.getText();
		newPassword = myPassField.getText();
		cPassword = myPassField2.getText();
		securityQuestion = myTextField5.getText();
		answer = myTextField4.getText();
				
		//JCheckBox
		if(e.getSource() == myCheckBox || e.getSource() == myCheckBox2)
		{
			//Password field
			if (myCheckBox.isSelected())
			{
				myPassField.setEchoChar((char)0);

			}
					
			else
			{
				myPassField.setEchoChar('\u25CF');

			}
			
			//Confirm password field
			if (myCheckBox2.isSelected())
			{
				myPassField2.setEchoChar((char)0);
			}
			
			else 
			{
				myPassField2.setEchoChar('\u25CF');
			}
		}
		
		
		//Search
		else if(e.getSource() == myButton5)
		{
			if(userName.equals(""))
			{
				check = 1;
				callWarningDialog();
			}
			
			else
			{
				//Database connectivity
				ResultSet rs = Select.getData("select * from users where userName='"+userName+"'");
				try
				{
					if(rs.next())
					{
						check = 1;
						myTextField3.setEditable(false);
						myTextField5.setEditable(false);
						myTextField5.setText(rs.getString(3));
						
					}
				}
				catch (Exception a)
				{
					JOptionPane.showMessageDialog(null, a);
				}
			}
			
			if(check == 0)
			{
				callErrorDialog2();
			}
		}

		
		//Save
		else if(e.getSource() == myButton2)
		{	
			check = 0;
			if (userName.equals("") || newPassword.equals("")
					|| cPassword.equals("") || answer.equals(""))
			{
				check = 1;
				callWarningDialog();
			}

			else if (!newPassword.equals(cPassword))
			{
				check = 1;
				callErrorDialog();
			}

			else
			{
				//Database Connectivity
				callDatabase();
				
			}

		}

		//Go Back Button & InformationMessage DialogBox Button
		else if(e.getSource() == myButton || e.getSource() == myButton3)
		{
			myFrame.dispose();
			new Login();
		}


		//WarningMessage DialogBox Button
		else if (e.getSource() == myButton4)
		{
			myFrame2.dispose();
		}
	}



		
}