package MRMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import MRMS_Database.InsertUpdateDelete;


class Signup extends SignupGUI
{
	public Signup()
	{
		//Object creation
		SignupGUI myGUI = new SignupGUI();
		myGUI.callFrame();
		myGUI.callButton();
		myGUI.callTextField();
		myGUI.callPassField();
		myGUI.callCheckBox();
		myGUI.callComboBox();
		myGUI.callLabel();
		myGUI.callImageIcon();
		myGUI.callPanel();
		
	}
}

class SignupGUI implements ActionListener
{
	//Fields
	String fName, lName, userName, password, cPassword, securityQuestion, answer;
	
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
	JLabel myLabel6 = new JLabel();
	JLabel myLabel7 = new JLabel();
	JLabel myLabel8 = new JLabel();
	JLabel myLabel9 = new JLabel();
	JLabel myLabel10 = new JLabel();
	JLabel myLabel11 = new JLabel();
	JLabel myLabel12 = new JLabel();
		
	//Image Icon
	ImageIcon myIcon = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));
	ImageIcon myIcon2 = new ImageIcon(getClass().getClassLoader().getResource("LogoBR.png"));
	ImageIcon myIcon3 = new ImageIcon(getClass().getClassLoader().getResource("Go_Back.png"));
		
	//JButton
	JButton myButton = new JButton();
	JButton myButton2 = new JButton("Sign Up");
	JButton myButton3 = new JButton("  OK  ");
	JButton myButton4 = new JButton("  OK  ");

	//JTextField
	JTextField myTextField = new JTextField(25);
	JTextField myTextField2 = new JTextField(25);
	JTextField myTextField3 = new JTextField(25);
	JTextField myTextField4 = new JTextField(25);
	
	//JPasswordField
	JPasswordField myPassField = new JPasswordField(25);
	JPasswordField myPassField2 = new JPasswordField(25);
	
	//JCheckBox
	JCheckBox myCheckBox = new JCheckBox();
	JCheckBox myCheckBox2 = new JCheckBox();
	
	//JComboBox
	String[] profileTypes = {"What is the name of your pet?"
			, "What is your favourite color?"
			, "What is the your favourite food?"};
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
		myFrame.add(myLabel3);
		myFrame.add(myLabel4);
		myFrame.add(myLabel5);
		myFrame.add(myLabel6);
		myFrame.add(myLabel7);
		myFrame.add(myLabel11);
		myFrame.add(myLabel12);
		myFrame.add(myButton2);
		myFrame.add(myTextField);
		myFrame.add(myTextField2);
		myFrame.add(myTextField3);
		myFrame.add(myTextField4);
		myFrame.add(myPassField);
		myFrame.add(myPassField2);
		myFrame.add(myComboBox);
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
		myLabel2.setText("Registered Successfully!");
		myLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel3.setText("First name:");
		myLabel3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel3.setForeground(new Color(0, 34, 102));
		myLabel3.setBounds(70, 220, 130, 20);
		myLabel4.setText("Last name:");
		myLabel4.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel4.setForeground(new Color(0, 34, 102));
		myLabel4.setBounds(330, 220, 130, 20);
		myLabel5.setText("Username:");
		myLabel5.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel5.setForeground(new Color(0, 34, 102));
		myLabel5.setBounds(70, 310, 350, 20);
		myLabel6.setText("Password:");
		myLabel6.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel6.setForeground(new Color(0, 34, 102));
		myLabel6.setBounds(70, 585, 140, 30);
		myLabel7.setText("Confirm password:");
		myLabel7.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel7.setForeground(new Color(0, 34, 102));
		myLabel7.setBounds(330, 585, 250, 30);
		myLabel8.setText("Signup Form");
		myLabel8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		myLabel8.setForeground(new Color(0, 34, 102));
		myLabel8.setForeground(Color.white);
		myLabel8.setBounds(210, 125, 200, 100);
		myLabel9.setText("Every field is required!");
		myLabel9.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setText("Passwords must be same!");
		myLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		myLabel10.setForeground(Color.red);
		myLabel11.setText("Security Question:");
		myLabel11.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel11.setForeground(new Color(0, 34, 102));
		myLabel11.setBounds(70, 395, 220, 30);
		myLabel12.setText("Answer:");
		myLabel12.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myLabel12.setForeground(new Color(0, 34, 102));
		myLabel12.setBounds(70, 490, 180, 35);
			
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
		myButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		myButton3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		myButton.setBackground(Color.white);
		myButton2.setBackground(new Color(0, 34, 102));
		myButton3.setBackground(Color.lightGray);
		myButton4.setBackground(Color.lightGray);
		myButton.setForeground(Color.white);
		myButton2.setForeground(Color.white);
		myButton.setBounds(20, 40, 60, 35);
		myButton2.setBounds(140, 690, 300, 35);
		myButton.setIcon(myIcon3);
		myButton.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		myButton4.addActionListener(this);

	}

	public void callTextField()
	{
		myTextField.setBounds(70, 245, 180, 35);		//First name
		myTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		myTextField2.setBounds(330, 245, 200, 35);		//Last name
		myTextField2.setFont(new Font("Arial", Font.PLAIN, 20));
		myTextField3.setBounds(70, 335, 460, 35);		//Username
		myTextField3.setFont(new Font("Arial", Font.PLAIN, 20));
		myTextField4.setBounds(70, 520, 460, 35);		//Answer
		myTextField4.setFont(new Font("Arial", Font.PLAIN, 20));
		
	}
	
	public void callPassField()
	{
		myPassField.setBounds(70, 615, 180, 35);		//Password
		myPassField.setFont(new Font("Arial", Font.PLAIN, 20));
		myPassField.setEchoChar('\u25CF');		//Unicode for char Black Dot
		myPassField2.setBounds(330, 615, 200, 35);		//Confirm password
		myPassField2.setFont(new Font("Arial", Font.PLAIN, 20));
		myPassField2.setEchoChar('\u25CF');		//Unicode for char Black Dot

	}
	
	public void callCheckBox()
	{
		myCheckBox.setBounds(70, 650, 180, 35);
		myCheckBox.setFocusable(false);
		myCheckBox.setBackground(Color.white);
		myCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		myCheckBox.setForeground(new Color(0, 34, 102));
		myCheckBox.setText("Show Password");
		myCheckBox.addActionListener(this);
		myCheckBox2.setBounds(330, 650, 240, 35);
		myCheckBox2.setFocusable(false);
		myCheckBox2.setBackground(Color.white);
		myCheckBox2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		myCheckBox2.setForeground(new Color(0, 34, 102));
		myCheckBox2.setText("Show Confirm Password");
		myCheckBox2.addActionListener(this);

	}
	
	public void callComboBox()
	{
		myComboBox.setBounds(70, 425, 460, 35);
		myComboBox.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		myComboBox.setBackground(Color.white);
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
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//Storing Values
		fName = myTextField.getText();
		lName = myTextField2.getText();
		userName = myTextField3.getText();
		password = myPassField.getText();
		cPassword = myPassField2.getText();
		securityQuestion = (String) myComboBox.getSelectedItem();
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
		
		//SignUp
		else if(e.getSource() == myButton2)
		{	
			if (fName.equals("") || lName.equals("") || userName.equals("") || password.equals("")
					|| cPassword.equals("") || answer.equals(""))
			{
				callWarningDialog();
			}
			
			else if (!password.equals(cPassword))
			{
				callErrorDialog();
			}
			
			else
			{
				//Passing data into database
				String Query;
				Query = "insert into users values('"+userName+"','"+password+"','"+securityQuestion+"','"+answer+"','false')";
				InsertUpdateDelete.setData(Query);
				myButton2.setEnabled(false);
				myTextField.setEditable(false);
				myTextField2.setEditable(false);
				myTextField3.setEditable(false);
				myPassField.setEditable(false);
				myPassField2.setEditable(false);
				callMessageDialog();
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