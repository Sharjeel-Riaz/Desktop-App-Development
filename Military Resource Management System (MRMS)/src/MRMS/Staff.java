package MRMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

class Staff 
{
	//Constructor
	public Staff()
	{
		//Object creation
		StaffGUI myGUI = new StaffGUI();
		myGUI.callFrame();
		myGUI.callImageIcon();
		myGUI.callSeparator();
		myGUI.callPanel();
		myGUI.callButton();
		myGUI.callLabel();
		
	}
}

class StaffGUI implements ActionListener, MouseListener
{
	//Creating objects 

	//JFrame
	JFrame myFrame = new JFrame();

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
	JLabel myLabel13 = new JLabel();
	JLabel myLabel14 = new JLabel();
	JLabel myLabel15 = new JLabel();
	JLabel myLabel16 = new JLabel();
	JLabel myLabel17 = new JLabel();

	//Image Icon
	ImageIcon myIcon = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));
	ImageIcon myIcon2 = new ImageIcon(getClass().getClassLoader().getResource("Personnel_Icon.png"));
	ImageIcon myIcon3 = new ImageIcon(getClass().getClassLoader().getResource("Laptop_icon.png"));
	ImageIcon myIcon4 = new ImageIcon(getClass().getClassLoader().getResource("Employee_icon.png"));
	ImageIcon myIcon5 = new ImageIcon(getClass().getClassLoader().getResource("Orders_icon.png"));
	ImageIcon myIcon6 = new ImageIcon(getClass().getClassLoader().getResource("Identicator_Icon.png"));
	ImageIcon myIcon7 = new ImageIcon(getClass().getClassLoader().getResource("Add_Icon.png"));
	ImageIcon myIcon8 = new ImageIcon(getClass().getClassLoader().getResource("Delete_Icon.png"));
	ImageIcon myIcon9 = new ImageIcon(getClass().getClassLoader().getResource("Update_Icon.png"));
	ImageIcon myIcon10 = new ImageIcon(getClass().getClassLoader().getResource("Add_Order.png"));
	ImageIcon myIcon11 = new ImageIcon(getClass().getClassLoader().getResource("Delete_Order.png"));
	ImageIcon myIcon12 = new ImageIcon(getClass().getClassLoader().getResource("Update_Order.png"));
	ImageIcon myIcon13 = new ImageIcon(getClass().getClassLoader().getResource("My_DP.png"));
	ImageIcon myIcon14 = new ImageIcon(getClass().getClassLoader().getResource("Name.png"));
	ImageIcon myIcon15 = new ImageIcon(getClass().getClassLoader().getResource("Phone.png"));
	ImageIcon myIcon16 = new ImageIcon(getClass().getClassLoader().getResource("Gmail.png"));
	ImageIcon myIcon17 = new ImageIcon(getClass().getClassLoader().getResource("GitHub.png"));
	
	//JButton
	JButton myButton = new JButton("Dashboard");
	JButton myButton2 = new JButton("Statistics");
	JButton myButton3 = new JButton("Orders");
	JButton myButton4 = new JButton("Log out");
	JButton myButton5 = new JButton("Add Personnel");		//Dashboard panel
	JButton myButton6 = new JButton("Remove Personnel");
	JButton myButton7 = new JButton("Update Personnel");
	JButton myButton8 = new JButton("Assign Orders");
	JButton myButton9 = new JButton("Remove Orders");
	JButton myButton10 = new JButton("Update Orders");
	JButton myButton11 = new JButton("Add Personnel");		//Statistics panel
	JButton myButton12 = new JButton("Remove Personnel");
	JButton myButton13 = new JButton("Update Personnel");
	JButton myButton14 = new JButton("Assign Orders");		//Orders panel
	JButton myButton15 = new JButton("Remove Orders");
	JButton myButton16 = new JButton("Update Orders");

	//JPanel
	JPanel mySidePanel = new JPanel();
	JPanel myMainPanel = new JPanel();
	JPanel myStatPanel = new JPanel();
	JPanel myOrderPanel = new JPanel();
	JPanel myContactPanel = new JPanel();

	//JSeparator
	JSeparator mySeparator = new JSeparator();
	JSeparator mySeparator2 = new JSeparator();
	JSeparator mySeparator3 = new JSeparator();

	//Methods
	public void callFrame()
	{
		//JFrame methods
		myFrame.setVisible(true);
		myFrame.setResizable(false);
		myFrame.getContentPane().setBackground(Color.white);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1600, 1000);
		myFrame.setTitle("Military Resource Management System");
		myFrame.setLayout(null);
		myFrame.add(myLabel5);
		myFrame.add(myLabel6);
		myFrame.add(mySidePanel);
		myFrame.add(myMainPanel);
		myFrame.add(myStatPanel);
		myFrame.add(myOrderPanel);
		myFrame.add(myContactPanel);
		myFrame.setLocationRelativeTo(null);

	}

	public void callImageIcon()
	{	
		myFrame.setIconImage(myIcon.getImage());
		// To scale the image
		Image myImage = myIcon2.getImage();		//Image to resize the image icon2
		Image newImage = myImage.getScaledInstance(220, 220, Image.SCALE_SMOOTH);
		myIcon2 = new ImageIcon(newImage);
		Image myImage2 = myIcon3.getImage();		//Image to resize the image icon3
		Image newImage2 = myImage2.getScaledInstance(90, 75, Image.SCALE_SMOOTH);
		myIcon3 = new ImageIcon(newImage2);
		Image myImage3 = myIcon4.getImage();		//Image to resize the image icon4
		Image newImage3 = myImage3.getScaledInstance(90, 75, Image.SCALE_SMOOTH);
		myIcon4 = new ImageIcon(newImage3);
		Image myImage4 = myIcon5.getImage();		//Image to resize the image icon5
		Image newImage4 = myImage4.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		myIcon5 = new ImageIcon(newImage4);
		Image myImage5 = myIcon10.getImage();		//Image to resize the image icon5
		Image newImage5 = myImage5.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		myIcon10 = new ImageIcon(newImage5);
		Image myImage6 = myIcon11.getImage();		//Image to resize the image icon5
		Image newImage6 = myImage6.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		myIcon11 = new ImageIcon(newImage6);
		Image myImage7 = myIcon12.getImage();		//Image to resize the image icon5
		Image newImage7 = myImage7.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		myIcon12 = new ImageIcon(newImage7);
		Image myImage8 = myIcon13.getImage();		//Image to resize the image icon13
		Image newImage8 = myImage8.getScaledInstance(220, 220, Image.SCALE_SMOOTH);
		myIcon13 = new ImageIcon(newImage8);
		Image myImage9 = myIcon16.getImage();		//Image to resize the image icon16
		Image newImage9 = myImage9.getScaledInstance(221, 60, Image.SCALE_SMOOTH);
		myIcon16 = new ImageIcon(newImage9);
		Image myImage10 = myIcon17.getImage();		//Image to resize the image icon17
		Image newImage10 = myImage10.getScaledInstance(222, 65, Image.SCALE_SMOOTH);
		myIcon17 = new ImageIcon(newImage10);

	}

	public void callPanel()
	{
		mySidePanel.setBackground(new Color(0, 34, 102));
		mySidePanel.setBounds(0, 0, 250, 1000);
		mySidePanel.setLayout(null);
		mySidePanel.add(myLabel);
		mySidePanel.add(myLabel7);
		mySidePanel.add(myButton);
		mySidePanel.add(myButton2);
		mySidePanel.add(myButton3);
		mySidePanel.add(myButton4);
		myMainPanel.setBackground(new Color(204, 230, 255));
		myMainPanel.setBounds(250, 40, 1600, 1000);
		myMainPanel.setLayout(null);
		myMainPanel.add(myLabel2);
		myMainPanel.add(mySeparator);
		myMainPanel.add(myLabel3);
		myMainPanel.add(myLabel4);
		myMainPanel.add(myButton5);
		myMainPanel.add(myButton6);
		myMainPanel.add(myButton7);
		myMainPanel.add(myButton8);
		myMainPanel.add(myButton9);
		myMainPanel.add(myButton10);
		myStatPanel.setBackground(new Color(204, 230, 255));
		myStatPanel.setBounds(250, 40, 1600, 1000);
		myStatPanel.setLayout(null);
		myStatPanel.setVisible(false);
		myStatPanel.add(myLabel8);
		myStatPanel.add(mySeparator2);
		myStatPanel.add(myLabel9);
		myStatPanel.add(myButton11);
		myStatPanel.add(myButton12);
		myStatPanel.add(myButton13);
		myOrderPanel.setBackground(new Color(204, 230, 255));
		myOrderPanel.setBounds(250, 40, 1600, 1000);
		myOrderPanel.setLayout(null);
		myOrderPanel.setVisible(false);
		myOrderPanel.add(myLabel10);
		myOrderPanel.add(mySeparator3);
		myOrderPanel.add(myLabel11);
		myOrderPanel.add(myButton14);
		myOrderPanel.add(myButton15);
		myOrderPanel.add(myButton16);
		myContactPanel.setBackground(Color.WHITE);
		myContactPanel.setBounds(250, 40, 1600, 1000);
		myContactPanel.setLayout(null);
		myContactPanel.setVisible(false);
		myContactPanel.add(myLabel12);
		myContactPanel.add(myLabel13);
		myContactPanel.add(myLabel14);
		myContactPanel.add(myLabel15);
		myContactPanel.add(myLabel16);
		myContactPanel.add(myLabel17);

	}

	public void callLabel()
	{
		myLabel.setText(LoginGUI.str);
		myLabel.setHorizontalTextPosition(JLabel.CENTER);
		myLabel.setHorizontalAlignment(JLabel.LEFT);
		myLabel.setVerticalTextPosition(JLabel.BOTTOM);
		myLabel.setVerticalAlignment(JLabel.TOP);
		myLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myLabel.setForeground(Color.white);
		myLabel.setIconTextGap(5);
		myLabel.setIcon(myIcon2);
		myLabel.setBounds(20, 10, 300, 300);
		myLabel2.setText("Welcome to MRMS");
		myLabel2.setFont(new Font("Times New Roman", Font.BOLD, 100));
		myLabel2.setForeground(Color.black);
		myLabel2.setBounds(80, -50, 900, 350);
		myLabel3.setText("Personnel Section");
		myLabel3.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myLabel3.setForeground(Color.black);
		myLabel3.setIconTextGap(-225);
		myLabel3.setIcon(myIcon6);
		myLabel3.setBounds(80, 100, 900, 350);
		myLabel4.setText("Order Section");
		myLabel4.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myLabel4.setForeground(Color.black);
		myLabel4.setIconTextGap(-180);
		myLabel4.setIcon(myIcon6);
		myLabel4.setBounds(80, 380, 900, 350);
		myLabel5.setText("Contact");
		myLabel5.setFont(new Font("Times New Roman", Font.BOLD, 24));
		myLabel5.setForeground(Color.gray);
		myLabel5.setBounds(750, -130, 100, 300);
		myLabel6.setText("About Us");
		myLabel6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		myLabel6.setForeground(Color.gray);
		myLabel6.setBounds(920, -130, 100, 300);
		myLabel6.addMouseListener(this);
		myLabel7.setText("Staff");
		myLabel7.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myLabel7.setForeground(Color.white);
		myLabel7.setBounds(100, 150, 250, 250);
		myLabel8.setText("Welcome to MRMS");
		myLabel8.setFont(new Font("Times New Roman", Font.BOLD, 100));
		myLabel8.setForeground(Color.black);
		myLabel8.setBounds(80, -50, 900, 350);
		myLabel9.setText("Statistics Section");
		myLabel9.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myLabel9.setForeground(Color.black);
		myLabel9.setIconTextGap(-215);
		myLabel9.setIcon(myIcon6);
		myLabel9.setBounds(80, 100, 900, 350);
		myLabel10.setText("Welcome to MRMS");
		myLabel10.setFont(new Font("Times New Roman", Font.BOLD, 100));
		myLabel10.setForeground(Color.black);
		myLabel10.setBounds(80, -50, 900, 350);
		myLabel11.setText("Order Section");
		myLabel11.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myLabel11.setForeground(Color.black);
		myLabel11.setIconTextGap(-180);
		myLabel11.setIcon(myIcon6);
		myLabel11.setBounds(80, 100, 900, 350);
		myLabel12.setBounds(400, 0, 500, 220);
		myLabel12.setText("About Me");
		myLabel12.setFont(new Font("Times New Roman", Font.BOLD, 50));
		myLabel12.setForeground(Color.black);
		myLabel12.setIcon(myIcon13);
		myLabel12.setIconTextGap(-500);
		myLabel13.setBounds(400, 80, 500, 500);
		myLabel13.setText("<html><p>This is a DEMO Semester Project."
				+ "\nThe full functionality will be added soon!"
				+ "\nYou can find it on my GitHub account given below.</p></html>");
		myLabel13.setFont(new Font("Times New Roman", Font.BOLD, 30));
		myLabel13.setForeground(Color.black);
		myLabel14.setBounds(450, 320, 700, 300);
		myLabel14.setText("Sharjeel Riaz");
		myLabel14.setFont(new Font("Times New Roman", Font.BOLD, 30));
		myLabel14.setForeground(Color.black);
		myLabel14.setIcon(myIcon14);
		myLabel14.setIconTextGap(120);
		myLabel15.setBounds(450, 420, 700, 300);
		myLabel15.setText("+92-303-910-2410");
		myLabel15.setFont(new Font("Times New Roman", Font.BOLD, 30));
		myLabel15.setForeground(Color.black);
		myLabel15.setIcon(myIcon15);
		myLabel15.setIconTextGap(120);
		myLabel16.setBounds(400, 520, 700, 300);
		myLabel16.setText("sharjeelriazsh@gmail.com");
		myLabel16.setFont(new Font("Times New Roman", Font.BOLD, 30));
		myLabel16.setForeground(Color.black);
		myLabel16.setIcon(myIcon16);
		myLabel16.setIconTextGap(50);
		myLabel17.setBounds(400, 600, 700, 300);
		myLabel17.setText("https://github.com/Sharjeel-Riaz");
		myLabel17.setFont(new Font("Times New Roman", Font.BOLD, 30));
		myLabel17.setForeground(Color.black);
		myLabel17.setIcon(myIcon17);
		myLabel17.setIconTextGap(50);

	}

	public void callButton()
	{
		myButton.setFocusable(false);
		myButton2.setFocusable(false);
		myButton3.setFocusable(false);
		myButton4.setFocusable(false);
		myButton5.setFocusable(false);
		myButton6.setFocusable(false);
		myButton7.setFocusable(false);
		myButton8.setFocusable(false);
		myButton9.setFocusable(false);
		myButton10.setFocusable(false);
		myButton11.setFocusable(false);
		myButton12.setFocusable(false);
		myButton13.setFocusable(false);
		myButton14.setFocusable(false);
		myButton15.setFocusable(false);
		myButton16.setFocusable(false);
		myButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myButton2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myButton3.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myButton4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		myButton5.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton6.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton7.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton8.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton9.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton10.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton11.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton12.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton13.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton14.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton15.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton16.setFont(new Font("Segoe UI", Font.BOLD, 23));
		myButton.setBounds(0, 300, 250, 150);
		myButton2.setBounds(0, 450, 250, 150);
		myButton3.setBounds(0, 600, 250, 150);
		myButton4.setBounds(15, 800, 220, 60);
		myButton5.setBounds(80, 320, 250, 150);
		myButton6.setBounds(420, 320, 250, 150);
		myButton7.setBounds(750, 320, 250, 150);
		myButton8.setBounds(80, 600, 250, 150);
		myButton9.setBounds(420, 600, 250, 150);
		myButton10.setBounds(750, 600, 250, 150);
		myButton11.setBounds(80, 320, 250, 150);
		myButton12.setBounds(80, 500, 250, 150);
		myButton13.setBounds(80, 680, 250, 150);
		myButton14.setBounds(80, 320, 250, 150);
		myButton15.setBounds(80, 500, 250, 150);
		myButton16.setBounds(80, 680, 250, 150);
		myButton.setOpaque(true);
		myButton2.setOpaque(true);
		myButton3.setOpaque(true);
		myButton4.setOpaque(true);
		myButton5.setOpaque(true);
		myButton6.setOpaque(true);
		myButton7.setOpaque(true);
		myButton8.setOpaque(true);
		myButton9.setOpaque(true);
		myButton10.setOpaque(true);
		myButton11.setOpaque(true);
		myButton12.setOpaque(true);
		myButton13.setOpaque(true);
		myButton14.setOpaque(true);
		myButton15.setOpaque(true);
		myButton16.setOpaque(true);
		myButton.setForeground(Color.white);
		myButton2.setForeground(Color.white);
		myButton3.setForeground(Color.white);
		myButton4.setForeground(Color.white);
		myButton5.setForeground(new Color(0, 100, 0));
		myButton6.setForeground(new Color(178, 34, 34));
		myButton7.setForeground(new Color(0, 0, 139));
		myButton8.setForeground(new Color(0, 0, 139));
		myButton9.setForeground(new Color(255, 99, 71));
		myButton10.setForeground(new Color(0, 102, 102));
		myButton11.setForeground(new Color(0, 100, 0));
		myButton12.setForeground(new Color(178, 34, 34));
		myButton13.setForeground(new Color(0, 0, 139));
		myButton14.setForeground(new Color(0, 0, 139));
		myButton15.setForeground(new Color(255, 99, 71));
		myButton16.setForeground(new Color(0, 102, 102));
		myButton.setBackground(new Color(0, 26, 51));
		myButton2.setBackground(new Color(0, 26, 51));
		myButton3.setBackground(new Color(0, 26, 51));
		myButton4.setBackground(new Color(0, 26, 51));
		myButton5.setBackground(new Color(255, 255, 255));
		myButton6.setBackground(new Color(255, 255, 255));
		myButton7.setBackground(new Color(255, 255, 255));
		myButton8.setBackground(new Color(255, 255, 255));
		myButton9.setBackground(new Color(255, 255, 255));
		myButton10.setBackground(new Color(255, 255, 255));
		myButton11.setBackground(new Color(255, 255, 255));
		myButton12.setBackground(new Color(255, 255, 255));
		myButton13.setBackground(new Color(255, 255, 255));
		myButton14.setBackground(new Color(255, 255, 255));
		myButton15.setBackground(new Color(255, 255, 255));
		myButton16.setBackground(new Color(255, 255, 255));
		myButton.setBorder(BorderFactory.createEtchedBorder(0));
		myButton2.setBorder(BorderFactory.createEtchedBorder(0));
		myButton3.setBorder(BorderFactory.createEtchedBorder(0));
		myButton4.setBorder(BorderFactory.createEtchedBorder(1));
		myButton5.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton6.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton7.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton8.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton9.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton10.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton11.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton12.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton13.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton14.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton15.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));
		myButton16.setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, new Color(0, 34, 102)));		
		myButton.setIcon(myIcon3);
		myButton2.setIcon(myIcon4);
		myButton3.setIcon(myIcon5);
		myButton5.setIcon(myIcon7);
		myButton6.setIcon(myIcon8);
		myButton7.setIcon(myIcon9);
		myButton8.setIcon(myIcon10);
		myButton9.setIcon(myIcon11);
		myButton10.setIcon(myIcon12);
		myButton11.setIcon(myIcon7);
		myButton12.setIcon(myIcon8);
		myButton13.setIcon(myIcon9);
		myButton14.setIcon(myIcon10);
		myButton15.setIcon(myIcon11);
		myButton16.setIcon(myIcon12);
		myButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton.setIconTextGap(10);
		myButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton2.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton2.setIconTextGap(10);
		myButton3.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton3.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton3.setIconTextGap(0);
		myButton5.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton5.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton5.setIconTextGap(10);
		myButton6.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton6.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton6.setIconTextGap(10);
		myButton7.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton7.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton8.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton8.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton8.setIconTextGap(10);
		myButton9.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton9.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton9.setIconTextGap(10);
		myButton10.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton10.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton10.setIconTextGap(10);
		myButton11.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton11.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton11.setIconTextGap(10);
		myButton12.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton12.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton12.setIconTextGap(10);
		myButton13.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton13.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton13.setIconTextGap(10);
		myButton14.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton14.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton14.setIconTextGap(10);
		myButton15.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton15.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton15.setIconTextGap(10);
		myButton16.setVerticalTextPosition(SwingConstants.BOTTOM);
		myButton16.setHorizontalTextPosition(SwingConstants.CENTER);
		myButton16.setIconTextGap(10);
		myButton.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		myButton4.addActionListener(this);
		myButton5.addActionListener(this);
		myButton6.addActionListener(this);
		myButton7.addActionListener(this);
		myButton8.addActionListener(this);
		myButton9.addActionListener(this);
		myButton10.addActionListener(this);
		myButton11.addActionListener(this);
		myButton12.addActionListener(this);
		myButton13.addActionListener(this);
		myButton14.addActionListener(this);
		myButton15.addActionListener(this);
		myButton16.addActionListener(this);


	}


	public void callSeparator()
	{
		mySeparator.setBounds(90, 180, 840, 350);
		mySeparator2.setBounds(90, 180, 840, 350);
		mySeparator3.setBounds(90, 180, 840, 350);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		myStatPanel.setVisible(false);
		myOrderPanel.setVisible(false);
		myMainPanel.setVisible(false);
		myContactPanel.setVisible(true);
		myLabel5.setVisible(false);
		myLabel6.setVisible(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == myButton)
		{
			myStatPanel.setVisible(false);
			myOrderPanel.setVisible(false);
			myContactPanel.setVisible(false);
			myMainPanel.setVisible(true);
			myLabel5.setVisible(true);
			myLabel6.setVisible(true);

		}

		else if(e.getSource() == myButton2)
		{
			myMainPanel.setVisible(false);
			myOrderPanel.setVisible(false);
			myContactPanel.setVisible(false);
			myStatPanel.setVisible(true);
			myLabel5.setVisible(true);
			myLabel6.setVisible(true);

		}

		else if (e.getSource() == myButton3)
		{
			myMainPanel.setVisible(false);
			myStatPanel.setVisible(false);
			myContactPanel.setVisible(false);
			myOrderPanel.setVisible(true);
			myLabel5.setVisible(true);
			myLabel6.setVisible(true);

		}

		else if(e.getSource() == myButton4)
		{
			myFrame.dispose();
			new Login();
		}
		
		else if (e.getSource() == myButton5 || e.getSource() == myButton6 || e.getSource() == myButton7
				|| e.getSource() == myButton8 || e.getSource() == myButton9 || e.getSource() == myButton10
				|| e.getSource() == myButton11 || e.getSource() == myButton12 || e.getSource() == myButton13
				|| e.getSource() == myButton14 || e.getSource() == myButton15 || e.getSource() == myButton16)
		{
			myStatPanel.setVisible(false);
			myOrderPanel.setVisible(false);
			myMainPanel.setVisible(false);
			myContactPanel.setVisible(true);
			myLabel5.setVisible(false);
			myLabel6.setVisible(false);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		// Not needed
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// Not needed
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// Not needed
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// Not needed
		
	}


}
